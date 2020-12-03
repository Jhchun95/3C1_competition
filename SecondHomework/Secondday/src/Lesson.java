
// 10개의 정수를 입력받아 평균을 구하고 -> 입력/처리 일치
// 평균과 각 값과의 차이를 계산하는 프로그램 작성 -> 입력/처리 불일치
public class Lesson {
	public static void main(String[] args) {
		
		int [] array1 = new int[] { 1,2,3};
		int [][] array2 = new int[][] { { 10, 20}, {30,40}};
		// array2는 reference 변수
		
		for( int i=0; i< array1.length; i++) {
			System.out.printf("%3d", array1[i]);
		}
		System.out.println("\n\n");
		for(int i=0; i< array2.length; i++) {
			for(int j=0; j < array2[i].length; ++j) {
				System.out.printf("%3d", array2[i][j]);
			}
			System.out.println();
		}
		
	}
}


