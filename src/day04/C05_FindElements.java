package day04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class C05_FindElements {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\nihat\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        driver.get("http://a.testaddressbook.com");

        // Bir web sayfasinda birden fazla ayni isimli tag name varsa
        List<WebElement> listem = driver.findElements(By.tagName("a"));
        // a olan birden cok tag var. Onlarin hepsini getir dedim 1'den fazla oldugu icin data type'i "List" oldu.
        for (WebElement w : listem) {
            System.out.println(w.getText());
        }

        // for(int i=0; i<elements.size() ; i++ ) {
        //    System.out.println(elements.get(i).getText());
        // }

    }
}
