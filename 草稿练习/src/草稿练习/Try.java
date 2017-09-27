package 草稿练习;

import java.util.Scanner;

public class Try {
    /*
     *    try{}    catch(Exception  mingZi) {System.out.println(mingZi.getMessage());}  finally{}
     *    可能出现异常  
     */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{    //  try 可能出现异常
		  Scanner input=new Scanner(System.in);
		  System.out.println("请输入第一个数字");
		  int a=input.nextInt();
   	      System.out.println("请输入第二个数字");
   	      int b=input.nextInt();
   	      System.out.println(a/b);
		}catch(Exception e){//出现      异常 exception   后输出
		//捕获异常	
			System.out.println(e.getMessage());
			                   //获得信息
			e.printStackTrace();
			//获得错误的位置
		}finally{//有没有异常都会输出
			System.out.println("程序结束");
		}
	}

}
