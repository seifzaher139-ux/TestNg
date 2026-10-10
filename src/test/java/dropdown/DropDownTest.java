package dropdown;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;


public class DropDownTest extends BaseTests {
    @Test
    public void testDropdown(){
        var dropDownPage = homePage.clickDropDown();
        String option = "Option 1";
        dropDownPage.selectFromDropdown(option);
       List<String> selectedOption= dropDownPage.getSelectedOption();
        assertEquals(selectedOption.size(),1," noooo");
        assertTrue(selectedOption.contains(option)," neaaah");
    }
}
