package com.bel.training.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class EmployeeApp 
{
    public static void main( String[] args )
    {
    	ApplicationContext appCon=new ClassPathXmlApplicationContext("EmployeeConfig.xml");
    	
    	Employee factory=(Employee) appCon.getBean("emp");
    	
    	factory.display();
    	
    	((ClassPathXmlApplicationContext) appCon).close();
    	
    }
}
