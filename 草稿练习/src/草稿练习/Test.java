package �ݸ���ϰ;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            String a="jdhgjd";
          System.out.println(a);
          String  c=new String();
          StringBuilder  b=new StringBuilder("hutianpeng");
          System.out.println(b);
          System.out.println(b.append("nihaoa"));
          /*int m=6;
          while (m>2){
        	  //  while ѭ��
          }
          do{
        	  // do whileѭ��
          }while(m>3);
          for(int n=1;n>0;n++){
        	  //fou ѭ��
          }*/
          int []q={1,2,6,6,54,45};
          for(int r:q){//forEach  ѭ��
        	  System.out.println(r);
          }
          Arrays.stream(q).forEach(s->System.out.println(s));
          
          
          ArrayList<Integer> h=new ArrayList<>();//��������
	}

}
