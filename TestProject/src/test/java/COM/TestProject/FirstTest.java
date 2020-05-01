package COM.TestProject;
import org.testng.annotations.Test;

import java.io.IOException;

public class FirstTest extends BasePage {

    @Test
    public void FTest() throws IOException, InterruptedException {
        GPage GP = new GPage(driver);
        GP.Search("Selenium");
    }
}
