package com.abc.demo.FirstProject;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Login {

	@Test
	public void verifyTitle()
	{
		ChromeDriver driver = new ChromeDriver();
		System.out.println(driver.getTitle());
	}
	
}
