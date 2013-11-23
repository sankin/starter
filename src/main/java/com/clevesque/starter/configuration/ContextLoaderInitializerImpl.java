package com.clevesque.starter.configuration;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration.Dynamic;

import lombok.extern.slf4j.Slf4j;

import org.apache.cxf.transport.servlet.CXFServlet;
import org.springframework.web.context.AbstractContextLoaderInitializer;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;

@Slf4j
public class ContextLoaderInitializerImpl extends AbstractContextLoaderInitializer {
	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {
		super.onStartup(servletContext);
		log.info("Registering the CXF servlet.");
		Dynamic registration = servletContext.addServlet("cxf", new CXFServlet());
		registration.setLoadOnStartup(1);
		registration.addMapping("/cxf/*");
	}

	@Override
	protected WebApplicationContext createRootApplicationContext() {
		log.info("Creating the root application context.");
		AnnotationConfigWebApplicationContext rootApplicationContext = new AnnotationConfigWebApplicationContext();
		rootApplicationContext.register(RootConfiguration.class);
		return rootApplicationContext;
	}
}
