
public class Ex_IO_02 {
	public static void main(String args[]) throws java.io.IOException {
		System.out.print("입력1 = ");
		char aa = (char)System.in.read();
		System.out.print("입력2 = ");
		System.in.read();
		System.in.read();
		int bb = System.in.read() - 48;
		System.out.println("입력된 문자는 = " + aa + "입니다.");
		System.out.println("입력된 슷자는 = " + bb + "입니다.");
	}
}
