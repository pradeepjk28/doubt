package com.telecom.resources;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.github.bonigarcia.wdm.WebDriverManager;
public class CommonActions {
	public static WebDriver driver;
	public static void browser(String url) {
		WebDriverManager.chromedriver().setup();
		DesiredCapabilities capabilities = new DesiredCapabilities();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("start-maximized");
		options.addArguments("headless");
		capabilities.setCapability(ChromeOptions.CAPABILITY, options);
		driver = new ChromeDriver(capabilities);
		driver.get(url);
		
	}
	public static void clickEle(WebElement ele) {
		ele.click();
	}
	public static void enterText(WebElement ele,String value) {
		ele.sendKeys(value);
	}
	public static void textPresent(WebElement ele) {
		String text = ele.getText();
		System.out.println(text);
	}
	public static void stringEquals(WebElement ele,String text) {
		String Text = ele.getText();
		 Assert.assertEquals(Text, text);
	}
}

