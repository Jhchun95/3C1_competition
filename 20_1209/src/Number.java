
public class Number {
	  int num[];
	  Number(int num[])
	  { //생성자이므로 클래스명과 동일하게 이름을 써주어야 됩니다
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
