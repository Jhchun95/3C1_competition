
public class Ex_IO_02 {
	public static void main(String args[]) throws java.io.IOException {
		System.out.print("�Է�1 = ");
		char aa = (char)System.in.read();
		System.out.print("�Է�2 = ");
		System.in.read();
		System.in.read();
		int bb = System.in.read() - 48;
		System.out.println("�Էµ� ���ڴ� = " + aa + "�Դϴ�.");
		System.out.println("�Էµ� ���ڴ� = " + bb + "�Դϴ�.");
	}
}
