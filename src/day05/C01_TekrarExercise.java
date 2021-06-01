package day05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class C01_TekrarExercise {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\nihat\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        driver.get("http://amazon.com");

        WebElement searchKutusu = driver.findElement(By.id("twotabsearchtextbox"));
        searchKutusu.sendKeys("computers");

        WebElement searchButonu = driver.findElement(By.id("nav-search-submit-button"));
        searchButonu.click();
        // click yerine direkt submit ile de arama yapabilirdim.

        WebElement yaziElementi = driver.findElement(By.className("sg-col-inner"));
        System.out.println(yaziElementi); // 1-16 of over 3,000 results for "computers"

        if(yaziElementi.isDisplayed()) {
            System.out.println("Kac tane computers sonucu var oldugu yazisini goruyorum");
        } else {
            System.out.println("Gormuyorum");
        }

    }
}
