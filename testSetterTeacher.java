package dto;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class testSetterTeacher {
	public static void main(String[] args) {
		ClassPathResource clr= new ClassPathResource("myspring.xml");
		BeanFactory bf=new XmlBeanFactory(clr);
		Teacher tch=(Teacher) bf.getBean("Teacher1");
		System.out.println(tch);
		
		
		
		
	}
}
