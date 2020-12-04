import java.util.Scanner;

public class ScoreUICompile extends ScoreUI {

	private int num; // �л���
    private ScoreUI[] students; // ScoreV1�� �迭 ��� 
 
    // ������ �ʱ�ȭ
    public ScoreUICompile(int num) {
        this.num = num;
        students = new ScoreUI[this.num];    //��ü ����
    }
 
    // num getter&setter
    public int getNum() {
        return num;
    }
 
    public void setNum(int num) {
        this.num = num;
    }
 
    //�Է¹��� ��ŭ�� students ��ü ����
    void CrStudent(Scanner sc) {
        for( int i = 0; i<num; i++) {
            students[i] = new ScoreUI();
            inputStuData(sc);
        }
        
    }
 
 
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);    //��ü����
        System.out.println("�л� ���� �Է��ϼ��� : ");
        ScoreUICompile students = new ScoreUICompile(sc.nextInt()); // ��ü ������ ���ÿ� �л��� �Է¹ޱ�
        students.CrStudent(sc);
 
    }
    
}
