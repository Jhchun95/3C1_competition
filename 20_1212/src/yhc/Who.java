package yhc;

import java.util.*; //��ĳ�� Ŭ������ ����ϱ����� import�� �ۼ�
public class Who {
   public static void main(String []args){
      
      Scanner sc = new Scanner(System.in); //��ĳ�� ��ü ����
      int year=0; /// year ���� ���� ������ �ʱ�ȭ
      
      System.out.println("������ �Է��Ͻÿ�"); /// ������ �Է��Ҽ� �ֵ��� ����ϵ���  ���ڸ� �ް� ����Ҽ��ֵ����Ѵ�
      year=sc.nextInt();
      
      if(year%4==0) 
    	  System.out.println("�����Դϴ�"); //�Է��� year�� 4�� �������� ������ �������� ������ ��µǵ��� �Ѵ�
      else if(year%100==0) 
    	  System.out.println("����Դϴ�"); // ���� 4�� ������ �������� ������  100���ε� ������ �������� �ش� ������ �����̾ƴ϶� ����� ��µǵ��� �Ѵ�
      else if(year%400==0) 
    	  System.out.println("�����Դϴ�"); //���� �Է��� year�� 100���� ������ ��������,  400���ε� ������ �������� ����̾ƴ϶� ������ ��µǵ��� �Ѵ�
      else System.out.println("year�� " +"����Դϴ�"); //�Է��� year�� 4�� ����������� �ʴ� �����Ͻ� ����� ����Ѵ�
      
      sc.close();
   }
   

}