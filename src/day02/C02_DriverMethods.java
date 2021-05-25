package day02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_DriverMethods {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\nihat\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("http://google.com");
        driver.navigate().to("http://amazon.com");

        String amazonTitle = driver.getTitle();
        // Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more
        // Amazonun Title'ni aldik ve yazdirdik.
        System.out.println("Amazonun Title'si : " + amazonTitle);

        String amazonUrl = driver.getCurrentUrl();
        System.out.println("Amazon URL : " + amazonUrl); // Amazon URL : https://www.amazon.com/

    }
}
