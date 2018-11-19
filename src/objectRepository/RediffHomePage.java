package objectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RediffHomePage {
    WebDriver driver;

    public RediffHomePage(WebDriver driver) {
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(css = ".divicon.curhand")
    WebElement search;

    @FindBy(id = "srchword")
    WebElement searchBox;

    @FindBy(className ="newsrchbtn")
    WebElement searchbutton;


    public WebElement search(){
        return search;
    }
    public WebElement searchbox(){
        return searchBox;
    }
    public WebElement searchButton(){
        return searchbutton;
    }
}
