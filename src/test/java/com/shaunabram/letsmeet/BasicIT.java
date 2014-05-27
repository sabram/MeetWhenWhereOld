package com.shaunabram.letsmeet;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.net.URI;

import static org.junit.Assert.assertTrue;

public class BasicIT {
	private URI siteBase;
	private WebDriver drv;

	@Before
	public void setup() throws Exception {

		siteBase = new URI("http://localhost:8080/LetsMeet");
		drv = new FirefoxDriver();
	}

	@After
	public void tearDown() {
		drv.quit();
	}

	@Test
	public void testWeSeeHelloWorld() {
		drv.get(siteBase.toString());
		assertTrue(drv.getPageSource().contains("Hello World"));
	}

}
