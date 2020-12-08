
public class GoodsStock {
	String goodsCode;
	int stockNum;
	GoodsStock(String code, int num)
	{
		goodsCode = code;
		stockNum = num;
	}

	void addStock(int amount)
	{
		stockNum += amount;
	}

	int subtractStock(int amount)
	{
		if(stockNum < amount)
			return 0;
			stockNum -= amount;
			return amount;
	}
}
