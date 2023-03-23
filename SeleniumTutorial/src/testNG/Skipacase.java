package testNG;

import org.testng.annotations.Test;

public class Skipacase {
	@Test(priority=0)
	public void Startacar() {
		System.out.println("start a car");
			}
	@Test(priority=1)
	public void putin1stgear() {
		System.out.println("putin1stgear");
			}
	@Test(priority=2,enabled = false)
	public void putin2ndgear() {
		System.out.println("putin2ndgear");
			}
	@Test(priority=3)
	public void putin3rdgear() {
		System.out.println("putin3rdgear");
			}
	@Test(priority=4)
	public void putin4thtgear() {
		System.out.println("putin4thgear");
			}
}
