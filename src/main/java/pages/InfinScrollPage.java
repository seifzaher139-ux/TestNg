package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class InfinScrollPage {
    private WebDriver driver;
    private By paragraphs = By.className("jscroll-added");
    public InfinScrollPage(WebDriver driver){
        this.driver=driver;
    }
    public void scrollToParag(int index){
        var js = (JavascriptExecutor)driver;
        String script ="window.scrollTo(0,document.body.scrollHeight);";
        while (getNumberOfParagraphs()<index){
            js.executeScript(script);
        }
    }
    public int getNumberOfParagraphs(){
       return driver.findElements(paragraphs).size();

    }
}
