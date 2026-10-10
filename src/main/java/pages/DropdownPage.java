package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

public class DropdownPage {
    private WebDriver driver;
    private By dropDown = By.id("dropdown");

    public DropdownPage (WebDriver driver){
        this.driver =driver;
    }

    public void selectFromDropdown (String option){
//        Select dropdown = new Select(driver.findElement(dropDown));
//        dropdown.selectByContainsVisibleText(option);
       finDropDown().selectByContainsVisibleText(option);
    }
    public List<String> getSelectedOption (){
        List<WebElement> selectedElements =finDropDown().getAllSelectedOptions();
        List<String> selectedOptions = new ArrayList<>();
        for (WebElement element:selectedElements){
            selectedOptions.add(element.getText());
        }
        return selectedOptions ;
    }
    private Select finDropDown(){
        return new Select(driver.findElement(dropDown));
    }

}
