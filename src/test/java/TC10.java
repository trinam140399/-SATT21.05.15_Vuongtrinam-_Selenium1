import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class TC10 {
    WebDriver driver;

    @BeforeTest
    public void init(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("http://www.railway.somee.com/Page/HomePage.cshtml");
        driver.findElement(By.xpath("//div[@id='menu']/ul/li/a[@href='/Account/Register.cshtml']")).click();

    }

    @Test(description = "TC10-Message: There're errors in the form. Please correct the errors and try again")
    public void TC10(){

        driver.findElement(By.xpath("//input[@name='email']")).sendKeys("trinam140333@gmail.com");
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Nam111111");
        driver.findElement(By.xpath("//input[@name='confirmPassword']")).sendKeys("Nam11111111");
        driver.findElement(By.xpath("//input[@name='pid']")).sendKeys("112345678999");
        driver.findElement(By.xpath("//input[@value='Register']")).click();
    }

    @AfterTest
    public void tearDown(){
        driver.quit();}

}
