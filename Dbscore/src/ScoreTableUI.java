import java.util.Scanner;

public class ScoreTableUI {
	public ScoreTable scoretable = new ScoreTable();
	
	ScoreTableUI() {}
	
	public void inputStudentInfo() {
		Scanner sc = new Scanner( System.in );
		int num = 0;
		String who;
		
		String name;
		String departmentName;
		int[] subjects = new int[Student.COMMON_SUBJECT];
		int[] computerSubjects = new int [ComputerStudent.COMPUTER_SUBJECT];
		int[] electronicSubjects = new int [ElectronicStudent.ELECTRONIC_SUBJECT];
		
		ComputerStudent computerStudent;
		ElectronicStudent electronicStudent;
		

		while ( num <=6 ) 
		{	
			System.out.println("1. 학과 등록   2. 학생 성적 등록   3. 학생 성적 조회   4. 성적 일람표 조회   5. 종료 ");
			num = sc.nextInt();
			switch(num)
			{
			case 1:
				System.out.print( "Input name : " );
				name = sc.next();
				System.out.print( "Input department name ( computer/electronic ) : " );
				departmentName = sc.next();
				while ( !departmentName.equals( "computer" ) && !departmentName.equals( "electronic" ) ) 
				{
					System.out.println( "Error : department name ( computer/electronic )" );
					System.out.print( "Input department name ( computer/electronic ) : " );
					departmentName = sc.next();				
				}
				break;
				
			case 2:
				if ( departmentName.equals( "computer" ) ) {
					for ( int j = 0; j < ComputerStudent.COMPUTER_SUBJECT; ++j ) {
						System.out.print( "Input " + departmentName + " subject[" + ( j + 1 ) + "] : " );
						computerSubjects[j] = sc.nextInt();
					}				
				} else if ( departmentName.equals( "electronic" ) ) {
					for ( int j = 0; j < ElectronicStudent.ELECTRONIC_SUBJECT; ++j ) {
						System.out.print( "Input " + departmentName + " subject[" + ( j + 1 ) + "] : " );
						electronicSubjects[j] = sc.nextInt();
					}								
				}
				
				for ( int j = 0; j < Student.COMMON_SUBJECT; ++j ) {
					System.out.print( "Input common subject[" + ( j + 1 ) + "] : " );
					subjects[j] = sc.nextInt();
				}
			
				if ( departmentName.equals( "computer" ) ) {
					computerStudent = new ComputerStudent( name, departmentName, 
							subjects, computerSubjects );
					scoretable.registStudent( computerStudent );
				} else if ( departmentName.equals( "electronic" ) ) {
					electronicStudent = new ElectronicStudent( name, departmentName, 
							subjects, electronicSubjects );
					scoretable.registStudent( electronicStudent );				
				}
				System.out.print( "Input name : " );
				name = sc.next();
				
				break;
				
			/**case 3:
				System.out.println("검색할 사람의 이름 : ");
				who = sc.nextInt();
				for ( Student student : who ) {
					who += student;
				}
				break;
				**/
			}
			System.out.println();
			
		}
			
	}
	
	public void printScoreTable() {
		System.out.print( scoretable );
	}
	
}
