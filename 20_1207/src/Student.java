
// private ���� Ŭ�������� �����ϴ� ���� ���ڴ�.
// protected �� ����ϸ� ������ �� �� �ִ�. �ܺο��� ������ �� �ִ� interface , ��� ���迡���� ����ϰڴ�.
 
public abstract class Student { // ������ ��� �������� ����ؾ��Ѵ�.
	public static final int COMMON_SUBJECT = 3;
	public static final int LOW_SCORE = 0;
	public static final int HIGH_SCORE = 100;
	public static final int EXCELLENT = 90;
	public static final int FAIL = 60;
	
	private String name;
	private String departmentName;
	private int[] subjects = new int[COMMON_SUBJECT]; 
	private int total;
	private double average;
	private String grade;
	
	public Student() {}
	public Student( String name, String departmentName, int[] subjects ) {
		this.name = name;
		this.departmentName = departmentName;
		System.arraycopy( subjects, 0, this.subjects, 0, subjects.length );
	}
	
	public int[] getSubjects() {
		return subjects;
	}
	
	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}
	
	public double getAverage() {
		return average;
	}
	
	public void setAverage(double average) {
		this.average = average;
	}
	
	public void setGrade(String grade) {
		this.grade = grade;
	}
	
	public String getGrade() {
		return grade;
	}
	
	protected void calculateTotal() {
		for ( int subject : subjects ) {
			total += subject;
		}
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String str = name + "\t";
		str += departmentName + "\t";
		
		return str;
	}	
}
