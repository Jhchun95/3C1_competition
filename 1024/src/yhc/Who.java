package yhc;

import java.util.*; //스캐너 클래스를 사용하기위해 import를 작성
public class Who {
   public static void main(String []args){
      
      Scanner sc = new Scanner(System.in); //스캐너 객체 생성
      int year=0; /// year 연도 변수 설정및 초기화
      
      System.out.println("연도를 입력하시오"); /// 연도를 입력할수 있도록 출력하도록  숫자를 받고 출력할수있도롟한다
      year=sc.nextInt();
      
      if(year%4==0) 
    	  System.out.println("윤년입니다"); //입력한 year를 4로 나눴을때 나누어 떨어지면 윤년이 출력되도록 한다
      else if(year%100==0) 
    	  System.out.println("평년입니다"); // 그중 4로 나누어 떨어지는 연도가  100으로도 나누어 떨어지면 해당 연도는 윤년이아니라 평년이 출력되도록 한다
      else if(year%400==0) 
    	  System.out.println("윤년입니다"); //그중 입력한 year가 100으로 나누어 떨어질때,  400으로도 나누어 떨어지면 평년이아니라 윤년이 출력되도록 한다
      else System.out.println("year은 " +"평년입니다"); //입력한 year가 4로 나누어떨어지지 않는 연도일시 편년을 출력한다
      
      sc.close();
   }
   

}