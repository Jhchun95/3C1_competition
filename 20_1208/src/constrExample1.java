
public class constrExample1 {
	public static void main(String args[])
	{
		GoodsStock pen = new GoodsStock("20141040 ������", 350);
		System.out.println("��ǰ�ڵ� :" + pen.goodsCode);
		System.out.println("������ :" + pen.stockNum);
		pen.addStock(1000);
		System.out.println("��ǰ�ڵ�:" + pen.goodsCode);
		System.out.println("������:" + pen.stockNum);
		pen.subtractStock(132);
		System.out.println("��ǰ�ڵ�:" + pen.goodsCode);
		System.out.println("������:" + pen.stockNum);
	}
}
