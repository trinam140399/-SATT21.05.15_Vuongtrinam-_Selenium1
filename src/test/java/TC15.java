import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class TC15 {
    WebDriver driver;

    @BeforeTest
    public void init(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("http://www.railway.somee.com/Account/Login.cshtml");
        driver.findElement(By.xpath("//div[@id='menu']/ul/li/a[@href='/Account/Login.cshtml']")).click();
    }

    @Test(description = "TC15-'Book ticket' page is loaded with correct 'Depart from' and 'Arrive at' values")

    public void TC15(){
        driver.findElement(By.xpath("//input[@name='username']")).sendKeys("trinam1403@gmail.com");
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Nam111111");
        driver.findElement(By.xpath("//input[@value='login']")).click();
        driver.findElement(By.xpath("//div[@id='menu']/ul/li/a[@href='TrainTimeListPage.cshtml']")).click();
        driver.findElement(By.xpath("//td[text()='Huế']/following-sibling::td[text()='Sài Gòn']/ ../td[count(//th[text()='Depart Time']/preceding-sibling::th)+4]/a[@href='BookTicketPage.cshtml?id1=5&id2=1']")).click();
        driver.findElement(By.xpath("//input[@value='Book ticket']")).click();

    }

    @AfterTest
    public void tearDown(){
        driver.quit();
    }

}
