import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableGrid {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	System.setProperty("webdriver.chrome.driver", "C:\\work\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);  /*this is Implicit Wait */
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.get("https://www.cricbuzz.com/live-cricket-scorecard/30380/rr-vs-kkr-12th-match-indian-premier-league-2020");
	WebElement table=driver.findElement(By.cssSelector(".cb-col.cb-col-100.cb-ltst-wgt-hdr"));
	int rowcount=table.findElements(By.cssSelector(".cb-col.cb-col-100.cb-scrd-itms")).size();
	int count=table.findElements(By.cssSelector(".cb-col.cb-col-100.cb-scrd-itms div:nth-child(3)")).size();
	int total=0;
	//System.out.println(rowcount);
	//System.out.println(count);
	for(int i=0; i<count-2;i++)
	{
		System.out.println(table.findElements(By.cssSelector(".cb-col.cb-col-100.cb-scrd-itms div:nth-child(3)")).get(i).getText());
		String digit=table.findElements(By.cssSelector(".cb-col.cb-col-100.cb-scrd-itms div:nth-child(3)")).get(i).getText();
		int j=Integer.parseInt(digit); 
		total=total+j;
	}
	System.out.println(table.findElement(By.xpath("//div[text()='Extras']/following-sibling::div")).getText());
	String p=table.findElement(By.xpath("//div[text()='Extras']/following-sibling::div")).getText();
	int j=Integer.parseInt(p); 
	total=total+j;
	
	
	System.out.println(table.findElement(By.xpath("//div[text()='Total']/following-sibling::div")).getText());
	System.out.println(total);
	}
}