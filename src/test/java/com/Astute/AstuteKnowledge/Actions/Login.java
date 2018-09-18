package com.Astute.AstuteKnowledge.Actions;

import com.Astute.AstuteKnowledge.Data.SuitBaseData;
import com.Astute.AstuteKnowledge.Uimap.LoginPage;
import com.Astute.AstuteKnowledge.Utility.SuitBase;

public class Login extends SuitBase
{
	public static void login()
	{
		suitbaseone.loadURL();
		driver.findElement(LoginPage.Username).sendKeys(SuitBaseData.username);
		driver.findElement(LoginPage.Password).sendKeys(SuitBaseData.password);
		driver.findElement(LoginPage.SignIn).click();
	}
	
	public static void logout() throws InterruptedException
	{
		Thread.sleep(3000);
		driver.findElement(LoginPage.UsernameDropdown).click();
		driver.findElement(LoginPage.LogoutButton).click();
		Thread.sleep(2000);
		suitbaseone.teardown();
	}
}
