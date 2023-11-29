package sdet52;

import org.testng.annotations.Test;

public class ArpanClass1 {
	
	@Test(groups = "smoke")
	public void arpan1() {
		System.out.println("SMOKE--1");
	}
	
	@Test(groups = "regression")
	public void arpan2() {
		System.out.println("REGRESSION--2");
	}
	
	

}
