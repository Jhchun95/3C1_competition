
public class ConstructorTest {
	public static void main(String args[]){
		Constructor cons = new Constructor(450, 38.0, 0.03); // �� ����
		System.out.println("�⺻ ��� :" + cons.basiccost ); // �⺻��� �� ���
		System.out.println("�����뷮�� ��� :" + cons.eleccost); // �����뷮�� �� ��� ���
		System.out.println("���� :" + cons.elecfate); // ���� �� ���
		System.out.println();
		cons.electroniccost(500); // 500 ���� �����Ѵ�.
		cons.fax(); // ���� ���ϴ� ��
		System.out.println("������ :" + cons.electroniccost); // ���� ��ݰ� ���
		System.out.println("���� :" + cons.fax); // ���� �� ���
		double total = cons.electroniccost + cons.fax; // �� ����� ����
		System.out.println("�� �����:" + total); // �� ����� �� ���
	}
}
