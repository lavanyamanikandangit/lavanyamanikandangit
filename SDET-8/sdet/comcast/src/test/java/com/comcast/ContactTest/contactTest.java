package com.comcast.ContactTest;

import org.testng.annotations.Test;

public class contactTest {

	
	@Test(groups="smoke test")
	public void createContactTest() {
		System.out.println("execute createcontact test");
	}
	@Test(groups="regression test")
	public void modifyContactTest() {
		System.out.println("execute modify test");
	}
}
 