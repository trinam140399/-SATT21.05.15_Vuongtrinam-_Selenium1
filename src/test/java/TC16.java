import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class TC16 {
    WebDriver driver;

    @BeforeTest
    public void init(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("http://www.railway.somee.com/Account/Login.cshtml");
        driver.findElement(By.xpath("//div[@id='menu']/ul/li/a[@href='/Account/Login.cshtml']")).click();
    }

    @Test(description = "TC16-The canceled ticket is disappeared.")

    public void TC16(){
        driver.findElement(By.xpath("//input[@name='username']")).sendKeys("trinam1403@gmail.com");
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Nam111111");
        driver.findElement(By.xpath("//input[@value='login']")).click();
        driver.findElement(By.xpath("//div[@id='menu']/ul/li/a[@href='/Page/BookTicketPage.cshtml']")).click();
        driver.findElement(By.xpath("//input[@value='Book ticket']")).click();
        driver.findElement(By.xpath("//div[@id='menu']/ul/li/a[@href='/Page/ManagerTicket.cshtml']")).click();
        driver.findElement(By.xpath("//*[@id='content']/form/div[2]/div/table/tbody/tr[3]/td[11]/input")).click();

    }

    @AfterTest
    public void tearDown(){
        driver.quit();
    }

}
