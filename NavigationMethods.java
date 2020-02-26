package adactinHotels;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationMethods {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\web drive kits\\BrowserDriver\\Chrome Driver\\chromedriver.exe");
		   WebDriver wd=new ChromeDriver();
		   wd.get("http://adactin.com/HotelAppBuild2/");
		   String x=wd.getCurrentUrl();
		   System.out.println(x);
		   //is used to open the open the current webpage
		   wd.navigate().to("https://www.amazon.in");
		   String y=wd.getCurrentUrl();
		   System.out.println(y);
		   Thread.sleep(2000);
		   //is used to move back one item from the  history
		   wd.navigate().back();
		   String z=wd.getCurrentUrl();
		   System.out.println(z);
		   Thread.sleep(2000);
		   //is used to move forward one item from the browser history
		   wd.navigate().forward();
		   String a=wd.getCurrentUrl();
		   System.out.println(a);
		   Thread.sleep(2000);
		   // is used to refresh the current page
		   wd.navigate().refresh();
		   Thread.sleep(2000);
		   wd.quit();

	}

}
