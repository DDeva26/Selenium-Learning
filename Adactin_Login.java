package adactinHotels;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Adactin_Login {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\web drive kits\\BrowserDriver\\Chrome Driver\\chromedriver.exe");
		   WebDriver wd=new ChromeDriver();
		   wd.get("http://adactin.com/HotelAppBuild2/");
     wd.findElement(By.id("username")).sendKeys("Anilkumar123");
      wd.findElement(By.xpath(".//*[@id='password']")).sendKeys("Anilkumar123");
      wd.findElement(By.id("login")).click();
      Thread.sleep(2000);
      
      		
      		
	}

}
