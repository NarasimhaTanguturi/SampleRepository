package Demo;

import java.awt.Desktop.Action;
import java.util.List;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestClass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String name = "Narasimha";    
System.out.println("The name is: " +name);

//System.setProperty("webdriver.chrome.driver", "C:\\Users\\naras\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
//WebDriver driver = new ChromeDriver();
//#Implementing the usage of WebDriver manager

ChromeOptions co = new ChromeOptions();
//Code to run the operation in Headless mode(Shadow/Hide)        
//co.setHeadless(true);                                         

//co.addArguments("--disable-infobars");
DesiredCapabilities dcap = new DesiredCapabilities();
dcap.setCapability(ChromeOptions.CAPABILITY, co);

WebDriver driver = WebDriverManager.chromedriver().capabilities(co).create();


driver.get("https://demos.devexpress.com/aspxeditorsdemos/ListEditors/MultiSelect.aspx");  
/*driver.manage().window().maximize();
Thread.sleep(5000);
WebElement multiOptions = driver.findElement(By.xpath("//*[@id=\"ContentHolder_lbFeatures_D\"]")); 
multiOptions.click();
Select multiSelect = new Select(multiOptions);
List<WebElement> l = multiSelect.getOptions();
System.out.println("Options are: ");
for (WebElement i: l){ 
   System.out.println(i.getText());
}
System.out.println();*/

//multiSelect.keyDown(Keys.CONTROL).click(multiOptions.get(0)).click(multiOptions.get(1)).perform();
Thread.sleep(10000);
//*[@id="basicBootstrapForm"]/div[7]/div/multi-select/div[2]/ul



driver.findElement(By.id("ContentHolder_lbSelectionMode_I")).click();
driver.findElement(By.id("ContentHolder_lbSelectionMode_DDD_L_LBI1T0")).click();
Thread.sleep(5000);

// Perform Multiple Select
Actions builder = new Actions(driver);
WebElement select = driver.findElement(By.id("ContentHolder_lbFeatures_LBT"));
List<WebElement> options = select.findElements(By.tagName("td"));

System.out.println(options.size());
org.openqa.selenium.interactions.Action multipleSelect = builder.keyDown(Keys.CONTROL).click(options.get(2)).click(options.get(4)).click(options.get(6)).build();

multipleSelect.perform();
driver.close();


	}
}
