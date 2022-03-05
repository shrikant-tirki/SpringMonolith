package com.bel.training.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class StudentApp 
{
    public static void main( String[] args )
    {
    	ApplicationContext appCon=new ClassPathXmlApplicationContext("StudentConfig.xml");
    	
    	Student factory=(Student) appCon.getBean("s1");
    	
    	factory.display();     
    	
    	((ClassPathXmlApplicationContext) appCon).close();
    }
}
