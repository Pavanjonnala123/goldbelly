package selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertsdemoqa {

public static void main(String[] args) 
{
    	WebDriver driver= new ChromeDriver();

		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		//simple alert
		driver.findElement(By.id("alertButton")).click();
		String simplmsg=driver.switchTo().alert().getText(); 
		System.out.println(simplmsg);
		driver.switchTo().alert().accept();
		
	    //driver.findElement(By.id("timerAlertButton")).click();
		//driver.switchTo().alert().accept();
		
		//confirmation alert
		driver.findElement(By.id("confirmButton")).click();
		String confmsg=driver.switchTo().alert().getText();
		System.out.println(confmsg);
		driver.switchTo().alert().accept();*/
		
		//prompt alert
		driver.findElement(By.id("promtButton")).click();
		String promtmsg=driver.switchTo().alert().getText();
		System.out.println(promtmsg);
		driver.switchTo().alert().sendKeys("Pavan");
		driver.switchTo().alert().accept();
			}
	}
