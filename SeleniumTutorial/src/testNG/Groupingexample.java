package testNG;

import org.testng.annotations.Test;

public class Groupingexample {
	@Test(groups= {"apple"})
	public void apple1() {
		System.out.println("its a apple1 method");
	}
	@Test(groups= {"apple"})
	public void apple2() {
		System.out.println("its a apple2 method");
	}
	@Test(groups= {"vivo"})
	public void vivo1() {
		System.out.println("its a vivo1 method");
	}
	@Test(groups= {"vivo"})
	public void vivo2() {
		System.out.println("its a vivo2 method");
	}
	@Test(groups= {"moto"})
	public void moto1() {
		System.out.println("its a moto1 method");
	}
	@Test(groups= {"moto"})
	public void moto2() {
		System.out.println("its a moto2 method");
	}
	@Test(groups= {"lenovo"})
	public void lenovo1() {
		System.out.println("its a lenovo1 method");
	}
	@Test(groups= {"lenovo"})
	public void lenovo2() {
		System.out.println("its a lenovo2 method");
	}

}
