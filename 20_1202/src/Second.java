
public class Second {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 10; // 원시자료형(정수형)
		String str = "Hello"; // reference형(문자열)
		
		// 출력
		System.out.println(number);
		System.out.println(str);
		
		// 변수 선언
		int number2 = number;
		String str2 = str; // new String("Hello")
		
		// 출력
		System.out.println(number2);
		System.out.println(str2);
		
		// if문
		if(number2 == number) {
			System.out.println( "number == number2");
		} else {
			System.out.println( "number != number2");
		}
		
		// string문은 equals로 써야하는데 어떻게 나오는지 알기 위해 선언한 것.
		if(str2 == str) { // str2.equals(str) -> str2 와 str의 내용을 비교한다.
			System.out.println("str == str");
		} else {
			System.out.println("str != str2");
		}
		
	}

}
