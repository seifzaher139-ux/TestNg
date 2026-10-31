package navigate;

import Navigation.WindowManager;
import base.BaseTests;
import org.testng.annotations.Test;

public class NavigationTests extends BaseTests {
    @Test
    public void testNavigation(){
        homePage.clickDynamic().clickEx1Link();

        getWindowManager().goBack();
        getWindowManager().goForward();
        getWindowManager().refresh();
        getWindowManager().goTo("https://anydesk.com/en/downloads/windows");



    }
}
