
public class Number {
	  int num[];
	  Number(int num[])
	  { //�������̹Ƿ� Ŭ������� �����ϰ� �̸��� ���־�� �˴ϴ�
	   this.num = num;
	   }
	  int getTotal()
	  {
	   int total=0;
	   for(int i=0; i<num.length; i++)
	    total +=num[i];
	   return total;
	   }
	  
	  int getAverage()
	  {
	   int average;
	   average=getTotal()/num.length;
	   return average;
	  }
}
