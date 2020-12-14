
public class Constructor {
	double electroniccost, fax; // 실수형의 전기요금과 세금
	double basiccost,eleccost,elecfate; // 실수형의 기본요금, 전기사용량당 요금, 세율을 선언
	Constructor(double basiccost, double eleccost, double elecfate)
	{
		this.basiccost = basiccost; // 필드값 선언
		this.eleccost = eleccost;
		this.elecfate = elecfate;
	}
	void electroniccost(double cost) // 전기요금
	{
		electroniccost = basiccost + (cost*eleccost) + fax; 
		// 전기요금 : 기본요금 + (사용량 * 전기사용량당 요금) + 세금
	}
	void fax() // 세금
	{
		fax = electroniccost*elecfate; // 세금을 구하는 공식 : 전기요금 * 세율
	}
}
