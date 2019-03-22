package org.jungtaekhwan.spring;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringMain {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("application-context.xml");
		Greeter g1 = ctx.getBean("greeter", Greeter.class);
		System.out.println(g1.greet());

		Greeter g2 = ctx.getBean("greeter", Greeter.class);
		System.out.println(g2.greet());

		Greeter g3 = ctx.getBean("greeter", Greeter.class);
		System.out.println(g3.greet());

	}

}