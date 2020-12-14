
public class calculator {
	String I;
	String D;
	String R;

	calculator(String I, String D, String R)
	{
		this.I = I;
		this.D = D;
		this.R = R;
	}
	void update(String I, String D, String R)
	{
		this.I = I;
		this.D = D;
		this.R = R;
	}
	void update(String D, String R)
	{
		this.D = D;
		this.R = R;
	}
	void update(String I)
	{
		this.I = I;	
	}
}
