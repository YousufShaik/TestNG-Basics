package test;

import org.testng.annotations.Test;

public class DependencyOnMethod {
    
	@Test(dependsOnMethods="nextMethod")
	public void finalMethod() {
		System.out.println("Finalpage");
	}
	@Test
	public void nextMethod() {
		System.out.println("Homepage");
	}
	@Test
	public void baseMethod() {
		System.out.println("Loginpage");
	}
}
