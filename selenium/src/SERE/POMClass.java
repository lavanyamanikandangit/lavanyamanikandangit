package SERE;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POMClass {
//Declaration
	@FindBy(xpath="//div[text()='Login ']") private WebElement loginBtn;//if more than one element we change the WebElements
	//Initialization
	public POMClass(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//Utilization
	public WebElement getLoginBtn()
	{
		return loginBtn;
	}
	public void clickLoginBtn()
	{
		loginBtn.click();
	}
	
}
