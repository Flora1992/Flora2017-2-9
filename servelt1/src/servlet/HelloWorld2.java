package servlet;

import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//访问路径：http://域名：端口号/应用路径/servlet路径
public class HelloWorld2 implements Servlet {
	private int count=0;
	public HelloWorld2(){
		System.out.println("servlet被创建");
	}

	@Override
	public void destroy() {
		System.out.println("servlet被销毁");

	}

	@Override
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void init(ServletConfig arg0) throws ServletException {
		System.out.println("servlet初始化");

	}

	@Override
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		System.out.println("2  servlet提供服务");
//		String name=request.getParameter("name");//获取用户参数
//		System.out.println("姓名"+name);
//		String age=request.getParameter("age");//获取用户参数
//		System.out.println("年龄"+age);
//		String[] strs=request.getParameterValues("name");//获取多个参数
//		for(String str:strs){
//			System.out.println(str);
//			
//		}
		
//		response.getWriter().println("servlet running"+(count++));
//		HttpServletResponse httpRes=(HttpServletResponse)response;//传进来的对象本身就是HttpServletResponse类型，所以能够强制转换成HttpServletResponse类型
//		httpRes.sendRedirect("hello");//客户端跳转，重定向
		
		HttpServletRequest httpRe=(HttpServletRequest)request;//父类指向子类对象
		httpRe.getRequestDispatcher("hello").forward(request,response);//服务端跳转，转发
	}

}
