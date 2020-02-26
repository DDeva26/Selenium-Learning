package adactinHotels;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTextandGetAttribute {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		//GetText is used to read the static value or static msg from the webpage
		//GetAttribute is used to read the dynamic value from the webpage
		System.setProperty("webdriver.chrome.driver","D:\\web drive kits\\BrowserDriver\\Chrome Driver\\chromedriver.exe");
		   WebDriver wd=new ChromeDriver();
		   wd.get("http://adactin.com/HotelAppBuild2/");
		   String a=(wd.findElement(By.xpath("html/body/table[2]/tbody/tr/td[1]/p[1]"))).getText();
				   System.out.println(a);
		   
  wd.findElement(By.id("username")).sendKeys("Anilkumar123");
  String b=(wd.findElement(By.id("username"))).getAttribute("value");
  System.out.println(b);
   wd.findElement(By.xpath(".//*[@id='password']")).sendKeys("Anilkumar123");
   String c=(wd.findElement(By.xpath(".//*[@id='password']"))).getAttribute("value");
   System.out.println(c);
   wd.findElement(By.id("login")).click();
   Thread.sleep(2000);

	}

}
