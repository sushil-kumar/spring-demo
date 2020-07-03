package in.cdac.training.SpringDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	
    public static void main( String[] args ) {
    	ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
    	
    	System.out.println("Trying to move a car");
        Vehicle obj = (Vehicle) context.getBean("car");
        obj.move();
    }
}
