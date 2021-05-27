package day04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class C01_Clear_IsDisplayed {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\nihat\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        driver.get("http://a.testaddressbook.com");

        WebElement signInLinki = driver.findElement(By.id("sign-in"));
        signInLinki.click();

        WebElement emailKutusu = driver.findElement(By.id("session_email"));
        emailKutusu.sendKeys("abcdef@gmail.com");
        emailKutusu.clear(); // mail kutusu icinde yazilani siler.

        WebElement signInButonu = driver.findElement(By.name("commit"));
        signInButonu.isDisplayed(); // Web elementin gorunurlugunu bulur.
        if (signInButonu.isDisplayed()) { // web elementin gorunurlugunu sorguluyoruz.
            System.out.println("Evet gorunuyor");
        } else {
            System.out.println("Hayir gorunmuyor");
        }
    }
}
