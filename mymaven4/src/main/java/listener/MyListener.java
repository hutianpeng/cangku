package listener;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 * Application Lifecycle Listener implementation class MyListener
 *
 */
@WebListener
public class MyListener implements HttpSessionListener {

    /**
     * 监听器  监听生命  当生命开始   结束时执行的行为
     */
    public MyListener() {
       System.err.println("初始化");
    }

	
    public void sessionCreated(HttpSessionEvent arg0)  { 
        System.err.println("生命开始");
    }

	
    public void sessionDestroyed(HttpSessionEvent arg0)  { 
    	System.err.println("生命结束");
    }
	
}
