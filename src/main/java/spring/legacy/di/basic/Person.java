package spring.legacy.di.basic;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Person {
	private String name;
	private int age;
	private String address;
	
	
	public Person() {
		System.out.println("Person()");
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", address=" + address + "]";
	}
	
	
	
}
