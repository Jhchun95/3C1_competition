
// �а��� �����ؾ��ϴ� ���� ���� ������ �ؾ��Ѵ�.
// ������ �ҽ��ڵ带 ���� ��ȯ�ϴ°� �߿��ϴ�.

public class ComputerStudent extends Student {
	public static final int COMPUTER_SUBJECT = 2;
	
	private int[] computerSubjects = new int[COMPUTER_SUBJECT]; 

	public ComputerStudent() {}
	public ComputerStudent( String name, String departmentName, 	
					int[] subjects, int [] computerSubjects ) { // superclass�� ������ ����ؾ��Ѵ�.
		// String name, String departmentName, int[] subjects superclass�� �����ϴ� �κ�
		super( name, departmentName, subjects );
		System.arraycopy( computerSubjects, 0, this.computerSubjects, 0, computerSubjects.length );
		calculateTotal();
		
	}
	
	protected void calculateTotal() { // ����� protected ��� private�� �����ص� ��.
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