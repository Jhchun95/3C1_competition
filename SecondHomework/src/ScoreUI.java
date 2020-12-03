import java.util.Scanner;

public class ScoreUI {

	private float avg;
    private float sum;
    private String name;
    private int[] score;
    private String[] subject;
    private float grade;
    int reset;
 
    // ������
    ScoreUI() { // ������ �Ѱ��� ��� ����
        name = null;
        score = new int[3];
        avg = 0;
        sum = 0;
        reset=0;
 
        subject = new String[3];
        subject[0] = "Subject1";
        subject[1] = "Subject2";
        subject[2] = "Subject3";
        
        grade = 0;
    }
 
    public float getGrade() {
    	if( getSum() / score.length >= 90) {
			System.out.println("excellent");
		} else if( getSum() / score.length < 60 ) {
			System.out.println("fail");
		} else
			System.out.println("");
    	
		return grade;
    	
	}

	public void setGrade(float grade) {
		this.grade = grade;
	}

	public void setName(String name) { // �̸� �Է�
        this.name = name;
    }
 
    public String getName() { // �̸� ��ȯ
        return name;
    }
 
    public void setScore(int i) { // ��������
        this.score[i] = score[i];
    }
 
    public int[] getScore() { // ���� ��ȯ
        return score;
    }
 
    int length() { // private�� ���� �迭 ���� ��ȯ �޼ҵ� ����        
    	return score.length;
    }
 
    String sub(int i) { // ���� ��ȯ
        return subject[i];
    }
 
    public float getSum() {
        return sum;
    }
 
    public void setSum(float sum) {
        this.sum = sum;
    }
 
    public float getAvg() {
        return getSum() / score.length;
    }
 
    public void inputStuData(Scanner sc) {       // ���ο��� �Է��� ���� ������ ����
        System.out.println(" �̸��� �Է��Ͻÿ� : ");
        name = sc.next();
 
        for (int i = 0; i < length(); i++) { 
            System.out.println(sub(i) + " ������ �Է��Ͻÿ� : ");
            score[i] = sc.nextInt();
           
        }
 
        for (int i = 0; i < length(); i++) {
            reset += score[i];
            sum = reset;
        }
        reset = 0;
        
        System.out.println("Name  : " + name);
        for (int i = 0; i < length(); i++) {
            System.out.println(sub(i) + ": " + score[i]);
        }
        System.out.println("total  : " + getSum());
        System.out.println("average : " + getAvg());
        System.out.println(getGrade());
        
    }
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ScoreUI person = new ScoreUI(); //��ü ����
        person.inputStuData(sc);
        
    }
}
