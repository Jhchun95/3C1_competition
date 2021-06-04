import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Forth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Dish dish = new Dish();
		// 임시 inner class 방식으로 Thread 동작
		new Thread(new Customer(dish)).start();
		new Thread(new Cook(dish)).start();
		
		
		
/**		SharedCar car = new SharedCar();
		
		new CarThread(car, "Hong", "Seoul").start();
		new CarThread(car, "Kim", "Busan").start();
		new CarThread(car, "Lee", "Incheon").start();
**/
	/**
		MyClass myclass = new MyClass("thread1");
		myclass.start();
		
		MyClass2 myclass2 = new MyClass2("thread2");
		Thread th2 = new Thread(myclass2);
		th2.setDaemon(true);
		th2.start();
		
		Worker worker1 = new Worker(new Sum(),1,1);
		//worker1.start();
		
		Worker worker2 = new Worker(new Sum(),2,2);
		//worker2.start();
		
		Worker worker3 = new Worker(new Sum(),3,3);

		ExecutorService executorService = Executors.newFixedThreadPool(2);
		executorService.execute(worker1);
		executorService.execute(worker2);
		executorService.execute(worker3);
		executorService.isShutdown();
		try {
			if(!executorService.awaitTermination(5, TimeUnit.MINUTES)) {
				executorService.shutdownNow();
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
			executorService.shutdown();
		}
		
		for(int i =1; i<= 10; i++) {
			System.out.println("main thread - " + i);
			try {
				Thread.sleep(2);
			} catch ( Exception e) {}
		} **/
	}

}

class Dish {
	private boolean empty = true;
	public Dish() {}
	public boolean isEmpty() {
		return empty;
	}
	public void setEmpty(boolean empty) {
		this.empty = empty;
	}
}

class Cook implements Runnable { // 생산자 Thread
	private final Dish dish;
	public Cook(Dish dish) {
		this.dish = dish;
	}
	private void cook(int i) throws InterruptedException {
		synchronized (dish) {
			while(!dish.isEmpty() ) { // 공유 자원 비었는지 확인
				dish.wait();
			}
			dish.setEmpty(false);
			System.out.println(i+ "번째 음식 완료!!");
			dish.notify();  // 소비자 Thread 에게 통보
		}
	}
	public void run( ) {
		for(int i=1; i<=5; i++) {
			try {
				cook(i);
				Thread.sleep(50);
			} catch (InterruptedException e ) {}
		}
	}
}

class Customer implements Runnable { // 생산자 Thread
	private final Dish dish;
	public Customer(Dish dish) {
		this.dish = dish;
	}
	private void cook(int i) throws InterruptedException {
		synchronized (dish) {
			while(!dish.isEmpty() ) { // 공유 자원 비었는지 확인
				dish.wait();
			}
			dish.setEmpty(false);
			System.out.println(i+ "번째 음식 완료!!");
			dish.notify();  // 소비자 Thread 에게 통보
		}
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
}

class MyClass extends Thread {
	
	private static final String MSG_TEMPLATE = "출력 중 [%s][%d회째]";
	private final String threadName;
	
	public MyClass (String threadName) {
		this.threadName = threadName;
	}
	
	@Override
	public void run() {
		
		for(int i = 1; i<= 100; ++i) {
			System.out.println(String.format(MSG_TEMPLATE, threadName, i));
		}
	}
}

/** class Myclass2 implements Runnable {
	private static final String MSG_TEMPLATE = "출력 중 [%s][%d회째]";
	private final String threadName2;
	
	public MyClass2 (String threadName2) {
		this.threadName2 = threadName2;
	}
	
	@Override
	public void run() {
		
		for(int i = 1; i<= 100; ++i) {
			System.out.println(String.format(MSG_TEMPLATE, threadName2, i));
		}
	}
} **/

class SharedCar {
	public SharedCar() {}
	public synchronized void drvie(String name, String where) {
		System.out.println( "[" + name + "] 차량 탑승");
		for(int i=1; i<= 5; ++i) {
			System.out.println("[" + name + "] 차량 운행중 !!!");
		}
		System.out.println("[" + name + "]" + where + "에 도착");
	}
}

/* synchronized( 공유 객체 ) {
*		code block
*	}
*
*/

// Thread를 상속받는 CarThread
class CarThread extends Thread {
	private SharedCar car;
	private String who;
	private String where;
	
	public CarThread(SharedCar car, String who, String where) {
		this.car = car;
		this.who = who;
		this.where = where;
	}
	public void run() {
		car.drvie(who, where);
	}
	
}
// Sum 클래스
class Sum {
	public static final int MAX = 100;
	public int sum = 0;
	public Sum() {}
	public void calc(int start, int step) {
		try {
			for(int i= start; i <= 100; i+= step) {
				sum += i;
			}
			System.out.printf("%2d ~ %3d (%2d간격) 합 : %5d\n", start, MAX, step);
		} catch(Exception e ) {}
	}
}
// 쓰레드를 상속받는 worker 클래스
class Worker extends Thread {
	private Sum sum;
	private int start, step;
	// 생성자 생성
	public Worker(Sum sum, int start, int step) {
		this.sum = sum;
		this.start = start;
		this.step = step;
	}
	public void run() {
		sum.calc(start, step);
	}
}

// 쓰레드 클래스
class TotalThread extends Thread {
	public static final int MAX = 100;
	private int total;
	public TotalThread() {}
	public int getTotal() {
		return total;
	}
	public void run( ) {
		synchronized(this) {
			for(int i=1; i<= MAX; i++) {
				total += 1;
			}
			notify();
		}
	}
}

/**new Thread(new Runnable() {
	
	@Override
	public void run() {
		final String MSG_TEMPLATE = "출력 중 [%s][%d회째]";
		for(int i=i; i<= 100; i++) {
			System.out.println(String.format(MSG_TEMPLATE, "thread3", i));
		}
	}
} ).start();
System.out.println("stop main thread..."); **/
