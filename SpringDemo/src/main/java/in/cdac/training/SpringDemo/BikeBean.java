package in.cdac.training.SpringDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class BikeBean implements Vehicle {
	
	private Tyre tyre;
	
	public void move() {
		System.out.println("Bike is moving with " + tyre);
	}
}
