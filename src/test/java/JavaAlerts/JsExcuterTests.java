package JavaAlerts;

import base.BaseTests;
import org.testng.annotations.Test;

public class JsExcuterTests extends BaseTests {
    @Test
    public void testScrollToTable(){
       var Large= homePage.clickLargeAndDeepDom();
       Large.scrollToTable();
    }
    @Test
    public void testScrollToParagraph(){
        homePage.clickInfinite().scrollToParag(5);
    }
}
