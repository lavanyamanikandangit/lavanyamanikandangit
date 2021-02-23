package SeleniumPracticeQSP;




	import java.util.HashSet;
	import java.util.LinkedHashSet;
	import java.util.List;
	import java.util.Set;
	import java.util.TreeSet;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.support.ui.Select;

	public class HandlingDuplicate {
		 
		public static void main(String[] args) throws InterruptedException {
			WebDriver driver=null;
			System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
			 driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("file:///C:/Users/lavan/Desktop/dropdown.html");
			Thread.sleep(2000);
	//1.print the option as it is..(list)
//			WebElement ddAddr=driver.findElement(By.id("Taj"));
//			Select s=new Select(ddAddr);
//			List<WebElement> allOptions = s.getOptions();
//			
////			for (int i=0;i<allOptions.size();i++) {
//			for(WebElement opt:allOptions) {
//				System.out.println(opt.getText());
//			}
			
	//2.Remove duplicate
			WebElement ddAddr=driver.findElement(By.id("Taj"));
			Select s=new Select(ddAddr);
			List<WebElement> allOptions = s.getOptions();//gettting all the address of all obj
//			
			Set<String> s1=new HashSet();//store the obj in hashset which is empty
			
			for(WebElement opt:allOptions) {
			String	text=opt.getText();//addres converted to the text
			s1.add(text);//added to the hashset and its stored in set
			
			}
			for(String text:s1) {
				System.out.println(text);//print in the hashset obj
			}
//			
	//3.Remove duplicate and maintain the order of insertion
			
//			WebElement ddAddr=driver.findElement(By.id("Taj"));
//			Select s=new Select(ddAddr);
//			List<WebElement> allOptions = s.getOptions();//gettting all the address of all obj
//			
//			Set<String> s1=new LinkedHashSet();//it is remove duplicate and maintain order of insertion and store the obj in hashstwhich is empty
////			
//			for(WebElement opt:allOptions) {
//			String	text=opt.getText();//addres converted to the text
//			s1.add(text);//added to the hashset and its stored in set
////				
//			}
//			for(String text:s1) {
//				System.out.println(text);//print in the hashset obj
//			}
	//4.Remove the duplicate and sort it(ascending order)
//			WebElement ddAddr=driver.findElement(By.id("Taj"));
//			Select s=new Select(ddAddr);
//			List<WebElement> allOptions = s.getOptions();//gettting all the address of all obj
//			
//			Set<String> s1=new TreeSet();//it is remove duplicate and maintain sorted order  and store the obj in hashstwhich is empty
//			
//			for(WebElement opt:allOptions) {
//			String	text=opt.getText();//addres converted to the text
//			s1.add(text);//added to the hashset and its stored in set
//				
//			}
//			for(String text:s1) {
//				System.out.println(text);//print in the hashset obj
//			}
//			
		}

	}




