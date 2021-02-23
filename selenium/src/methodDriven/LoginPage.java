package methodDriven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	@FindBy(id="username")private WebElement untb;
	@FindBy(name="pwd")private WebElement pwtb;
	@FindBy(xpath="//div[text()='Login ']")private WebElement loginBtn;
	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);

	}
//	Address returning methods
	public WebElement getUntb()
	{
		return untb;
	}
//	Action performing methods
	public void setUntb(String un)
	{
		untb.sendKeys(un);
	}
	public WebElement getPwtb()
	{
		return pwtb;
	}
	public void setPwtb(String pw)
	{
		pwtb.sendKeys(pw);
	}
	public WebElement getLoginBtn()
	{
		return loginBtn;
	}
	public void ClickLoginBtn()
	{
		loginBtn.click();
	}
	
	public void login(String un,String pw)
	{
		untb.sendKeys(un);
		pwtb.sendKeys(pw);
		loginBtn.click();
	}
	
	
}
