package authentication;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class check_in {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "D:\\mynewdriver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
//		driver.get("https://www.booking.com");
//		driver.findElement(By.xpath("//*[@id=\"frm\"]/div[1]/div[2]/div[1]/div[2]/div/div/div/div/span")).click();	
		
		String titleName = driver.getTitle();	
		System.out.print(titleName);
	driver.get("http://127.0.0.1:5500/index.html");
//	String myOptiontag = driver.findElement(By.tagName("option")).getText();
//	System.out.print(myOptiontag);
	List <WebElement> myListOfOptions= driver.findElements(By.tagName("option"));
	for(int i=0;i<myListOfOptions.size();i++) {
		
		System.out.print(myListOfOptions.get(i).getText());
		
	
	}
	
	}

}
