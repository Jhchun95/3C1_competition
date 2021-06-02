
public class CreditCard {
	// CreditCard 클래스 생성
	// 신용카드 숫자, 이름, point에 대한 것을 선언
	int creditnumber;
	String creditname;
	int creditpoint;
	CreditCard(String name, int num, int point)
	{
		creditnumber = num;
		creditname = name;
		creditpoint = point;
	}
	
	void addPoint(int usemoney)
	{
		creditpoint += usemoney*0.001;
	}
}
