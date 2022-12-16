package vctcTest;

import org.testng.annotations.Test;

import vctcBase.BaseVctc;
import vctcPOM.VctcHome;
import vctcPOM.VctcSeliniumPracticePage;
import vctcUtility.UtilityVctc;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class ValidateTextName extends BaseVctc
{
	VctcHome a;
	VctcSeliniumPracticePage b;
	
	@BeforeClass
	  public void launchingBrowser() throws InterruptedException, IOException 
	{
		launchBrowser();
		a=new VctcHome(driver);
		b=new VctcSeliniumPracticePage(driver);
	  }
	
	@BeforeMethod
	  public void homePage() 
	{
		
	  }
	
  @Test
  public void validateTextName() throws IOException 
  {
	  UtilityVctc.wait(driver, 1000);
	  Assert.assertEquals(a.getText(), UtilityVctc.readDataFromPropertyFile("text"),"TC is failed");
	  
  }
  

  @AfterMethod
  public void afterMethod() {
  }

  

  @AfterClass
  public void afterClass() throws InterruptedException 
  {
	  UtilityVctc.wait(driver, 1000);
	  closingBrowser(driver);
  }

}
