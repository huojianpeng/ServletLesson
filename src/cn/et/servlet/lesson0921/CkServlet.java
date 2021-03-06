package cn.et.servlet.lesson0921;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException; 
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class CkServlet extends HttpServlet {

	
	int i=0;
	
	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		//无状态性
		//out.println("访问的次数是:"+(++i));
		
		/*//有状态,将变量写入到浏览器，互不影响
		Cookie[] ckks= request.getCookies();
		int i=0;
		//如果某个浏览器是第一次访问 ，没有cookie，第一次访问需要将cookie写入出事值1
		if(ckks==null || ckks.length==0){
			i++;
			Cookie c=new Cookie("i", i+"");
			response.addCookie(c);
		}else {
			//判断cookie中是否存在i这个cookie，如果存在+1后写会
			for(Cookie cie:ckks){
				if(cie.getName().equals("i")){
					i=Integer.parseInt(cie.getValue())+1;
				}
			}
			Cookie c=new Cookie("i", i+"");
			response.addCookie(c);
		}*/
		
		//有状态通过session来实现,任何系统中，用户权限，将用户信息存储session中
		HttpSession session=request.getSession();
		System.out.println(session.getId());
		
		Object object= session.getAttribute("i");
		int i=1;
		if(object==null){
			session.setAttribute("i", i);
		}else {
			i=(Integer)object+1;
			session.setAttribute("i", i);
		}
		
		
		out.println("<a href='http://localhost:8080/sl/ck?a=b'>返回上一次</a>");
		String s=request.getParameter("a");
		if(s!=null && s.equals("b")){
			i=(Integer)object-1;
			session.setAttribute("i", i);
		}
		
		out.print("您是第"+i+"次访问该系统");
		
		
		
		out.flush();
		out.close();
	}

	/**
	 * The doPost method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to post.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		this.doGet(request, response);
	}

}
