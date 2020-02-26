package adactinHotels;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verified {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\web drive kits\\BrowserDriver\\Chrome Driver\\chromedriver.exe");
		   WebDriver wd=new ChromeDriver();
		   wd.get("http://adactin.com/HotelAppBuild2/");
		   String  a=wd.getTitle();
		   if(a.equals("AdactIn.com - Hotel Reservation System"))
		   {
			   System.out.println("the title is same");
		   }
		   else
		   {
			   System.out.println("the title is not same");
		   }
		   wd.close();

	}

}
