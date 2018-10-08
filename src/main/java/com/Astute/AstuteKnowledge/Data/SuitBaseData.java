package com.Astute.AstuteKnowledge.Data;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class SuitBaseData 
{
	public static String username = null;
	public static String password = null;
	public static String usertype = "Admin";
	public static String url = "https://authoring.astuteknowledge-dev.com/Knowledge/";
	public static String qa_url = "https://authoring.astuteknowledge-dev.com/Knowledge/";
	
	@BeforeSuite
	public static void init()
	{
		
		
		if(url.equals(qa_url))
		{
			if(usertype == "GlobalAdmin")
			{
				username = "Admin";
				password = "realdialog";
			}
			else if (usertype =="Admin")
			{
				username = "ajitadmin";
				password = "AjitAdmin";
			}
			else
			{
				username = "agit";
				password = "wire4you";
			}
		}
		else 
		{
			if(usertype == "GlobalAdmin")
			{
				username = "Admin";
				password = "Realdialog";
			}
			else if (usertype =="Admin")
			{
				username = "ajitadmin";
				password = "AjitAdmin";
			}
			else
			{
				username = "agit";
				password = "wire4you";
			}
		}
	}
}
