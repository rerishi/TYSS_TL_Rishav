package sdet52;

import org.testng.annotations.Test;

public class ArpanClass2 {
	
	@Test(groups = "smoke")
	public void arpan3() {
		System.out.println("SMOKE--3");
	}
	
	@Test(groups = "regression")
	public void arpan4() {
		System.out.println("REGRESSION--4");
	}

}
