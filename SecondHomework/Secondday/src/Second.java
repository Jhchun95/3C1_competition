
public class Second {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 10; // �����ڷ���(������)
		String str = "Hello"; // reference��(���ڿ�)
		
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
		
		if(str2 == str) { // str2.equals(str) -> str2 �� str�� ������ ���Ѵ�.
			System.out.println("str == str");
		} else {
			System.out.println("str != str2");
		}
		
	}

}
