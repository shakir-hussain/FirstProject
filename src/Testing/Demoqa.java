package Testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demoqa {
	 static WebDriver driver;
	 
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\shaki\\eclipse-workspace\\automationtrainingcourse\\Drivers\\chromedriver.exe" );
		driver=new ChromeDriver();
		driver.get("https://demoqa.com/automation-practice-form");
		WebElement firstname=driver.findElement(By.xpath("//input[@id=\"firstName\"]"));
		firstname.sendKeys("Shakir");
		String a=firstname.getAttribute("value");
		System.out.println(a);
		if(a.equalsIgnoreCase("Shakir")) {
			System.out.println("name is correct");
		}
		else {
			System.out.println("name is incorrect");
		}
		
		Thread.sleep(2000);
		WebElement lastname=driver.findElement(By.xpath("//input[@id=\"lastName\"]"));
		lastname.sendKeys("Hussain");
		Thread.sleep(2000);
	    WebElement email=driver.findElement(By.xpath("//input[@id=\"userEmail\"]"));
	    email.sendKeys("shakirhussain_777@hotmail.com");
	    Thread.sleep(2000);
	    WebElement gender=driver.findElement(By.xpath("//label[contains(text(),'Male')]"));
	    gender.click();
		
	
	}
}
