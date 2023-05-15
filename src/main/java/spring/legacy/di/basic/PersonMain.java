package spring.legacy.di.basic;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class PersonMain {
	public static void main(String[] args) {
		ApplicationContext applicationContext=new FileSystemXmlApplicationContext("person.xml");

		((Person)applicationContext.getBean("person1")).setName("재홍");
	    System.out.println(((Person)applicationContext.getBean("person1")).getName());
		
	}

}
