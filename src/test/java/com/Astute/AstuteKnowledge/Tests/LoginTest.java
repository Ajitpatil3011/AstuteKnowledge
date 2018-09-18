package com.Astute.AstuteKnowledge.Tests;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.Astute.AstuteKnowledge.Utility.SuitBase;

public class LoginTest extends SuitBase
{
	
	@BeforeSuite
	public static void login()
	{
		log.login();
	}
	
	@AfterSuite
	public static void logout() throws InterruptedException
	{
		log.logout();	
	}
	
}
