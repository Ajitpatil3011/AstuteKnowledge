package com.Astute.AstuteKnowledge.Actions;

import com.Astute.AstuteKnowledge.Utility.SuitBase;
import com.Astute.AstuteKnowledge.Uimap.TopicPage;

public class Topics extends SuitBase
{
public void createTopic() throws InterruptedException
{
	Thread.sleep(5000);
	driver.findElement(TopicPage.topicMenu).click();
	driver.findElement(TopicPage.topicFolderName).click();
	driver.findElement(TopicPage.addTopicBtn).click();
	driver.findElement(TopicPage.topicNameTxtBox).sendKeys("Ajit Demo Topic by Selenium");
	driver.findElement(TopicPage.topicLabelEdit).click();
	driver.findElement(TopicPage.topicLabel).sendKeys("Sample Topic Label added from selenium");
	driver.findElement(TopicPage.topicLabelDone).click();
	driver.findElement(TopicPage.topicNotes).sendKeys("Sample Topic notes by selenium");
}

}
