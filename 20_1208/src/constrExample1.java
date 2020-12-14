
public class constrExample1 {
	public static void main(String args[])
	{
		GoodsStock pen = new GoodsStock("20141040 전준혁", 350);
		System.out.println("상품코드 :" + pen.goodsCode);
		System.out.println("재고수량 :" + pen.stockNum);
		pen.addStock(1000);
		System.out.println("상품코드:" + pen.goodsCode);
		System.out.println("재고수량:" + pen.stockNum);
		pen.subtractStock(132);
		System.out.println("상품코드:" + pen.goodsCode);
		System.out.println("재고수량:" + pen.stockNum);
	}
}
