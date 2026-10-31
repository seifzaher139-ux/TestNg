package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class JavaScriptPage {
    private WebDriver driver;
    private By alertbutton = By.xpath("//button[contains(text(),'Alert')]");
    private By confirmbutton = By.xpath("//button[contains(text(),'Confirm')]");
    private By promptbutton = By.xpath("//button[contains(text(),'Prompt')]");
    private By resulloca = By.id("result");


    public JavaScriptPage (WebDriver driver){
        this.driver=driver;

    }
    public void clickAlertButton(){
        driver.findElement(alertbutton).click();
    }
    public void clickconfirmButton(){
        driver.findElement(confirmbutton).click();
    }
    public void clickpromptButton(){
        driver.findElement(promptbutton).click();
    }
    public void acceptAlert(){
        driver.switchTo().alert().accept();
    }
    public void dismissConfirm(){
        driver.switchTo().alert().dismiss();
    }
    public void setPromptText(String text){
        driver.switchTo().alert().sendKeys(text);
    }
    public String getAlertMessage(){
        return driver.switchTo().alert().getText();
    }
    public String getResult(){
        return  driver.findElement(resulloca).getText();
    }

}
