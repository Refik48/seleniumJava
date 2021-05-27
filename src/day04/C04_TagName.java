package day04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class C04_TagName {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\nihat\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        driver.get("http://a.testaddressbook.com");

        WebElement homeTagName = driver.findElement(By.tagName("a"));
        homeTagName.click();
        // tagName tercih edecegimiz bir yontem degil. Cunku bir tag name birden cok kullanmis olabilir.
        // Ayni olan tag name'lerde ilk sirada yer alan uzerinden islem yapacaktir.

        String homeYazisi = homeTagName.getText();
        System.out.println("Home elementinin yazisi : " + homeYazisi);
        // Home elementinin yazisi : Home
        // (current)
    }
}
