package vctcPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VctcSeliniumPracticePage 
{
	@FindBy(xpath="//a[text()='PRACTICE']")private WebElement textName;
	
	
	public VctcSeliniumPracticePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public String getTextName()
	{
		String actualtextName = textName.getText();
		return actualtextName;
		
	}

}
