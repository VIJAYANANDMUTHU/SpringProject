package com.vivek;


import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
public class Testing {

	public static void main(String[] args) {
		
		Resource resource = new ClassPathResource("main.xml");
		@SuppressWarnings("deprecation")
		BeanFactory  factory = new XmlBeanFactory (resource);//spring container parse here and create objects 
		ApplicationContext context = new ClassPathXmlApplicationContext("main.xml");
		PojoClass p1 = (PojoClass)factory.getBean("test1");
		PojoClass p2 = (PojoClass)factory.getBean("test2");
		
		PojoClass p3 = (PojoClass)context.getBean("test1");
		PojoClass p4 = context.getBean("test2", PojoClass.class);
		
		System.out.println(p1+" + "+p2);
		System.out.println(p3+" + "+p4);
	}

}
