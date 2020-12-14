
public class CreditCard {
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
