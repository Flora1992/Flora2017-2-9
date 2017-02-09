package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import user.dao.UserDao;
import user.domain.User;





/**
 * Servlet implementation class LoginAction
 */
@WebServlet("/LoginAction")
public class LoginAction extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginAction() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("LoginAction");
		String account = request.getParameter("account");
		String password = request.getParameter("password");
		UserDao ud=new UserDao();
		User user=ud.get(account);
		if(password.equals(user.getPassword())){
			System.out.println("验证通过");
			HttpSession session=request.getSession();
			session.setAttribute("user", user);
			response.sendRedirect(request.getContextPath()+"/search.jsp");
		}else{
			System.out.println("验证失败");
			request.setAttribute("msg", "账号或密码错误！");
			//这里必须是服务端的跳转
			request.getRequestDispatcher("login.jsp").forward(request, response);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
