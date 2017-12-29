package cn.et.servlet.lesson0925;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.http.HttpServletRequest;

/**
 * 监听request对象的产生和销毁
 * request的生命周期，浏览器发起请求，产生request随心，响应后request呗销毁
 * @author Administrator
 *
 */
public class RequestCycleListener implements ServletRequestListener {

	public void requestDestroyed(ServletRequestEvent arg0) {
		System.out.println("请求被销毁");

	}

	public void requestInitialized(ServletRequestEvent arg0) {
		
		HttpServletRequest request=(HttpServletRequest)arg0.getServletRequest();
		System.out.println("请求产生了"+request.getRequestURI());
	}

}
