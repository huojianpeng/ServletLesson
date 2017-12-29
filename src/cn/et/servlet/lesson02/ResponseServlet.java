package cn.et.servlet.lesson02;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ResponseServlet extends HttpServlet {

	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		resp.setContentType("text/html;charset=UTF-8");
		PrintWriter pw=resp.getWriter();
		pw.println("欢迎访问");
		
		//resp.setStatus(302);
		//resp.setHeader("Location","http://www.csdn.net");
		
		//页面重新刷新
		//resp.setIntHeader("Refresh",10);
		//resp.setHeader("Refresh","10 ,url=http://www.csdn.net");

		resp.setHeader("refresh","5;url='http://www.csdn.net'");

		
	}
	
	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		this.doGet(req, resp);
	}
}
