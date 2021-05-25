package day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_IlkDers {
    public static void main(String[] args) {
    System.setProperty("webdriver.chrome.driver",
            "C:\\Users\\nihat\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");
    // File -> Project Structure -> Modules -> Dependencies ->
    // + Isaretine tikliyoruz -> JARs and Directories ->
    // Selenium Depencies klasorunun oldugu yere gidiyoruz ->
    // selenium dependencies -> libraries -> libs -> Toplam 7 dosyayi secip ekliyoruz

    WebDriver driver = new ChromeDriver();
    // ChromeDriver'dan nesne olusturduk.
    // driver'in data type'i WebDriver.

    driver.get("http://google.com");
    // get method'u Istedigimiz bir sayfaya gidebilmemize yariyor.
    driver.get("http://amazon.com");

    driver.close(); // driver'da acik olan sayfayi kapatir.

    driver.quit(); // driver'imizin butun sekmeleriyle tamamen kapatir.

    }
}
