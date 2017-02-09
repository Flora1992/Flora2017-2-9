package online;

import javax.servlet.ServletContext;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 * Application Lifecycle Listener implementation class OnlineListener
 *
 */
@WebListener
public class OnlineListener implements HttpSessionListener {

    /**
     * Default constructor. 
     */
    public OnlineListener() {
        // TODO Auto-generated constructor stub
    }

	/**
     * @see HttpSessionListener#sessionCreated(HttpSessionEvent)
     */
    public void sessionCreated(HttpSessionEvent event)  { 
    	ServletContext servletContext = event.getSession().getServletContext();
    	Object countObj=servletContext.getAttribute("count");
    	if(countObj!=null){
    		int count=(Integer)countObj;
    		count++;
    		servletContext.setAttribute("count", count);
    	}else{
    		servletContext.setAttribute("count",1);
    	}
    }

	/**
     * @see HttpSessionListener#sessionDestroyed(HttpSessionEvent)
     */
    public void sessionDestroyed(HttpSessionEvent event)  { 
    	 
    	ServletContext servletContext = event.getSession().getServletContext();
    	Object countObj=event.getSession().getServletContext().getAttribute("count");
    		int count=(Integer)countObj;
    		count--;
    		servletContext.setAttribute("count", count);
    }
	
}
