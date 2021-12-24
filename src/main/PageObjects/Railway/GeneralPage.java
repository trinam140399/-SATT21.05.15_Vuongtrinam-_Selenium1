package Railway;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Constant.Constant;

public class GeneralPage {

    private final By tablogin = By.xpath("//div[@id='menu']//a[@hef='/Account/Login.cshtml']");
    private final By tablogout = By.xpath("//div[@id='menu']//a[@hef='/Account/Logout']");
    private final By lbWelcomeMessage = By.xpath("//div[@class='account']/strong");


    protected WebElement getTablogin(){
        return Constant.WEBDRIVER.findElement(tablogin);
    }

    protected WebElement getTablogout(){
        return Constant.WEBDRIVER.findElement(tablogout);
    }

    protected WebElement getTablogout(){
        return Constant.WEBDRIVER.findElement(lbWelcomeMessage);
    }

    public String getWelcomeMessage()
    {
        return this.getWelcomeMessage().getText();
    }

    protected LoginPage gotoLoginPage()
    {
        this.getTablogin().click();
        return new LoginPage();
    }
}