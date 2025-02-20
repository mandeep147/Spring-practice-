package springInAction;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

public class HelloApp {
	public static void main(String []args) throws BeansException, FileNotFoundException{
		BeanFactory factory = new XmlBeanFactory(new FileSystemResource("hello.xml"));
		GreetingService greeting = (GreetingService) factory.getBean("greetingService");
		greeting.sayGreeting();
	}
}
