
public class ElectronicStudent extends Student {
public static final int ELECTRONIC_SUBJECT = 3;
	
	private int[] electronicSubjects = new int[ELECTRONIC_SUBJECT]; 

	public ElectronicStudent() {}
	public ElectronicStudent( String name, String departmentName, 
					int[] subjects, int [] electronicSubjects ) {
		super( name, departmentName, subjects );
		System.arraycopy( electronicSubjects, 0, this.electronicSubjects, 0, electronicSubjects.length );
		calculateTotal();
		
	}
	
	protected void calculateTotal() {
		super.calculateTotal();
		
		int total = getTotal();
		double average;
		String grade;
		
		for ( int subject : electronicSubjects ) {
			total += subject;
		}
		setTotal( total );
		
		average = ( double )total / ( COMMON_SUBJECT + ELECTRONIC_SUBJECT );
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

		for ( int j = 0; j < ELECTRONIC_SUBJECT; ++j ) {
			str += electronicSubjects[j] + " ";
		}		
		str += " ";

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
