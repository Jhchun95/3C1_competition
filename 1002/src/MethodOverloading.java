
public class MethodOverloading {
	public static void main(String args[]) {
		calculator obj;
		obj = new calculator("ù��° ��","�ι�° ��","���");
		printcalculator(obj);
		obj.update("����","����","����");
		printcalculator(obj);
		obj.update("�Ǽ�","�Ǽ�");
		printcalculator(obj);
		obj.update("�Ǽ�");
		printcalculator(obj);
	}
	static void printcalculator(calculator obj) {
		System.out.println(obj.I + " + " + obj.D + " = " + obj.R);
		System.out.println();
	}
}
