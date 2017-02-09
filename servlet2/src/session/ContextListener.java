package session;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

/**
 * Application Lifecycle Listener implementation class ContextListener
 *
 */
@WebListener
public class ContextListener implements ServletContextListener {

    /**
     * Default constructor. 
     */
    public ContextListener() {
        System.out.println("ContextListener 被创建");
    }
    
	/**
     * @see ServletContextListener#contextInitialized(ServletContextEvent)
     */
    public void contextInitialized(ServletContextEvent event)  {
    	String savepath = event.getServletContext().getInitParameter("savepath");
    	System.out.println("savepath:"+savepath);
    	//做应用初始化的一些操作，比如spring初始化
    	System.out.println("应用启动:"+event.getServletContext().getContextPath());
    }
	

	/**
     * @see ServletContextListener#contextDestroyed(ServletContextEvent)
     */
    public void contextDestroyed(ServletContextEvent event)  { 
         System.out.println("应用销毁:"+event.getServletContext().getContextPath());
    }


}
