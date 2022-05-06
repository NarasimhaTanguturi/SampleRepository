package Demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestClass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String name = "Narasimha";    
System.out.println("The name is: " +name);


System.setProperty("webdriver.chrome.driver", "C:\\Users\\naras\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.get("http://demo.guru99.com/test/upload/");
driver.manage().window().maximize();
Thread.sleep(5000);
WebElement uploadfile = driver.findElement(By.xpath("//*[@id=\"uploadfile_0\"]"));
uploadfile.sendKeys("C:\\Users\\naras\\OneDrive\\Desktop\\ques.txt");
driver.findElement(By.name("terms")).click();
driver.findElement(By.id("submitbutton")).click();
//String uploadResult = driver.findElement(By.xpath("/html/body/div[4]/div/div/div[2]/form/ul/li/div[2]/h3/center/text()[2]")).getText();
List<WebElement> divList = driver.findElements(By.xpath("/html/body/div[4]/div/div/div[2]/form/ul/li/div[2]/h3/center"));
for(WebElement uploadResult: divList)
{
System.out.println(uploadResult.getText());
}
	}

}
   





                            