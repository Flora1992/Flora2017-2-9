package session;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class TestSession2
 */
@WebServlet("/TestSession2")
public class TestSession2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TestSession2() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		HttpSession session = request.getSession(false);
		if(session!=null)
		System.out.println("HttpSession"+session);
//		System.out.println("TestSession2 SessionID:"+session.getId());
		
		Object user1=request.getAttribute("user");
		System.out.println("request级别"+user1);
		
		Object user2=request.getSession().getAttribute("user");
		System.out.println("Session级别"+user2);
		
		Object user3=request.getServletContext().getAttribute("user");
		System.out.println("application级别"+user3);
		request.getSession().invalidate();//销毁Session
		//获取到Cookie
//		Cookie[] cookies = request.getCookies();
//		for (Cookie cookie : cookies) {
//			System.out.println(cookie.getName()+":"+cookie.getValue());
//			
//		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
