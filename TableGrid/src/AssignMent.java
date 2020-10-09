import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignMent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\work\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);  /*this is Implicit Wait */
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		WebElement table=driver.findElement(By.id("product"));
		int rows=table.findElements(By.tagName("tr")).size();
		System.out.println("The total rows are "+rows);
		int cols=table.findElements(By.tagName("tr")).get(0).findElements(By.tagName("th")).size();
		System.out.println("The total columns are "+cols);
		List <WebElement> secondrow=table.findElements(By.tagName("tr")).get(2).findElements(By.tagName("td"));
		for(int i=0;i<secondrow.size();i++)
		{
			System.out.println(secondrow.get(i).getText());
		}
		
		
	}

}
