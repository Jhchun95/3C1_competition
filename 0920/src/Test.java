
public class Test {
	public static void main(String args[])
	{
		CreditCard money = new CreditCard("����", 12345, 300000);
		System.out.println("�̸�:"+ money.creditname );
		System.out.println("��ȣ:"+ money.creditnumber );
		System.out.println("����Ʈ:"+ money.creditpoint );
		money.addPoint(300000);
		System.out.println("�̸�:"+ money.creditname);
		System.out.println("��ȣ:"+ money.creditnumber );
		System.out.println("����Ʈ:"+ money.creditpoint );
	}
}
