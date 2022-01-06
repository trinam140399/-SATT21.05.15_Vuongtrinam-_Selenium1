package Common;

import org.openqa.selenium.WebDriver;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.TimeUnit;

public class Constant {
    public static WebDriver WEBDRIVER;
    public static final String RAILWAY_URL = "http://www.raillog.somee.com/Page/HomePage.cshtml";
    public static final String USENAME = "trinam1403@gmail.com";
    public static final String PASSWORD = "Nam11111";
    public static String date;
    public static void getDate(int day) {
        Constant.WEBDRIVER.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
        DateTimeFormatter formatters = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        LocalDate addDay = LocalDate.now().plusDays(day);
        date = formatters.format(addDay);
        if (date.charAt(0) == '0'){
            date = date.substring(1);
        }
    }
    public static void getWait() {
        WEBDRIVER.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
    }
}
