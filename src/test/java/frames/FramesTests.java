package frames;

import base.BaseTests;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class FramesTests extends BaseTests {
    @Test
    public void testframes(){
       var nested= homePage.clickFrames().clickNestedFrames();
        assertTrue(nested.getBottomFrameText().contains("BOTTOM"),"nooo");
        assertTrue(nested.getLeftFrameText().contains("LEFT"),"noooleft");
    }
}
