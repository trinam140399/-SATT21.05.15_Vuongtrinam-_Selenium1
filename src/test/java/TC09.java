import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class TC09 {
    WebDriver driver;

    @BeforeTest
    public void init(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("http://www.railway.somee.com/Account/Login.cshtml");
    }

    @Test(description = "TC09-Message: Your password has been updated appears")
    public void TC09(){
        driver.findElement(By.xpath("//input[@name='username']")).sendKeys("trinam1403@gmail.com");
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Nam11111");
        driver.findElement(By.xpath("//input[@value='login']")).click();
        driver.findElement(By.xpath("//div[@id='menu']/ul/li/a[@href='/Account/ChangePassword.cshtml']")).click();
        driver.findElement(By.xpath("//input[@name='currentPassword']")).sendKeys("Nam11111");
        driver.findElement(By.xpath("//input[@name='newPassword']")).sendKeys("Nam111111");
        driver.findElement(By.xpath("//input[@name='confirmPassword']")).sendKeys("Nam111111");
        driver.findElement(By.xpath("//input[@value='Change Password']")).click();
    }

    @AfterTest
    public void tearDown(){
        driver.quit();}

}
