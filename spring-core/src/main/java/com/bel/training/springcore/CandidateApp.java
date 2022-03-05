package com.bel.training.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
//Control of Creation of Objects & Initializing the values is given to Spring Bean Configuration FIle instead of Traditional Approach - IOC
public class CandidateApp 
{
    public static void main( String[] args )
    {
    	ApplicationContext appCon=new ClassPathXmlApplicationContext("CandidateConfig.xml");
    	
    	Candidate factory=(Candidate) appCon.getBean("cd1");
    	
    	factory.display();
    	
    	((ClassPathXmlApplicationContext) appCon).close();
    	
    }
}
