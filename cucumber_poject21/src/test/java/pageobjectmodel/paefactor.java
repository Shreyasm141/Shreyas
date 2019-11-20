package pageobjectmodel;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class paefactor {
  @Test
  public void f() {
	  	System.setProperty("webdriver.chrome.driver","C:\\Users\\s.mallikarjunaswam\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	    String url="http://demowebshop.tricentis.com/";
	    driver.manage().window().maximize();
	    driver.get(url);
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    
	    pageclasswpf locateElements=PageFactory.initElements(driver, pageclasswpf.class);
	    locateElements.loginMethod("aishwaryamusale123@gmail.com", "Aish12");
	    locateElements.logout.click();
  }
}
