package com.Astute.AstuteKnowledge.Utility;

import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.server.handler.ImplicitlyWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.Astute.AstuteKnowledge.Actions.Login;
import com.Astute.AstuteKnowledge.Actions.Topics;
import com.Astute.AstuteKnowledge.Data.SuitBaseData;

public class SuitBase extends SuitBaseData
{
	public static WebDriver driver= null;
	public static SuitBase suitbaseone = new SuitBase();
	public static WebDriverWait wait = null;
	public static DesiredCapabilities capabilities = null;
	final static protected Login log = new Login();
	final static protected Topics top = new Topics();
	
	
	@SuppressWarnings("deprecation")
	public static void loadURL()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium JAR\\chromedriver_win32\\chromedriver.exe");
		capabilities = DesiredCapabilities.chrome();
		capabilities.setCapability("chrome.switches", Arrays.asList("--incognito"));
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("excludeSwitches", Collections.singletonList("enable-automation"));
		driver = new ChromeDriver(capabilities);
		wait = new WebDriverWait(driver, 10);
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	
	public static void teardown()
	{
		driver.quit();
	}
}