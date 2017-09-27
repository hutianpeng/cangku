package listener;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionIdListener;

/**
 * Application Lifecycle Listener implementation class MyListener3
 *
 */
@WebListener
public class MyListener3 implements HttpSessionIdListener {

    /**
     * 监听器     舰艇session  的ID   
     * 当ID发生改变  则发生的事情
     */
    public MyListener3() {
       System.err.println("id初始化");
    }

	/**
     * @see HttpSessionIdListener#sessionIdChanged(HttpSessionEvent, String)
     */
    public void sessionIdChanged(HttpSessionEvent arg0, String arg1)  { 
         System.err.println("id被改变");
    }
	
}
