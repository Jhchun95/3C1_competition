
// 10���� ������ �Է¹޾� ����� ���ϰ� -> �Է�/ó�� ��ġ
// ��հ� �� ������ ���̸� ����ϴ� ���α׷� �ۼ� -> �Է�/ó�� ����ġ
public class Lesson {
	public static void main(String[] args) {
		
		int [] array1 = new int[] { 1,2,3};
		int [][] array2 = new int[][] { { 10, 20}, {30,40}};
		// array2�� reference ����
		
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


