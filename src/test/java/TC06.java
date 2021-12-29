import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class TC06 {
    WebDriver driver;

    @BeforeTest
    public void init(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("http://www.railway.somee.com/Account/Login.cshtml");
    }

    @Test(description = "TC06-My ticket, Change password and Logout tabs are displayed. Click 'My ticket' tab, user will be directed to My ticket page. Click 'Change password' tab, user will be directed to Change password page")
    public void TC06(){
        driver.findElement(By.xpath("//input[@name='username']")).sendKeys("trinam1403@gmail.com");
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Nam111111");
        driver.findElement(By.xpath("//input[@value='login']")).click();
        driver.findElement(By.xpath("//div[@id='menu']/ul/li/a[@href='/Account/ChangePassword.cshtml']")).click();

    }

    @AfterTest
    public void tearDown(){
        driver.quit();}

}
