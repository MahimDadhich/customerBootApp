package com.cg.apps.ui;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.cg.apps.ui.ProjectUI;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class ProjectMain {

    public static void main(String args[]) 
    {
        ConfigurableApplicationContext context = SpringApplication.run(ProjectMain.class, args);
        ProjectUI ui = context.getBean(ProjectUI.class);
        ui.runUI();
        context.close();
    }
}