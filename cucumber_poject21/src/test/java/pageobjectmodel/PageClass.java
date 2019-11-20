package pageobjectmodel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PageClass {
	WebDriver driver;
	By lnc=By.linkText("Log in");
	By uname=By.name("Email");
	By pwd=By.name("Password");
	By xp=By.xpath("//input[@value='Log in']");
	By xx=By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a");
	public PageClass(WebDriver driver) {
		this.driver=driver;
	}
	public void clicklink() {
		driver.findElement(lnc).click();
	}
	public void username(String username) {
		driver.findElement(uname).sendKeys("aishwaryamusale123@gmail.com");
	}
	public void pass(String password) {
		driver.findElement(pwd).sendKeys("Aish12");
	}
	public void out() {
		driver.findElement(xp).click();
	}
	public void logout() {
		driver.findElement(xx).click();
	}
}
