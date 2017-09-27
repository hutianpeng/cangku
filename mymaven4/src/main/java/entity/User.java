package entity;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionActivationListener;
import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionBindingListener;
import javax.servlet.http.HttpSessionEvent;

/**
 * Application Lifecycle Listener implementation class User
 *
 */
@WebListener
public class User implements HttpSessionBindingListener ,HttpSessionActivationListener{
   
    /**
     * 绑定  放入实体类中  作用类似属性那个监听器  只是只能以下操作
     * 如果将实现了该接口的对象放入session或者从session中删除
     * 则分别执行下面两个方法
     * 
     */
    public User() {
       System.out.println("绑定初始化");
    }

	/**
     * @see HttpSessionBindingListener#valueBound(HttpSessionBindingEvent)
     */
    public void valueBound(HttpSessionBindingEvent arg0)  { 
       System.out.println("添加绑定");
    }

	/**
     * @see HttpSessionBindingListener#valueUnbound(HttpSessionBindingEvent)
     */
    public void valueUnbound(HttpSessionBindingEvent arg0)  { 
      System.out.println("删除绑定");
    }

    
    
    
    //实现第二个接口
	@Override
	public void sessionDidActivate(HttpSessionEvent arg0) {
		System.out.println("session激活");
		//当web服务器关闭又启动后，session中的对象又会重新加载到内从  称为激活
	}

	@Override
	public void sessionWillPassivate(HttpSessionEvent arg0) {
		System.out.println("session钝化");
		//当web服务器关闭时，我们希望将session中实现了该接口的对象存入硬盘。这称为钝化
		
	}
	
}
