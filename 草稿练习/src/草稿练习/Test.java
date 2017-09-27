package 草稿练习;

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
        	  //  while 循环
          }
          do{
        	  // do while循环
          }while(m>3);
          for(int n=1;n>0;n++){
        	  //fou 循环
          }*/
          int []q={1,2,6,6,54,45};
          for(int r:q){//forEach  循环
        	  System.out.println(r);
          }
          Arrays.stream(q).forEach(s->System.out.println(s));
          
          
          ArrayList<Integer> h=new ArrayList<>();//泛型数组
	}

}
