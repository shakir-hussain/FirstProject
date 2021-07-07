package Testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Linktext {
     static WebDriver driver;
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\shaki\\eclipse-workspace\\automationtrainingcourse\\Drivers\\chromedriver.exe" );
		driver=new ChromeDriver();
		driver.get("https://demoqa.com/links");
		WebElement home=driver.findElement(By.linkText("Home"));
		home.click();
		String q=home.getText();
		System.out.println(q);
		
		if(q.equalsIgnoreCase("Home")) {
			System.out.println("correct");
		}
		else {
			System.out.println("Incorrect");
		}
		
		
	}

}
