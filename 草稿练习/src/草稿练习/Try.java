package �ݸ���ϰ;

import java.util.Scanner;

public class Try {
    /*
     *    try{}    catch(Exception  mingZi) {System.out.println(mingZi.getMessage());}  finally{}
     *    ���ܳ����쳣  
     */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{    //  try ���ܳ����쳣
		  Scanner input=new Scanner(System.in);
		  System.out.println("�������һ������");
		  int a=input.nextInt();
   	      System.out.println("������ڶ�������");
   	      int b=input.nextInt();
   	      System.out.println(a/b);
		}catch(Exception e){//����      �쳣 exception   �����
		//�����쳣	
			System.out.println(e.getMessage());
			                   //�����Ϣ
			e.printStackTrace();
			//��ô����λ��
		}finally{//��û���쳣�������
			System.out.println("�������");
		}
	}

}
