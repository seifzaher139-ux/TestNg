package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class KeyPressesPage {
    private WebDriver driver;
    private By input = By.id("target");
    private By resultmessage = By.id("result");
    public KeyPressesPage (WebDriver driver){
        this.driver=driver;
    }
    public void enterText(String text){
        driver.findElement(input).sendKeys(text);
    }
    public String getResultMessage(){
        return driver.findElement(resultmessage).getText();
    }
}
