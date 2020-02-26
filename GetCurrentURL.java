package adactinHotels;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCurrentURL {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\web drive kits\\BrowserDriver\\Chrome Driver\\chromedriver.exe");
		   WebDriver wd=new ChromeDriver();
		   wd.get("http://adactin.com/HotelAppBuild2/");
		   String x=wd.getCurrentUrl();
		   System.out.println(x);
           
	}

}
