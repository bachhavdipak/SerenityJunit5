package starter.wikipedia;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.serenitybdd.core.Serenity;
import org.junit.BeforeClass;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import static net.serenitybdd.core.Serenity.getDriver;

public class SwitchToNewTab {

    WebDriver driver ;

/*    @BeforeClass
    public void setUp () {
        WebDriverManager.chromiumdriver().setup();
        driver = new ChromeDriver();
        driver.get("https://testproject.io/");
        System.out.println(driver.getTitle());
    }
    @Test
    public void openNewTabForTestProjectPlatform () {

            WebDriver newTab = driver.switchTo().newWindow(WindowType.TAB);
            newTab.get("https://www.google.com/");
            System.out.println("New Tab Page Title:" + newTab.getTitle());

    }*/

/*    @Test
    public void openNewTab() {
        WebDriverManager.chromiumdriver().setup();
//        Serenity.getDriver() = new ChromeDriver();
        getDriver()..
        WebDriver newTab =    getDriver().switchTo().newWindow(WindowType.TAB);
        newTab.get("https://www.google.com/");
        System.out.println("New Tab Page Title:" + newTab.getTitle());
    }*/



/*    @BeforeClass
    public static  void setUp () throws InterruptedException {
        WebDriverManager.chromiumdriver().setup();
        Serenity.getDriver().get("https://testproject.io/");
        Serenity.getDriver().manage().window().maximize();
        System.out.println(Serenity.getDriver().getTitle());
        Thread.sleep(10000);
    }*/

  /*  @Test
    public void openNewWindowForTestProjectBlog () throws InterruptedException {

*//*
        WebDriver newWindow = Serenity.getDriver().switchTo().newWindow(WindowType.TAB);
        newWindow.get("https://www.google.com/");
        System.out.println(Serenity.getDriver().getTitle());
        Thread.sleep(10000);
*//*
//        Serenity.getDriver().get("https://www.selenium.dev/");

        Serenity.getDriver().switchTo().newWindow(WindowType.TAB);

        Serenity.getDriver().get("https://www.google.com/");

    }*/

}
