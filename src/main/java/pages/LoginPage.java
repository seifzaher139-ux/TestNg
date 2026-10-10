package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    private WebDriver driver;
    private By UserNameField = By.id("username");
    private By passwordNameField = By.id("password");
    private By loginButton = By.cssSelector("#login >button");
    public LoginPage(WebDriver driver){
        this.driver=driver;
    }

   public void setUserNameField(String username){
        driver.findElement(UserNameField).sendKeys(username);
   }
   public void setPassField(String password){
        driver.findElement(passwordNameField).sendKeys(password);
   }
   public SecureAreaPage clickLogin(){
        driver.findElement(loginButton).click();
        return new SecureAreaPage(driver);
   }
}
