package testing_Code_Mar18;

import org.testng.annotations.Test;

public class Enabled_vs_AlwaysRun {
	
	@Test (priority = 1, alwaysRun = true, enabled = false) //enabled 'false' wouldn't let it run while 'true' will
	public void logic1() {
		System.out.println("First Logic.");
	}
	
	@Test (priority = 2, dependsOnMethods = "logic1")
	public void logic2() {
		System.out.println("Second Logic.");
	}
	
	@Test (priority = 3, dependsOnMethods = {"logic1", "logic2"})
	public void logic3() {
		System.out.println("Third Logic.");
	}

}
