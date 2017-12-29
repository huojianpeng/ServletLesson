package cn.et.servlet.lesson0925;

import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 * session的生命周期
 * 	session原理是通过容器在调用session方法时自动通过cookie写入session的方式来控制
 * cookie默认的有效期是浏览器被关闭之前，当前session的有效期是当前这一次浏览器访问
 * session数据库放在容器中，容器无法监听浏览器的关闭会通过web.xml
 * @author Administrator
 *
 */
public class MySessionListener implements HttpSessionListener {

	public void sessionCreated(HttpSessionEvent arg0) {
		
		HttpSession session=arg0.getSession();
		System.out.println("session产生"+session.getId());
	}

	public void sessionDestroyed(HttpSessionEvent arg0) {

		HttpSession session=arg0.getSession();
		System.out.println("session被销毁"+session.getId());
	}

}
