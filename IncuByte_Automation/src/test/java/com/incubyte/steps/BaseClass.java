package com.incubyte.steps;
import com.incubyte.pageObjects.LoginPage;
import com.incubyte.helper.GenericHelper;
import com.incubyte.settings.TextContext;
import org.openqa.selenium.WebDriver;

public class BaseClass {
    public WebDriver driver;
    TextContext textContext;
    LoginPage loginPage;
    GenericHelper genericHelper;

    public BaseClass( TextContext context) {
        textContext = context;
        driver=textContext.getWebDriverManager();
        loginPage=textContext.getLoginPage();
        genericHelper=textContext.getGenericHelper();
    }
}
