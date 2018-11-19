package testCases;

import objectRepository.ReddiffLoginpage;
import objectRepository.RediffHomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class Loginapplication {
    @Test
    public void Login()throws InterruptedException{
        System.setProperty("webdriver.chrome.driver","C:\\Users\\syful\\eclipse-workspace\\pageObject\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
        ReddiffLoginpage loginpage=new ReddiffLoginpage(driver);
        loginpage.Emailid().sendKeys("Hello");
        loginpage.password().sendKeys("123456");
        loginpage.submit().click();
        loginpage.home().click();
        RediffHomePage homePage=new RediffHomePage(driver);
        homePage.search().click();
        Thread.sleep(3000);
        homePage.searchbox().sendKeys("iphone");
        homePage.searchButton().click();
    }
}
