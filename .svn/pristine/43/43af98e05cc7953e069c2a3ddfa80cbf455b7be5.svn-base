package cn.et.servlet.lesson0921;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.et.servlet.lesson01.DBUtils;

/**
 * 
 * 请求转发和重定向的区别：
 * 
 *    调用方式不同——转发：request.getRequestDispatcher("/lesson0921/detail.html").forward(request, response);
 *               ——重定向：response.sendRedirect(contextPath+"/lesson0921/detail.html");
 *               
 *    请求的次数不同——转发：1次
 *    			   ——重定向：2次
 *    
 *    跳转方式不同——转发：服务器内部跳转，浏览器不知
 *    			 ——重定向：告知浏览器302，设置localhost，发生的二次跳转
 *    
 *    地址不同——转发：地址不变
 *    		 ——重定向：变化为第二次地址
 *    
 *    参数不同——转发：参数保留
 *    		 ——重定向：参数丢失
 *    
 *    跨域访问——转发：只能在同一个项目中的url跳转
 *           ——重定向：可以跨域
 *    
 *    
 * 
 * 
 * @author Administrator
 *
 */

public class MyLoginServlet extends HttpServlet {

	/**
	 * request表示浏览器的请求（浏览器输入地址回车，表单点击提交按钮） 请求获取的是浏览器的一些信息（请求头）
	 */
	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		
		//获取请求的url getRequestURL
		String url=request.getRequestURI().toString();
		out.println("您请求的url:"+url+"<br/>");
		
		//获取参数getParameter("键")
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		//获取请求方式
		String method=request.getMethod();
		out.println("您请求的类型:"+method+"<br/>");
		
		//获取请求头的键值对
		String acceptLa=request.getHeader("Accept-Language");
		out.println("浏览器支持的语言和国家:"+acceptLa+"<br/>");
		String userAgent=request.getHeader("User-Agent");
		out.println("浏览器的类型:"+userAgent+"<br/>");
		
		//获取上下文路径
		String contextPath=request.getContextPath();
		out.println("上下文路径:"+contextPath+"<br/>");
		
		//获取请求的完整路径
		String requesUrl=request.getRequestURI();
		out.println("完整路径:"+requesUrl+"<br/>");
		
		//获取服务器的端口
		int serverPort=request.getServerPort();
		out.println("端口号:"+serverPort+"<br/>");
		
		//获取协议
		String scheme=request.getScheme();
		out.println("协议:"+scheme+"<br/>");
		
		
		
		String sql = "select * from myuser where username=? and password=?";
		System.out.println(username);
		System.out.println(password);
		try {
			//获取连接
			Connection conn = DBUtils.getConnection();
			System.out.println(conn);
			//执行预编译sql语句
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setString(1, username);
			pst.setString(2, password);
			ResultSet rs = pst.executeQuery();
			if (rs.next()) {
				//跳转detail.html
				//请求转发
				request.getRequestDispatcher("/lesson0921/detail.html").forward(request, response);
				
				//重定向
				//response.sendRedirect(contextPath+"/lesson0921/detail.html");
				
				rs.close();
				pst.close();
				conn.close();
				return;
				
				
				
				
			}else {
				out.println("<font color=red>登录失败</font>");
			}
			rs.close();
			pst.close();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		out.flush();
		out.close();
	}

	/**
	 * The doPost method of the servlet. <br>
	 * 
	 * This method is called when a form has its tag value method equals to
	 * post.
	 * 
	 * @param request
	 *            the request send by the client to the server
	 * @param response
	 *            the response send by the server to the client
	 * @throws ServletException
	 *             if an error occurred
	 * @throws IOException
	 *             if an error occurred
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		this.doGet(request, response);

	}

}
