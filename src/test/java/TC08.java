import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class TC08 {
    WebDriver driver;

    @BeforeTest
    public void init(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("http://www.railway.somee.com/Page/HomePage.cshtml");
        driver.findElement(By.xpath("//div[@id='menu']/ul/li/a[@href='/Account/Login.cshtml']")).click();

    }

    @Test(description = "TC08-User can't login and message. Invalid username or password. Please try again.")
    public void TC08(){

        driver.findElement(By.xpath("//input[@name='username']")).sendKeys("trinam1403333@gmail.com");
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Nam111111");
        driver.findElement(By.xpath("//input[@value='login']")).click();
    }

//    @AfterTest
//    public void tearDown(){
//        driver.quit();}

}
