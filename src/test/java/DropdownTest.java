import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class DropdownTest extends BaseTests {

    @Test
    public void testSelectOption(){
       var dropDownPage = homePage.clickDropDown();

       String option = "Option 1";
       dropDownPage.selectFromDropDown("Option 1");
       var selectedOptions = dropDownPage.getSelectedOption();
       // list should contain only 1 item;
        assertEquals(selectedOptions.size(), 1,"Incorrect number of selections");
        assertTrue(selectedOptions.contains(option), "Selected option is not Option 1");


    }

}
