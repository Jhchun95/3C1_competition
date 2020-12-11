
public class MethodOverloading {
	public static void main(String args[]) {
		calculator obj;
		obj = new calculator("첫번째 값","두번째 값","결과");
		printcalculator(obj);
		obj.update("정수","정수","정수");
		printcalculator(obj);
		obj.update("실수","실수");
		printcalculator(obj);
		obj.update("실수");
		printcalculator(obj);
	}
	static void printcalculator(calculator obj) {
		System.out.println(obj.I + " + " + obj.D + " = " + obj.R);
		System.out.println();
	}
}
