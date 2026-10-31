package JavaAlerts;

import base.BaseTests;

import io.qameta.allure.*;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class JavaAlertTests extends BaseTests {
    @Test
    @Epic("Js")
    @Feature("Alerts")
    @Story("Alert")
    @Severity(SeverityLevel.BLOCKER)
    @Description("This tests the alert")
    public void testJSAlerts(){
       var JsAlertPage = homePage.clickJavaScriptAlerts();
       JsAlertPage.clickAlertButton();
       assertEquals(JsAlertPage.getAlertMessage(),"I am a JS Alert","aaaaaaaa");
       JsAlertPage.acceptAlert();
       assertEquals(JsAlertPage.getResult(),"You successfully clicked an alert","zzzzz");
    }
    @Test
    @Epic("Js")
    @Feature("Alerts")
    @Story("Confirm")
    @Severity(SeverityLevel.CRITICAL)
    @Description("This tests the Confirm")
    public void testJSConfirm(){
       var JsAlertPage = homePage.clickJavaScriptAlerts();
       Allure.step("Clicking Confirm Button");
       JsAlertPage.clickconfirmButton();
       assertEquals(JsAlertPage.getAlertMessage(),"I am a JS Confirm","xxxxx");
       JsAlertPage.dismissConfirm();
       assertEquals(JsAlertPage.getResult(),"You clicked: Cance","bbbbb");
    }
    @Test
    @Epic("Js")
    @Feature("Alerts")
    @Story("Prompt")
    @Severity(SeverityLevel.NORMAL)
    @Description("This tests the Prompt")
    public void testJSPrompt(){
       var JsAlertPage = homePage.clickJavaScriptAlerts();
       JsAlertPage.clickpromptButton();
       assertEquals(JsAlertPage.getAlertMessage(),"I am a JS prompt","mmmm");
       JsAlertPage.setPromptText("Route");
       JsAlertPage.acceptAlert();
       assertEquals(JsAlertPage.getResult(),"You entered: Rout","ccc");
    }
}
