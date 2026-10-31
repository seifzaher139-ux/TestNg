package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DynamicLoadingPage {
    private WebDriver driver;
    private By ex1  =By.partialLinkText("Example 1");

    public DynamicLoadingPage(WebDriver driver){
        this.driver=driver;
    }
    public Ex1Page clickEx1Link(){
        driver.findElement(ex1).click();
        return new Ex1Page(driver);
    }

}
