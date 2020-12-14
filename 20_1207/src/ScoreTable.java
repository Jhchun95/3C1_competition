

import java.util.ArrayList;

public class ScoreTable {
	public static int count;
	
	public ArrayList<Student> students = new ArrayList<>();
	
	ScoreTable() {}
	
	public void registStudent( Student student ) {
		students.add( student );
		++count;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String str = new String();
		
		for ( Student student : students ) {
			str += student;
		}
		
		return str;
	}
}
