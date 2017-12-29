package cn.et.servlet.lesson0925;

import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 * session����������
 * 	sessionԭ����ͨ�������ڵ���session����ʱ�Զ�ͨ��cookieд��session�ķ�ʽ������
 * cookieĬ�ϵ���Ч������������ر�֮ǰ����ǰsession����Ч���ǵ�ǰ��һ�����������
 * session���ݿ���������У������޷�����������Ĺرջ�ͨ��web.xml
 * @author Administrator
 *
 */
public class MySessionListener implements HttpSessionListener {

	public void sessionCreated(HttpSessionEvent arg0) {
		
		HttpSession session=arg0.getSession();
		System.out.println("session����"+session.getId());
	}

	public void sessionDestroyed(HttpSessionEvent arg0) {

		HttpSession session=arg0.getSession();
		System.out.println("session������"+session.getId());
	}

}
