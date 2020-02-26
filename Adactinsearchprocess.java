package adactinHotels;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Adactinsearchprocess {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\web drive kits\\BrowserDriver\\Chrome Driver\\chromedriver.exe");
		   WebDriver wd=new ChromeDriver();
		   wd.get("http://adactin.com/HotelAppBuild2/");
		   
wd.findElement(By.id("username")).sendKeys("Anilkumar123");
wd.findElement(By.xpath(".//*[@id='password']")).sendKeys("Anilkumar123");
wd.findElement(By.id("login")).click();
Thread.sleep(2000);
new Select (wd.findElement(By.id("location"))).selectByIndex(1);
new Select(wd.findElement(By.id("hotels"))).selectByIndex(2);
new Select(wd.findElement(By.id("room_type"))).selectByIndex(3);
new Select(wd.findElement(By.id("room_nos"))).selectByIndex(2);
wd.findElement(By.id("datepick_in")).sendKeys("12/11/2018");
wd.findElement(By.id("datepick_out")).sendKeys("13/11/2018");
new Select(wd.findElement(By.id("adult_room"))).selectByIndex(2);
new Select(wd.findElement(By.id("child_room"))).selectByIndex(2);
wd.findElement(By.id("Submit")).click();
wd.findElement(By.id("radiobutton_0")).click();
wd.findElement(By.id("continue")).click();

wd.findElement(By.id("first_name")).sendKeys("DEVA");
wd.findElement(By.id("last_name")).sendKeys("sainath");
wd.findElement(By.id("address")).sendKeys("hyderabad");
wd.findElement(By.id("cc_num")).sendKeys("1234567891234567");
new Select(wd.findElement(By.id("cc_type"))).selectByIndex(1);
new Select(wd.findElement(By.id("cc_exp_month"))).selectByIndex(1);
new Select(wd.findElement(By.id("cc_exp_year"))).selectByValue("2021");
wd.findElement(By.id("cc_cvv")).sendKeys("123");
wd.findElement(By.id("book_now")).click();
wd.findElement(By.xpath(".//*[@id='logout']")).click();




	}

	
}

