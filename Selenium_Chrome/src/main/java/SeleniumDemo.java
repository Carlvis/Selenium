import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumDemo {

    public static void main(String[] args) {

        //initial setup of Selenium webdriver automation test using chromedriver.
        System.setProperty("webdriver.gecko.driver", "C:\\users\\chromedriver.exe" );
        Webdriver obj = new ChromeDriver();
        obj.get("https://www.google/com");
    }
}
