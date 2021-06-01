package day04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class C02_Exercise_ClassNamelerAyni {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\nihat\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        driver.get("http://a.testaddressbook.com");

        WebElement signInLinki = driver.findElement(By.id("sign-in")); // className'i ile buldum.
        signInLinki.click();

        WebElement emailKutusu = driver.findElement(By.className("form-control"));
        emailKutusu.sendKeys("abcdef@gmail.com");

        WebElement password = driver.findElement(By.className("form-control"));
        password.sendKeys("1234");
        // mail ile sifreyi mail kutusu icerisine yazdi. abcdef@gmail.com1234 seklinde.
        // Cunku ikisinin className'i form-control'dur. Program ayirt edemez ve ilk buldugu form-control'e yazar.
    }
}
