
public class Shi {
	  public static String p_StaticField = "����--��̬����"; 
	    public String p_Field = "����--����"; 
	    static { 
	        System.out.println(p_StaticField); 
	        System.out.println("����--��̬��ʼ����"); 
	    } 
	    { 
	        System.out.println(p_Field); 
	        System.out.println("����--��ʼ����"); 
	    } 
	    public Shi() { 
	        System.out.println("����--������"); 
	    } 
	
}
