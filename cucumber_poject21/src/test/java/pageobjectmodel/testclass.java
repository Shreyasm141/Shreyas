package pageobjectmodel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testclass {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\s.mallikarjunaswam\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	    String url="http://demowebshop.tricentis.com/";
	    driver.manage().window().maximize();
	    driver.get(url);
        PageClass pobject= new PageClass(driver);
        pobject.clicklink();
        String username=null;
        pobject.username(username);
        String password=null;
        pobject.pass(password);
        pobject.out();
        pobject.logout();
        System.out.println("title of the page is "+driver.getTitle());
	}

}
