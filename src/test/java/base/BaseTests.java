package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import pages.HomePage;

import java.util.List;

public class BaseTests {

    private WebDriver driver;
    protected HomePage homePage;


    @BeforeClass
    public void setup() {
        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");
        homePage = new HomePage(driver);
    }
    @AfterClass
    public void tearDown(){
        driver.quit();
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
