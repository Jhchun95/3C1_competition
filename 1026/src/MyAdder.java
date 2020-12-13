public class MyAdder implements AdderInterface{
	
	public int add(int x, int y)
	{
		return x + y;
	}
	
	public int add(int n)
	{
		int sum = 0;
		for(int i=1 ; i<=n ; i++)
			sum += i;
		return sum;
	}
}