package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private WebDriver driver;
//    private By formAuthenLink = By.linkText("Form Authentication");

    public HomePage(WebDriver driver){
        this.driver =driver;
    }

    public LoginPage ClickFormAuthen(){
//        driver.findElement(formAuthenLink).click();
        clickLink("Form Authentication");
        return new LoginPage(driver);
    }

    public DropdownPage clickDropDown(){
        clickLink("Dropdown");
        return new DropdownPage(driver);
    }

    private void clickLink(String LinkText){
        driver.findElement(By.linkText(LinkText)).click();
    }

}
