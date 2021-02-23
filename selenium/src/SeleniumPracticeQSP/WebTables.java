package SeleniumPracticeQSP;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebTables {
public static void main(String[] args) {
WebDriver driver=null;
System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
driver=new FirefoxDriver();
driver.get("file:///C:/Users/lavan/Desktop/WebTables.html");
//rows
//WebElement table1 = driver.findElement(By.id("t1"));
//List<WebElement> tab2tr = table1.findElements(By.tagName("td"));
//System.out.println("Total2 rows count :"+tab2tr.size());

//data

//List<WebElement> td = driver.findElements(By.tagName("td"));
//System.out.println("Total datas count in the webpage:"+td.size());
//
//WebElement table2 = driver.findElement(By.id("t2"));
//List<WebElement> tab2td = table2.findElements(By.tagName("td"));
//System.out.println("Total2 rows count :"+tab2td.size());

//in table 2 2nd row element count
//WebElement row1 = driver.findElement(By.xpath("//table[@id='t1']//tr[2]"));
//List<WebElement> rowtd = row1.findElements(By.tagName("td"));
//System.out.println("Total datas count in table 2 row2:"+rowtd.size());


//Dynamic webtable
//5th column datacount
List<WebElement> tds = driver.findElements(By.xpath("//table[@id='t1']//tr[*]//td[4]"));
System.out.println(tds.size());

}
}
