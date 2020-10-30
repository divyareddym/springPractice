package com.springPracticeProject.initializer;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import com.springPracticeProject.configuration.DoctorConfiguration;

public class DoctorInitializer extends AbstractAnnotationConfigDispatcherServletInitializer{

	@Override
	protected Class<?>[] getRootConfigClasses() {
    return new Class[] {DoctorConfiguration.class};
	}
	@Override
	protected Class<?>[] getServletConfigClasses() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected String[] getServletMappings() {
		String st[]= {"/"};
		return st;
	}

}
