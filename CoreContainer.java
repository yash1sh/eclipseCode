package dto;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class CoreContainer {
	public static void main(String[] args) {
		ClassPathResource cpr= new ClassPathResource("myspring.xml");
		BeanFactory bf= new XmlBeanFactory(cpr);
		Pen p = (Pen) bf.getBean("pen1");
		p.m1p();
	}
}
