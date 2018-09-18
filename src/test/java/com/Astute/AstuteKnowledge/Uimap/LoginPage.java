package com.Astute.AstuteKnowledge.Uimap;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;

public class LoginPage 
{
public static final By Username = new By.ById("inputUser");
public static final By Password = new By.ById("inputPassword");
public static final By SignIn = new By.ByXPath("/html/body/div[1]/div[2]/div[1]/div/div/form/div[3]/div/button");
public static final By UsernameDropdown = new By.ById("userDropdown");
public static final By LogoutButton = new By.ById("logout");
}
