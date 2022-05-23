package test;
import org.testng.annotations.Test;

public class Grouping {
	@Test(priority=2)
	public void group1(){
		System.out.println("method1, pri-2");
	}
	@Test(priority=3)
	public void group2() {
		System.out.println("method2,pri-3");
	}
	@Test(priority=2)
	public void group3() {
		System.out.println("method3, pri-2");
	}

}
