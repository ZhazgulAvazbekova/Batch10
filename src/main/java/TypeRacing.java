import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class TypeRacing {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriverManager.edgedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://play.typeracer.com/");
        WebElement enterRacerLink = driver.findElement(By.linkText("Enter a typing race"));
        enterRacerLink.click();

        WebElement timeToBegin = driver.findElement(By.cssSelector("div.popupContent div.timeDisplay span.time"));
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        System.out.println();

    }
}
