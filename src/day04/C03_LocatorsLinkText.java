package day04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class C03_LocatorsLinkText {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\nihat\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        driver.get("http://a.testaddressbook.com");

        // Bir link varsa (ustune tiklayarak gittigimiz yerler) o linke By.linkText method'u ile click yapabiliriz.
        // Ya ismi oldugu gibi yazariz veya inceleden <a> </a> arasinda yazilani aliriz ikisi de aynidir.
        WebElement signInLinki = driver.findElement(By.linkText("Sign in"));
        signInLinki.click();

        // WebElement homeLinki = driver.findElement(By.linkText("Home"));
        // Incele kisminda Home yazisi etrafinda bir suru bosluk var o yuzden hata veriyor.
        // O yuzden boyle olan yerlerde partialLinkText kullanilir.
        // partialLinkText : Bir linkin icindeki yazinin bir kismina gore bulduruyoruz.
        WebElement homeLinki = driver.findElement(By.partialLinkText("Home"));
        homeLinki.click();
    }
}
