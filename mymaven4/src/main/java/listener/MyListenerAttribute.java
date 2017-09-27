package listener;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;

/**
 * 监听器   监听属性   当对属性操作时发生的行为
 *
 */
@WebListener
public class MyListenerAttribute implements HttpSessionAttributeListener {

    
    public MyListenerAttribute() {
      System.err.println("属性初始化");
    }

	
    public void attributeAdded(HttpSessionBindingEvent arg0)  { 
        System.err.println("添加");
    }

	
    public void attributeRemoved(HttpSessionBindingEvent arg0)  { 
    	 System.err.println("删除");
    }

	
    public void attributeReplaced(HttpSessionBindingEvent arg0)  { 
		 System.err.println("替换");
    }
	
}
