package servlet;

import java.io.IOException;
import java.util.UUID;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Part;

import user.dao.UserDao;
import user.domain.User;


//@WebServlet("/user")//等同于配置文件
@WebServlet(urlPatterns={"/user1","/user2"},loadOnStartup=1)
@MultipartConfig(location="d:/app/")//附件上传需要做的配置，注解
public class UserAction extends HttpServlet {
	public UserAction(){
		System.out.println("UserAction被创建");
	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setCharacterEncoding("utf-8");
		
		resp.getWriter().println("doGet");
		req.getRequestDispatcher("/WEB-INF/index.html").forward(req, resp);
		
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		req.setCharacterEncoding("UTF-8");
//		int id=Integer.valueOf(req.getParameter("id"));
//		String account=req.getParameter("account");
//		String nickName=req.getParameter("nickName");
//		String password=req.getParameter("password");
//		int age=Integer.valueOf(req.getParameter("age"));
//		String sex=req.getParameter("sex");
//		System.out.println("sex:"+sex);
		Part pt = req.getPart("file");//一个part代表一个附件
		//Part pt = req.getPart("img")
		
		String filename=pt.getSubmittedFileName();
		String suffix=filename.substring(filename.lastIndexOf("."));
		
		String uuid=UUID.randomUUID().toString();
		pt.write(uuid+suffix);//保存附件
		//String headImag=uuid+suffix;
		
		resp.getWriter().println("save successful!");
//		resp.getWriter().println(id+account+nickName+password+age+sex+headImag);
//		
//		User user=new User();
//		UserDao ud=new UserDao();
//		user.setAccount(account);
//		user.setPassword(password);
//		user.setNickName(nickName);
//		user.setAge(age);
//		user.setSex(sex);
//		user.setHeadImag(headImag);
//		
//		ud.add(user);
//		HttpSession session=req.getSession();
//		session.setAttribute("user", user);
//		resp.sendRedirect(req.getContextPath()+"/search.jsp");
//		
	}

}
