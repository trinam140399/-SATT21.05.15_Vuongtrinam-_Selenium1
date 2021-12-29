import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class TC05 {
    WebDriver driver;

    @BeforeTest
    public void init(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("http://www.railway.somee.com/Account/Login.cshtml");
    }

    @Test(description = "TC05-User can't login and message. You have used 4 out of 5 login attempts. After all 5 have been used, you will be unable to login for 15 minutes")
    public void TC05(){
        driver.findElement(By.xpath("//input[@name='username']")).sendKeys("trinam1403@gmail.com");
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Nam123465");
        driver.findElement(By.xpath("//input[@value='login']")).click();
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Nam123465");
        driver.findElement(By.xpath("//input[@value='login']")).click();
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Nam123465");
        driver.findElement(By.xpath("//input[@value='login']")).click();
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Nam123465");
        driver.findElement(By.xpath("//input[@value='login']")).click();
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Nam123465");
        driver.findElement(By.xpath("//input[@value='login']")).click();
    }

    @AfterTest
    public void tearDown(){
        driver.quit();
    }

}
