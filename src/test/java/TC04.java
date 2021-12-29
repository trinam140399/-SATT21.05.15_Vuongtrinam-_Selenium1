import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class TC04 {
    WebDriver driver;

    @BeforeTest
    public void init(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("http://www.railway.somee.com/Page/BookTicketPage.cshtml");
    }

    @Test(description = "TC04-Login page displays instead of Book ticket page")
    public void TC04(){
        driver.get("http://www.railway.somee.com/Account/Login.cshtml?ReturnUrl=/Page/BookTicketPage.cshtml");
    }

    @AfterTest
    public void tearDown(){
        driver.quit();
    }

}
