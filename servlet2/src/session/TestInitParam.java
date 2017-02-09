package session;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TestInitParam
 */
//@WebServlet("/TestInitParam")
public class TestInitParam extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TestInitParam() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String savepath = request.getServletContext().getInitParameter("savepath");
		System.out.println("savepath"+savepath);
		//参数需要中间值getServletConfig()来获取
		
		String user = this.getServletConfig().getInitParameter("user");
		Enumeration<String> initParameterNames = this.getServletConfig().getInitParameterNames();
		
		while(initParameterNames.hasMoreElements()){
			System.out.println(initParameterNames.nextElement());
		}
		System.out.println(user);
		
		String host = request.getHeader("Host");//获取请求头
		System.out.println(host);
		
	
		response.addHeader("Location", "http://www.baidu.com");
		
		response.setStatus(302);
		
		//乱码问题解决
//		response.setCharacterEncoding("UTF-8");
//		response.setContentType("text/html");
		response.setContentType("text/html;charset=UTF-8");
		response.getWriter().println("中文测试·····");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
