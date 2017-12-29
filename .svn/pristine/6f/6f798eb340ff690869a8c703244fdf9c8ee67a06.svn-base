package cn.et.servlet.lesson0925;

import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;

public class HttpSessionDataChange implements HttpSessionAttributeListener {

	public void attributeAdded(HttpSessionBindingEvent arg0) {

		String key=arg0.getName();
		String value=arg0.getValue().toString();
		System.out.println(key+"="+value);
	}

	public void attributeRemoved(HttpSessionBindingEvent arg0) {

	}

	public void attributeReplaced(HttpSessionBindingEvent arg0) {

		String key=arg0.getName();
		String value=arg0.getValue().toString();//获取旧值
		String val=arg0.getSession().getAttribute(key).toString();//获取新值
		System.out.println("replace=>"+key+"="+value+"="+val);
	}

}
