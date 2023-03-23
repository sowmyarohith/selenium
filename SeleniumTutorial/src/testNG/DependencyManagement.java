package testNG;

import org.testng.annotations.Test;

public class DependencyManagement {
 @Test(enabled = true)
	public void Tenthclass() {
		System.out.println("Tenth class");
	}
 @Test(dependsOnMethods = "Tenthclass")
	public void Intermediate() {
		System.out.println("Intermediate");
	}
 @Test(dependsOnMethods = "Intermediate")
	public void College() {
		System.out.println("college");
	}
}
