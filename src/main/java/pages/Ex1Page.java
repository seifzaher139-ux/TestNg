package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Ex1Page {
    private WebDriver driver;
    private By start = By.cssSelector("#start > button");
    private By loadmessa = By.id("finish");
    public Ex1Page(WebDriver driver){
        this.driver=driver;
    }
    public void clickOnStart(){
        driver.findElement(start).click();
    }
    public String getLinkText(){

//        try {
//            Thread.sleep(5000);
//        } catch (InterruptedException e) {
//                e.printStackTrace();
//        }
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.presenceOfElementLocated(loadmessa));
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(loadmessa)));
        return driver.findElement(loadmessa).getText();
    }
}
