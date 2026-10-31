package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;

public class HoversPage {
    private WebDriver driver;
    private By figureLocator = By.className("figure");
    private By figCaption = By.className("figcaption");
    public HoversPage (WebDriver driver){
        this.driver =driver;
    }

    public figCaption hoverOverfigure(int index){
        Actions actions = new Actions(driver);
        WebElement figure = driver.findElements(figureLocator).get(index-1);
        actions.moveToElement(figure).perform();
        return new figCaption(figure.findElement(figCaption));
    }

    public class figCaption{
        private WebElement caption;
        private By name = By.tagName("h5");
        private By link = By.tagName("a");

        public figCaption(WebElement caption){
            this.caption=caption;
        }

        public boolean isDisplayed(){
            return caption.isDisplayed();
        }
        public String getName (){
            return  caption.findElement(name).getText();
        }
        public String getLink (){
            return  caption.findElement(link).getText();
        }
        public String getUrl(){
            return caption.findElement(link).getAttribute("href");
        }



    }



}
