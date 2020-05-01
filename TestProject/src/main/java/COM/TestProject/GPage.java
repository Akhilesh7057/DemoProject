package COM.TestProject;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;

public class GPage {


    public WebDriver driver;


    By Search = By.name("q");
    By Selenium= By.xpath("//*[@id=\"rso\"]/div[1]/div/div[1]/a");
    By SearchBtn = By.name("btnK");

    public GPage(WebDriver driver) {
        this.driver = driver;
    }

    public void Search(String SearchText) throws IOException, InterruptedException {
        WebElement ser = driver.findElement(Search);
        ser.sendKeys(SearchText);
        Thread.sleep(1000);
        WebElement Btn = driver.findElement(SearchBtn);
        Btn.click();
        Thread.sleep(2000);
        WebElement Sel = driver.findElement(Selenium);
        Sel.click();
        
        

    }
    
    

}