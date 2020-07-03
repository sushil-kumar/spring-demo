package in.cdac.training.SpringDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
public class Car implements Vehicle {

	
	private Tyre tyre;
	
	@Autowired (required = false)
	public void setTyre() {
		
	}
	
	public void move() {
		System.out.println("Car is moving with ");
	}
}
