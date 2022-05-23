package test;

import org.testng.annotations.Test;

public class DependencyOnGroup {
	@Test(dependsOnGroups="test")
	public void finalMethod() {
		System.out.println("Finalpage");
	}
	@Test(groups="test")
	public void nextMethod() {
		System.out.println("Homepage");
	}
	@Test(groups="test")
	public void baseMethod() {
		System.out.println("Loginpage");
	}
}
