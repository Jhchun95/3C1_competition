
public class ConstructorTest {
	public static void main(String args[]){
		Constructor cons = new Constructor(450, 38.0, 0.03); // 값 대입
		System.out.println("기본 요금 :" + cons.basiccost ); // 기본요금 값 출력
		System.out.println("전기사용량당 요금 :" + cons.eleccost); // 전기사용량당 값 요금 출력
		System.out.println("세율 :" + cons.elecfate); // 세율 값 출력
		System.out.println();
		cons.electroniccost(500); // 500 값을 대입한다.
		cons.fax(); // 세금 구하는 식
		System.out.println("전기요금 :" + cons.electroniccost); // 전기 요금값 출력
		System.out.println("세금 :" + cons.fax); // 세금 값 출력
		double total = cons.electroniccost + cons.fax; // 총 사용요금 계산식
		System.out.println("총 사용요금:" + total); // 총 사용요금 값 출력
	}
}
