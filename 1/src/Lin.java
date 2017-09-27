
public class Lin extends Shi{
	public static String s_StaticField = "子类--静态变量"; 
    public String s_Field = "子类--变量"; 
    static { 
        System.out.println(s_StaticField); 
        System.out.println("子类--静态初始化块"); 
    } 
    { 
        System.out.println(s_Field); 
        System.out.println("子类--初始化块"); 
    } 
    public Lin() { 
        System.out.println("子类--构造器"); 
    } 
    public static void main(String[] args) { 
        new Lin(); 
    } 
}
