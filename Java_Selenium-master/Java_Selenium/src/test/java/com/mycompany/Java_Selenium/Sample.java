package com.mycompany.Java_Selenium;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample {
	@Test
	public void testa1() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/heychris/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get(
				"https://www.amazon.com/ap/register?showRememberMe=true&openid.pape.max_auth_age=0&openid.identity=http%3A%2F%2Fspecs.open"
						+ "id.net%2Fauth%2F2.0%2Fidentifier_select&pageId=usflex&ignoreAuthState=1&openid.return_to=https%3A%2F%2Fwww.amazon.com%2F"
						+ "%3Fref_%3Dnav_signin&prevRID=GVEZZZHJ75EBDS3QBAT5&openid.assoc_handle=usflex&openid.mode=checkid_setup&openid.ns.pape=htt"
						+ "p%3A%2F%2Fspecs.openid.net%2Fextensions%2Fpape%2F1.0&prepopulatedLoginId=&failedSignInCount=0&openid.claimed_id=http%3A%2F"
						+ "%2Fspecs.openid.net%2Fauth%2F2.0%2Fi"
						+ "dentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
		driver.findElement(By.id("ap_customer_name")).sendKeys("Yijiaoyijiao");
		driver.findElement(By.id("ap_email")).sendKeys("123this@gmail.com");
		driver.findElement(By.id("ap_password")).sendKeys("12345678");
		driver.findElement(By.id("ap_password_check")).sendKeys("12345");
		driver.findElement(By.id("a-autoid-0")).click();

		Thread.sleep(3000);
		driver.get(
				"https://www.amazon.com/ap/register?showRememberMe=true&openid.pape.max_auth_age=0&openid.identity=http%3A%2F%2Fspecs.open"
						+ "id.net%2Fauth%2F2.0%2Fidentifier_select&pageId=usflex&ignoreAuthState=1&openid.return_to=https%3A%2F%2Fwww.amazon.com%2F"
						+ "%3Fref_%3Dnav_signin&prevRID=GVEZZZHJ75EBDS3QBAT5&openid.assoc_handle=usflex&openid.mode=checkid_setup&openid.ns.pape=htt"
						+ "p%3A%2F%2Fspecs.openid.net%2Fextensions%2Fpape%2F1.0&prepopulatedLoginId=&failedSignInCount=0&openid.claimed_id=http%3A%2F"
						+ "%2Fspecs.openid.net%2Fauth%2F2.0%2Fi"
						+ "dentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
		driver.findElement(By.id("ap_customer_name")).sendKeys("Yijiaoyijiao");
		driver.findElement(By.id("ap_email")).sendKeys("thisisme@gmail.com");
		driver.findElement(By.id("ap_password")).sendKeys("12345678");
		driver.findElement(By.id("ap_password_check")).sendKeys("12345678");
		driver.findElement(By.id("a-autoid-0")).click();
		Thread.sleep(3000);

		 driver.quit();
	}

	@Test
	public void testb2() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/heychris/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get(
				"https://www.amazon.com/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.com%"
						+ "2F%3Fref_%3Dnav_ya_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&"
						+ "openid.assoc_handle=usflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspe"
						+ "cs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&");
		driver.findElement(By.id("ap_password")).sendKeys("ajaymohandas89");
		driver.findElement(By.id("ap_email")).sendKeys("12343289");
		driver.findElements(By.id("signInSubmit")).get(0).click();

		Thread.sleep(3000);

		 driver.quit();
	}

	@Test
	public void testc3() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/heychris/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get(
				"https://www.amazon.com/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.com%"
						+ "2F%3Fref_%3Dnav_ya_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&"
						+ "openid.assoc_handle=usflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspe"
						+ "cs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&");
		driver.findElement(By.id("ap_password")).sendKeys("jxjy2006");
		driver.findElement(By.id("ap_email")).sendKeys("jiao.yi1@husky.neu.edu");
		Thread.sleep(3000);

		driver.findElements(By.id("signInSubmit")).get(0).click();
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Taisioner Hardshell Carry Case Protective Storage Bag Kit of Remote & Controller Accessories Box for DJI Tello Drone");
		driver.findElement(By.className("nav-input")).click();
		driver.findElement(By.linkText(
				"Taisioner Hardshell Carry Case Protective Storage Bag Kit of Remote & Controller Accessories Box for DJI Tello Drone"))
				.click();
		driver.findElement(By.className("a-button-input")).click();

		driver.findElement(By.id("hlb-ptc-btn-native")).click();

		Thread.sleep(5000);

		 driver.quit();
	}



}
