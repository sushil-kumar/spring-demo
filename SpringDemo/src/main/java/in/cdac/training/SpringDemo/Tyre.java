package in.cdac.training.SpringDemo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class Tyre {

	@Value("MRF")
	private String brand;
	
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public Tyre() {
		super();
		System.out.println("New tyre is created");
	}
	
	@Override
	public String toString() {
		return "Tyre of Brand " + brand;
	}
}
