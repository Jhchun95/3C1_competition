
public class Second {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 10; // 원시자료형(정수형)
		String str = "Hello"; // reference형(문자열)
		
		System.out.println(number);
		System.out.println(str);
		
		int number2 = number;
		String str2 = str; // new String("Hello")
		System.out.println(number2);
		System.out.println(str2);
		
		if(number2 == number) {
			System.out.println( "number == number2");
		} else {
			System.out.println( "number != number2");
		}
		
		if(str2 == str) { // str2.equals(str) -> str2 와 str의 내용을 비교한다.
			System.out.println("str == str");
		} else {
			System.out.println("str != str2");
		}
		
	}

}
