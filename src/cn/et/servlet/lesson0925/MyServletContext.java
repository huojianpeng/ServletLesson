package cn.et.servlet.lesson0925;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * servletContextʲô����
 * @author Administrator
 *
 */
public class MyServletContext implements ServletContextListener {

	public void contextDestroyed(ServletContextEvent sce) {

		System.out.println("�����Ķ�������");
	}

	public void contextInitialized(ServletContextEvent sce) {

		System.out.println("�����Ķ������");
	}

	

}
