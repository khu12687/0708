package com.study.test;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import org.springframework.context.support.ClassPathXmlApplicationContext;

//톰켓가동, 중단시 이벤트를 감지하는 객체
public class MyListener implements ServletContextListener{
	//로드 존슨은, 이 객체에서 즉 톰켓이 가동될때, 모든 서블릿들간 공유할 수 있는
	//영역에 빈컨텍스트를 올려놓았다
	@Override
	public void contextInitialized(ServletContextEvent sc) {
		// TODO Auto-generated method stub
		ServletContext application =sc.getServletContext();
		ClassPathXmlApplicationContext applicationContext = null;
		String contextConfigLocation = sc.getServletContext().getInitParameter("contextConfigLocation");
		applicationContext = new ClassPathXmlApplicationContext(contextConfigLocation);
		application.setAttribute("applicationContext", applicationContext);
		
	}
	@Override
	public void contextDestroyed(ServletContextEvent sc) {
		// TODO Auto-generated method stub
	}


}
