package day04;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WindowType;
import utilities.TestBase;

public class C01_WindowHandle extends TestBase {
    @Test
    public void test01() {

        // 1- https://www.amazon.com sayfasına gidin
        driver.get("https://www.amazon.com");

        // 2- nutella icin arama yapın
        driver.findElement(By.xpath("twotabsearchtextbox")).sendKeys("nutella" + Keys.ENTER);

        // 3- yeni bir tab'da ilk urunun resmine tıklayınız
        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://www.amazon.com");

        // 4- yeni tab'da acilan urunun basligini yazdirin



        // 5- ilk sayfaya gecip url'i yazdırın







    }
}
