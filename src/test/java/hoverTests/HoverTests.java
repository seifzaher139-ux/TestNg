package hoverTests;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.HoversPage;

import static org.testng.Assert.*;

public class HoverTests extends BaseTests {
    @Test
    public void test(){
        var hoverspage = homePage.clickHovers();
        int figindex=1;
        var fig= hoverspage.hoverOverfigure(figindex);
        assertTrue(fig.isDisplayed(),"ddddd");
        assertTrue(fig.getName().contains("user"+figindex),"sssss");
//        assertEquals();
    }
}
