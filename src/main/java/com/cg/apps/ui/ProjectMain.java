package com.cg.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.cg.customerms.JavaConfiguration;
import com.cg.exception.CustomerNotFoundException;
import com.cg.main.ProjectUI;

public class ProjectMain 
{
	public static void main(String[] args) 
	{
			
			AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
			context.register(JavaConfiguration.class);
			context.refresh();
			ProjectUI projectUi = context.getBean(ProjectUI.class);
			projectUi.runUI();
			context.close();
		}
}