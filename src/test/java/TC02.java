import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class TC02 {
    WebDriver driver;

    @BeforeTest
    public void init(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("http://www.railway.somee.com/Account/Login.cshtml");
    }

    @Test
    public void TC02(){
        driver.findElement(By.xpath("//input[@name='username']")).sendKeys("");
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("");
        driver.findElement(By.xpath("//input[@value='login']")).click();
    }

//    @AfterTest
//    public void tearDown(){
//        driver.quit();
//    }

}