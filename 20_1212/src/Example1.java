
public class Example1 {
	public static void main(String args[]) {
		StringBuffer obj1;
		obj1 = new StringBuffer("Hey, Java");
		System.out.println(obj1);
		obj1.replace(1,3, "I");
		System.out.println(obj1);
	}
}
