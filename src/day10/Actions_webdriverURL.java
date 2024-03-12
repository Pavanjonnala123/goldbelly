package day10;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Actions_webdriverURL {

		public static void main(String[] args) throws InterruptedException {
			WebDriver driver= new ChromeDriver();
			driver.get("https://webdriveruniversity.com/Actions/index.html");
			driver.manage().window().maximize();
			
			WebElement from=driver.findElement(By.xpath("//div[@id=\"draggable\"]"));
			WebElement to=driver.findElement(By.xpath("//div[@id=\"droppable\"]"));
			Actions act=new Actions(driver);
			act.dragAndDrop(from, to).perform();
			
			WebElement dblclik=driver.findElement(By.id("double-click"));
	        act.doubleClick(dblclik).perform();
	        Thread.sleep(3000);
	        WebElement clck1=driver.findElement(By.xpath("//button[text()=\"Hover Over Me First!\"]"));
			act.moveToElement(clck1).click().perform();
			Thread.sleep(3000);
		    WebElement clck2=driver.findElement(By.xpath("//button[text()=\"Hover Over Me Second!\"]"));
		    act.moveToElement(clck2).click().perform();
		    Thread.sleep(3000);	
		    WebElement clck3=driver.findElement(By.xpath("//button[text()=\"Hover Over Me Third!\"]"));
	        act.moveToElement(clck3).click().perform();

	}

}
