package com.bel.training.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
//Control of Creation of Objects & Initializing the values is given to Spring Bean Configuration FIle instead of Traditional Approach - IOC
public class DeveloperApp 
{
    public static void main( String[] args )
    {
    	ApplicationContext appCon=new ClassPathXmlApplicationContext("DeveloperConfig.xml");
    	
    	Developer factory=(Developer) appCon.getBean("developer");
    	
    	factory.display();
    	
    	((ClassPathXmlApplicationContext) appCon).close();
    	
    }
}
