package Railway;

import org.openqa.selenium.By;

public class LoginPage extends GenaralPage{

    @FindBy(xpath = "//input[@id='username']")
    public WebElement getTxtUsername;

    @FindBy(xpath = "//input[@id='password']")
    public WebElement getTxtPassword;

    @FindBy(xpath = "//input[@value='login']")
    public WebElement getBtnLogin;

    @FindBy(xpath = "//input[@class='message error LoginForm']")
    public WebElement getlblLoginErrorMsg;

public HomePage login(String username, String password)
    {
        this.getTxtUsername.sendKeys(username);
        this.getTxtPassword.sendKeys(password);
        this.getBtnLogin().click();

        return new HomePage();
    }
}