package Railway;

import org.openqa.selenium.chorme.ChormeDriver;
import ong.testng.annotations.AfterWethod;
import org.testng.annotations.BeforeMethod;

import Common.Utilities;
import Constant..Constant;

public class LoginTest {

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("Pre-conditior");

        System.setProperty( "webdriver.chrome.driver", Utilities.getProjectPath()
                        + "\\Executables\\chromedriver.exe") ;

        Constant.WEBDRTVER = new ChromeDriver();

        Constant.WEBDRTVER.manage().window().maximize( ;

        @AfterMethod
        public void afterMethod() {

            System.out.println("Post-condition") ;

            Constant.WEBDRIVER.quit();

            @Test
            public void TC01() {
                System.out.print]n("TC01 - Usen can log into Railway with valid username and password")
                        HomePage homePage = neu HonePage();
                        honePage.open();
                LoginPage loginPage = homePage.gotoLoginPage();
                String actualMsg = loginPage.login(Constant.USERNAHE, Constant.USERNAME).getWelcomeMassage();
                String expectedMsg = "Welcome" + Constant.USERNAME;

                Asset.assertEquals(actualMsg,expectedMsg,"Welcome message is not displayed as expected");

            }
         }

    }
}

