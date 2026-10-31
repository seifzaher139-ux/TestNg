package Navigation;

import org.openqa.selenium.WebDriver;

import java.util.Set;

public class WindowManager {
    private WebDriver driver;
    public WindowManager(WebDriver driver){
        this.driver=driver;
    }
    public void goBack(){
        driver.navigate().back();
    }
    public void goForward(){
        driver.navigate().forward();
    }
    public void refresh(){
        driver.navigate().refresh();
    }
    public void goTo(String url){
        driver.navigate().to(url);
    }
    public void SwichToTab (String tabTitle){
      Set<String> widowHandels = driver.getWindowHandles();
       for(String windowHandel:widowHandels){
           System.out.println("The Current Window Handel Is"+windowHandel);
           driver.switchTo().window(windowHandel);
           if (driver.getTitle().equals(tabTitle)){
               break;}
       }


    }

}
