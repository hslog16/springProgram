package test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;


// XML should be well formed as well as valid.

public class client {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Resource r = new ClassPathResource("resources/spring.xml");
		BeanFactory factory = new XmlBeanFactory(r);
		factory.getBean("t");
		factory.getBean("t");
		factory.getBean("t");
		System.out.println("Document valid "); 
	}

}
