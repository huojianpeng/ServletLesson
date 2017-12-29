package cn.et.servlet.lesson0925;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.http.HttpServletRequest;

/**
 * ����request����Ĳ���������
 * request���������ڣ�������������󣬲���request���ģ���Ӧ��request������
 * @author Administrator
 *
 */
public class RequestCycleListener implements ServletRequestListener {

	public void requestDestroyed(ServletRequestEvent arg0) {
		System.out.println("��������");

	}

	public void requestInitialized(ServletRequestEvent arg0) {
		
		HttpServletRequest request=(HttpServletRequest)arg0.getServletRequest();
		System.out.println("���������"+request.getRequestURI());
	}

}
