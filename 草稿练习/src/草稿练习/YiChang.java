package �ݸ���ϰ;

import java.util.Scanner;

public class YiChang {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		@SuppressWarnings("resource")
		Scanner input=new Scanner(System.in);
		System.out.println("�������һ������");
         if(input.hasNextInt()){
        	
        	 int a=input.nextInt();
        	 System.out.println("������ڶ�������");
        	 int b=input.nextInt();
        	 if(b==0){
        		 System.err.println("0�������������������");
        		 System.exit(1);
        	 }else{
        		 System.out.println(a/b);
        	 }
         }else{
        	 System.err.println("����Ĳ�������  �������");
        	 System.exit(1);
         }
         
	}
}
