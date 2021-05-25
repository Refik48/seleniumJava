package day02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C04_IfElse {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\nihat\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://amazon.com");
        String amazonTitle = driver.getTitle();
        if(amazonTitle.toLowerCase().contains("computer")){ // buyuk kucuk harf duyarliligini kaldirdik.
            System.out.println(amazonTitle + " ' da computer kelimesi geciyor");
            // computer kelimesi gectigi icin bu kisim calisti ve sonuc ekranina yazdirdi.
        } else {
            System.out.println(amazonTitle + " ' da computer kelimesi gecmiyor");
        }
    }
}
