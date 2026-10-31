package base;

import Navigation.WindowManager;
import com.google.common.io.Files;
import listeners.MyListeners;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.events.EventFiringDecorator;
import org.openqa.selenium.support.events.WebDriverListener;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import pages.HomePage;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

public class BaseTests {

    private WebDriver driver;
    protected HomePage homePage;


    @BeforeClass
    public void setup() {
        driver = new ChromeDriver(getChromOptions());
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    }
    @BeforeMethod
    public void goHome(){
        WebDriverListener listener = new MyListeners();
        WebDriver decorated = new EventFiringDecorator<>(listener).decorate(driver);
        decorated.get("https://the-internet.herokuapp.com/");
        setCookie();
        homePage = new HomePage(decorated);
    }
    @AfterMethod
    public void recordFailure(ITestResult result){
        if (ITestResult.FAILURE==result.getStatus())
        {
       var camera= (TakesScreenshot)driver;
        File screenshot = camera.getScreenshotAs(OutputType.FILE);
        System.out.println("Screenshot Taken As Path : " +screenshot.getAbsolutePath());
//            try {
//                Files.move(screenshot,new File("resources/screenshots/"+result.getName()+"test.png"));
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
        }

    }
    @AfterClass
    public void tearDown(){
        driver.quit();
    }


    public WindowManager getWindowManager(){
        return new WindowManager(driver);
    }

    private ChromeOptions getChromOptions(){
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--start-maximized");
        return chromeOptions;
    }

    private void setCookie(){
        Cookie cookie = new Cookie("Route","123");
        driver.manage().addCookie(cookie);
    }


}



















//    private By links = By.tagName("a");
//    private By inputslink = By.linkText("Inputs");
//        System.out.println(driver.getTitle());
//        List<WebElement> link = driver.findElements(links);
//        driver.findElement(inputslink).click();
//        System.out.println(link.size());
//        driver.manage().window().maximize();

//    public static void main(String[] args){
//        BaseTests baseTests =new BaseTests();
//        baseTests.setup();
//    }
//
//}

