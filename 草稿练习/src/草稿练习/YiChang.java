package 草稿练习;

import java.util.Scanner;

public class YiChang {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		@SuppressWarnings("resource")
		Scanner input=new Scanner(System.in);
		System.out.println("请输入第一个数字");
         if(input.hasNextInt()){
        	
        	 int a=input.nextInt();
        	 System.out.println("请输入第二个数字");
        	 int b=input.nextInt();
        	 if(b==0){
        		 System.err.println("0不能做除数。程序结束");
        		 System.exit(1);
        	 }else{
        		 System.out.println(a/b);
        	 }
         }else{
        	 System.err.println("输入的不是整数  程序结束");
        	 System.exit(1);
         }
         
	}
}
