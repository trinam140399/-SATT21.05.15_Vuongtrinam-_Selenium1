import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class TC07 {
    WebDriver driver;

    @BeforeTest
    public void init(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("http://www.railway.somee.com/Page/HomePage.cshtml");
        driver.findElement(By.xpath("//div[@id='menu']/ul/li/a[@href='/Account/Register.cshtml']")).click();

    }

    @Test(description = "TC07-New account is created and message. Thank you for registering your account")
    public void TC07(){

        driver.findElement(By.xpath("//input[@name='email']")).sendKeys("trinam14033@gmail.com");
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Nam111111");
        driver.findElement(By.xpath("//input[@name='confirmPassword']")).sendKeys("Nam111111");
        driver.findElement(By.xpath("//input[@name='pid']")).sendKeys("112345678999");
        driver.findElement(By.xpath("//input[@value='Register']")).click();
    }

    @AfterTest
    public void tearDown(){
        driver.quit();}

}
