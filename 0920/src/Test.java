
public class Test {
	public static void main(String args[])
	{
		CreditCard money = new CreditCard("준혁", 12345, 300000);
		System.out.println("이름:"+ money.creditname );
		System.out.println("번호:"+ money.creditnumber );
		System.out.println("포인트:"+ money.creditpoint );
		money.addPoint(300000);
		System.out.println("이름:"+ money.creditname);
		System.out.println("번호:"+ money.creditnumber );
		System.out.println("포인트:"+ money.creditpoint );
	}
}
