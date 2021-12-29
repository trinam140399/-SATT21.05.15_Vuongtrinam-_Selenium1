import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class TC11 {
    WebDriver driver;

    @BeforeTest
    public void init(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("http://www.railway.somee.com/Page/HomePage.cshtml");
        driver.findElement(By.xpath("//div[@id='menu']/ul/li/a[@href='/Account/Register.cshtml']")).click();

    }

    @Test(description = "TC11-Message:'There're errors in the form. Please correct the errors and try again.'  appears above the form." +
            "Next to password fields, error message 'Invalid password length.' displays. " +
            "Next to PID field, error message'Invalid ID length.' displays ")
    public void TC11(){

        driver.findElement(By.xpath("//input[@name='email']")).sendKeys("trinam14033@gmail.com");
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("");
        driver.findElement(By.xpath("//input[@name='confirmPassword']")).sendKeys("");
        driver.findElement(By.xpath("//input[@name='pid']")).sendKeys("");
        driver.findElement(By.xpath("//input[@value='Register']")).click();
    }

//    @AfterTest
//    public void tearDown(){
//        driver.quit();}

}
