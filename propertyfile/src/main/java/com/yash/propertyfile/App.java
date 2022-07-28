package com.yash.propertyfile;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args ) throws Exception
    {
    	ConfigurableApplicationContext cap = new ClassPathXmlApplicationContext("com/yash/propertyfile/spring.xml");
    	System.out.println(cap.getMessage("Message",null,"Default Message",null));
    	cap.close();
    }
}
