
public class Lin extends Shi{
	public static String s_StaticField = "����--��̬����"; 
    public String s_Field = "����--����"; 
    static { 
        System.out.println(s_StaticField); 
        System.out.println("����--��̬��ʼ����"); 
    } 
    { 
        System.out.println(s_Field); 
        System.out.println("����--��ʼ����"); 
    } 
    public Lin() { 
        System.out.println("����--������"); 
    } 
    public static void main(String[] args) { 
        new Lin(); 
    } 
}
