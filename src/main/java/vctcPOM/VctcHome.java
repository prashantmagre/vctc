package vctcPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VctcHome 
{
	//@FindBy(xpath="(//a[text()='Start Selenium Practice'])[1]")private WebElement clickOnPracticePage;
	@FindBy(xpath="//h3[text()='For Velocity class inquiry please contact on below numbers']")private WebElement text;
	
	
	public VctcHome(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
//	public void selectPracticePage()
//	{
//		clickOnPracticePage.click();
//	}
	
	public String getText()
	{
		String actualText = text.getText();
		return actualText;
	}

}
