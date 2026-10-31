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
    public HoversPage clickHovers(){
        clickLink("Hovers");
        return new HoversPage(driver);
    }

    public KeyPressesPage clickPresses(){
        clickLink("Key Presses");
        return new KeyPressesPage(driver);
    }
    public JavaScriptPage clickJavaScriptAlerts(){
        clickLink("JavaScript Alerts");
        return new JavaScriptPage(driver);
    }
    public FramesPage clickFrames(){
        clickLink("Frames");
        return new FramesPage(driver);
    }
    public DynamicLoadingPage clickDynamic(){
        clickLink("Dynamic Loading");
        return new DynamicLoadingPage(driver);
    }
    public LargeAndDeepDomPage clickLargeAndDeepDom(){
        clickLink("Large & Deep DOM");
        return new LargeAndDeepDomPage(driver);
    }
    public InfinScrollPage clickInfinite(){
        clickLink("Infinite Scroll");
        return new InfinScrollPage(driver);
    }
    public MultipleWindowsPage clickMultipleWindows(){
        clickLink("Multiple Windows");
        return new MultipleWindowsPage(driver);
    }





    private void clickLink(String LinkText){
        driver.findElement(By.linkText(LinkText)).click();
    }

}
