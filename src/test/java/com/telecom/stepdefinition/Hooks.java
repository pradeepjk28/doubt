package com.telecom.stepdefinition;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.telecom.resources.CommonActions;

import cucumber.api.Scenario;



public class Hooks extends CommonActions {
	CommonActions ca= new CommonActions();
@Before
	public void beforeScenario(){
	System.out.println("beforeScenario");
	browser("http://www.demo.guru99.com/telecom/");
	}
@After
	public void afterScenario(Scenario scenario) {
	System.out.println("afterScenario");
	if(scenario.isFailed()) {
		final byte[] screenshot=((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
		scenario.embed(screenshot, "image/png");
	}
	else {
		final byte[] screenshot=((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
		scenario.embed(screenshot, "image/png");
	}
	driver.quit();
}

}
