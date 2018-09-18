package com.Astute.AstuteKnowledge.Tests;

import org.testng.annotations.Test;

import com.Astute.AstuteKnowledge.Actions.Login;
import com.Astute.AstuteKnowledge.Actions.Topics;
import com.Astute.AstuteKnowledge.Utility.SuitBase;

public class TopicsTest extends SuitBase
{
	@Test(priority=1)
	public static void createTopic() throws InterruptedException
	{
		log.login();
		top.createTopic();
		log.logout();
	} 
}
