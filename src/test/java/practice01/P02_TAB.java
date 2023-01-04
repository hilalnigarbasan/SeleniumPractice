package practice01;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class P02_TAB {

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        //go to url : https://www.techlistic.com/p/selenium-practice-form.html
        driver.get("https://www.techlistic.com/p/selenium-practice-form.html");

        //fill the firstname
        WebElement firstName = driver.findElement(By.xpath("//*[@name='firstname']"));
        firstName.sendKeys("Hilal", //first name
                Keys.TAB,"Başan", //last name
                Keys.TAB,Keys.ARROW_RIGHT, //gender (female)
                Keys.TAB,Keys.ARROW_RIGHT,Keys.ARROW_RIGHT,Keys.ARROW_RIGHT, //years of experience
                Keys.TAB,"12/12/2022", //date
                Keys.TAB,Keys.TAB,Keys.SPACE, //profession
                Keys.TAB,Keys.TAB,Keys.TAB,Keys.SPACE, //automation tools
                Keys.TAB,"Antartica", //continents
                Keys.TAB,Keys.LEFT_CONTROL,Keys.SPACE,Keys.ARROW_DOWN,Keys.SPACE,Keys.ARROW_DOWN,Keys.SPACE); //selenium commands



    }
}