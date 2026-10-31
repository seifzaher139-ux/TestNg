package navigate;

import Navigation.WindowManager;
import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NewWindowTests extends BaseTests {
    @Test
    public void testSwichtoTab(){
       var newWindowPage= homePage.clickMultipleWindows().clicklinkl();
       getWindowManager().SwichToTab("New Window");
       String headerText =newWindowPage.getHeaderText();
        Assert.assertEquals(headerText,"New Window","Wrong Context");
    }
}
