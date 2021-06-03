package newpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.firefox.FirefoxDriver;
//comment the above line and uncomment below line to use Chrome
import org.openqa.selenium.chrome.ChromeDriver;
public class MyClass {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","G:\\chromedriver.exe");
    	WebDriver driver = new ChromeDriver();
        
//    	String baseUrl = "http://www.popuptest.com/popuptest2.html";
        //String tagName = "";
        
        driver.get("https://www.selenium.dev/");
        //tagName = driver.findElement(By.id("email")).getTagName();
        //System.out.println(tagName);
        
        WebElement about=driver.findElement(By.id("aboutArrow"));
        about.click();
        WebElement aboutOption = driver.findElement(By.tagName("about"));
        aboutOption.click();
	}

}
