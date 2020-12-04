import java.util.Scanner;

public class ScoreUICompile extends ScoreUI {

	private int num; // 학생수
    private ScoreUI[] students; // ScoreV1의 배열 사용 
 
    // 생성자 초기화
    public ScoreUICompile(int num) {
        this.num = num;
        students = new ScoreUI[this.num];    //객체 생성
    }
 
    // num getter&setter
    public int getNum() {
        return num;
    }
 
    public void setNum(int num) {
        this.num = num;
    }
 
    //입력받은 만큼의 students 객체 생성
    void CrStudent(Scanner sc) {
        for( int i = 0; i<num; i++) {
            students[i] = new ScoreUI();
            inputStuData(sc);
        }
        
    }
 
 
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);    //객체생성
        System.out.println("학생 수를 입력하세요 : ");
        ScoreUICompile students = new ScoreUICompile(sc.nextInt()); // 객체 생성과 동시에 학생수 입력받기
        students.CrStudent(sc);
 
    }
    
}
