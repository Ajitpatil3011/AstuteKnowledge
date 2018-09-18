package com.Astute.AstuteKnowledge.Uimap;

import org.openqa.selenium.By;

public class TopicPage 
{
	public static final By topicMenu = new By.ByLinkText("Topics");
	public static final By addTopicBtn = new By.ById("addTopic");
	public static final By topicNameTxtBox = new By.ByXPath("//*[@id='textBoxField']");
	public static final By topicFolderName = new By.ByXPath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[4]/span[2]/span[1]");
	public static final By topicNotes = new By.ByXPath("//span[@id='descriptionTextField']");
	public static final By topicLabelEdit = new By.ByXPath("//button[@id='topicLabelEdit']");
	public static final By topicLabel = new By.ByXPath("//table[@class='table']//tr[12]//td[2]//span[1]//span[1]");
	public static final By topicLabelDone = new By.ByXPath("//button[@id='doneButton']");
	public static final By addExample = new By.ByXPath("//a[@id='addExample']//i[@class='icon-plus astute-blue']");
	public static final By exampleTextbox = new By.ByXPath("//textarea[@class='editor-field']");
	public static final By exampleDoneButton = new By.ByXPath("//button[@id='doneButton']");
	public static final By responseEditButton = new By.ByXPath("//div[@id='previewArea']//div//div[@class='tab-content']//div[@id='responseTab']//div[@id='responsePreview']//div//div//button[@id='edit']");
	public static final By responseTextbox = new By.ByXPath("/html");
	public static final By responseDoneButton = new By.ByXPath("//button[@id='doneButton']");
	public static final By statusDropdown = new By.ByXPath("//div[@id='status']//div//a[@class='dropdown-toggle link-wrapper']");
	public static final By statusSelect = new By.ByXPath("//span[@data-i18n='topic.statuses.publishAll']");
}
