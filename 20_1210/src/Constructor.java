
public class Constructor {
	double electroniccost, fax; // �Ǽ����� �����ݰ� ����
	double basiccost,eleccost,elecfate; // �Ǽ����� �⺻���, �����뷮�� ���, ������ ����
	Constructor(double basiccost, double eleccost, double elecfate)
	{
		this.basiccost = basiccost; // �ʵ尪 ����
		this.eleccost = eleccost;
		this.elecfate = elecfate;
	}
	void electroniccost(double cost) // ������
	{
		electroniccost = basiccost + (cost*eleccost) + fax; 
		// ������ : �⺻��� + (��뷮 * �����뷮�� ���) + ����
	}
	void fax() // ����
	{
		fax = electroniccost*elecfate; // ������ ���ϴ� ���� : ������ * ����
	}
}
