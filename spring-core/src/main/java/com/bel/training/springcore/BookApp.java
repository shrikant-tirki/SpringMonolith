package com.bel.training.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class BookApp 
{
    public static void main( String[] args )
    {
    	ApplicationContext appCon=new ClassPathXmlApplicationContext("BookConfig.xml");
    	
    	Book factory=(Book) appCon.getBean("book1");
    	
    	factory.show();
    	
    	((ClassPathXmlApplicationContext) appCon).close();
    	
    }
}
