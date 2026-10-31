package Wait;

import base.BaseTests;
import org.testng.annotations.Test;
import static org.testng.Assert.*;
public class WaitTest extends BaseTests {
    @Test
    public void testwaits(){
        var ex1Page =homePage.clickDynamic().clickEx1Link();
        ex1Page.clickOnStart();
        assertEquals(ex1Page.getLinkText(),"Hello World!",
                "no Text");
    }
}
