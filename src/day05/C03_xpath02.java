package day05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class C03_xpath02 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\nihat\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        driver.get("http://a.testaddressbook.com/");

        WebElement welcomeYazisi = driver.findElement(By.tagName("h1"));
        welcomeYazisi.getText();

        // welcome yazimizda attribute mevcut degil ama xpath yonteminde bunun bir onemi yok.
        // Direkt olarak h1 yazinca da oluyor.
        WebElement welcomeYazisi2 = driver.findElement(By.xpath("//h1"));
        welcomeYazisi2.getText();
    }
}
