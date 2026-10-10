package Login;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import pages.LoginPage;

public class LoginTests extends BaseTests {

    @Test
    public void testSuccessfullLogin(){
      LoginPage loginPage = homePage.ClickFormAuthen();
      loginPage.setUserNameField("tomsmith");
      loginPage.setPassField("SuperSecretPassword!");
      var secureAreaPage = loginPage.clickLogin();
      String message = secureAreaPage.getMessagge();
      Assert.assertEquals(message,"You logged into a secure area!\n×","You didn't login");

    }

}
