package com.abc.demo.FirstProject;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginTest {

	@Test
	public void verifyTitle() {
	    System.out.println("===== TEST STARTED =====");

	    ChromeDriver driver = new ChromeDriver();
	    driver.get("https://www.google.com");

	    String title = driver.getTitle();
	    System.out.println("TITLE IS: " + title);

	    driver.quit();

	    System.out.println("===== TEST ENDED =====");
	}
	
}
