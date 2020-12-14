import java.util.Scanner;

public class ScoreUI {

	private float avg;
    private float sum;
    private String name;
    private int[] score;
    private String[] subject;
    private float grade;
    int reset;
 
    // 생성자
    ScoreUI() { // 생성자 한개에 모두 실행
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

	public void setName(String name) { // 이름 입력
        this.name = name;
    }
 
    public String getName() { // 이름 반환
        return name;
    }
 
    public void setScore(int i) { // 점수지정
        this.score[i] = score[i];
    }
 
    public int[] getScore() { // 점수 반환
        return score;
    }
 
    int length() { // private로 인해 배열 길이 반환 메소드 생성        
    	return score.length;
    }
 
    String sub(int i) { // 과목 반환
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
 
    public void inputStuData(Scanner sc) {       // 메인에서 입력을 받은 값으로 진행
        System.out.println(" 이름을 입력하시오 : ");
        name = sc.next();
 
        for (int i = 0; i < length(); i++) { 
            System.out.println(sub(i) + " 점수를 입력하시오 : ");
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
        ScoreUI person = new ScoreUI(); //객체 생성
        person.inputStuData(sc);
        
    }
}
