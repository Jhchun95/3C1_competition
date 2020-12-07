
// 학과를 관리해야하는 것은 따로 관리를 해야한다.
// 가능한 소스코드를 적게 변환하는게 중요하다.

public class ComputerStudent extends Student {
	public static final int COMPUTER_SUBJECT = 2;
	
	private int[] computerSubjects = new int[COMPUTER_SUBJECT]; 

	public ComputerStudent() {}
	public ComputerStudent( String name, String departmentName, 	
					int[] subjects, int [] computerSubjects ) { // superclass의 생성도 고려해야한다.
		// String name, String departmentName, int[] subjects superclass에 전달하는 부분
		super( name, departmentName, subjects );
		System.arraycopy( computerSubjects, 0, this.computerSubjects, 0, computerSubjects.length );
		calculateTotal();
		
	}
	
	protected void calculateTotal() { // 여기는 protected 대신 private로 선언해도 됨.
		super.calculateTotal();
		
		int total = getTotal();
		double average;
		String grade;
		
		for ( int subject : computerSubjects ) {
			total += subject;
		}
		setTotal( total );
		
		average = ( double )total / ( COMMON_SUBJECT + COMPUTER_SUBJECT );
		setAverage( average );
		
		if ( average >= EXCELLENT ) {
			grade = "Excellent";
		} else if ( average < FAIL ) {
			grade = "Fail";
		} else {
			grade = "";
		}
		setGrade( grade );
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String str = super.toString();

		for ( int j = 0; j < COMPUTER_SUBJECT; ++j ) {
			str += computerSubjects[j] + " ";
		}		
		str += "    ";

		int[] subjects = getSubjects(); 
		for ( int j = 0; j < COMMON_SUBJECT; ++j ) {
			str += subjects[j] + " ";
		}
		
		str += getTotal() + " ";
		str += getAverage() + " ";
		str += getGrade();
		str += "\n";
		
		return str;
	}
}