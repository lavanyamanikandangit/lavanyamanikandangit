package SeleniumPracticeQSP;
	import java.util.List;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.support.ui.Select;
	public class HandlingDropdown {
	
		public static void main(String[] args) throws InterruptedException {
			WebDriver driver=null;
			System.setProperty("webdriver.chrome.driver","./driver/ChromeDriver.exe");
			driver=new ChromeDriver();
			driver.get("file:///C:/Users/lavan/Desktop/dropdown.html");
		//	driver.manage().window().maximize();
			//Thread.sleep(2000);
			
			
			WebElement addr=driver.findElement(By.id("Taj"));
			Select s=new Select(addr);
			if(s.isMultiple()) 
			{
				System.out.println("multi-select selection");
			}else 
			{
				System.out.println("single-select selection");
				
			}
		
	//	
			s.selectByVisibleText("idli");
			Thread.sleep(2000);
			s.selectByValue("vada");
			Thread.sleep(2000);
			s.selectByIndex(1);
			Thread.sleep(2000);
//			addr.click();
//			
//				
			
//			s.deselectByVisibleText("Idli");
//			Thread.sleep(2000);
//			s.deselectByValue("vada");
//			Thread.sleep(2000);
//			s.deselectByIndex(1);
//			Thread.sleep(2000);
//			s.deselectAll();
		
//			List<WebElement> allOps =s.getOptions();
//			//getting all options using get,gettext,println
//			for(int i=0;i<allOps.size();i++)
//			{
//				System.out.println(allOps.get(i).getText());
//			}
//			getting all options by using for loop
			WebElement Wrapelement = s.getWrappedElement();
			System.out.println(Wrapelement.getSize());
			
//			//System.out.println("Total options count:"+ allOps.size());
//			for(int i=0;i<allOps.size();i++) 
//			{
//				s.selectByIndex(i);
//				Thread.sleep(1000);
//			}
//			s.deselectAll();
//			//deselecting all without deselectAll()
//			for(int i=0;i<allOps.size();i++) 
//			{
//				s.deselectByIndex(i);
//				Thread.sleep(1000);
//			}
//			//deselecting all without deselectAll() in reverse order
//					for(int i=allOps.size()-1;i>0;i--) 
//			{
//				s.deselectByIndex(i);
//				Thread.sleep(1000);
//			}
			//selecting set of options
//			for(int i=2;i<=5;i++) 
//			{
//				s.selectByIndex(i);
//				Thread.sleep(1000);
//			}
			//get all selected options
//			List<WebElement> alselops = s.getAllSelectedOptions();
//			Thread.sleep(4000);
//			for(int i=0;i<alselops.size();i++) {
//		System.out.println(alselops.get(i).getText());
//			}
//			System.out.println("total selected options :"+alselops.size());
//			s.deselectAll();
//			
//			//get first option from selected
//			WebElement alfropt = s.getFirstSelectedOption();
//			System.out.println("the first selected option is:"+alfropt.getText());
	//	
			
		}

		

	}


