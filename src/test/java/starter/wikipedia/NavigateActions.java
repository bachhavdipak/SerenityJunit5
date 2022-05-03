package starter.wikipedia;

import net.serenitybdd.core.steps.UIInteractions;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

/**
 * UIInteractionSteps let us define action classes which regroup related actions.
 * The @Step annotation is used to indicate that this action will appear as a step in the reports.
 */
public class NavigateActions extends UIInteractions {
    @Step("Navigate to the home page")
    public void toTheHomePage() {
        openUrl("http://wikipedia.com/");
    }
    @Step("Navigate to the home page")
    public void SpecsaversHome() {
        openUrl("https://www.specsavers.co.uk/glasses/hg-06?sku=30766785");
        getDriver().findElement(By.xpath("//button[contains(text(),'Accept All Cookies')]")).click();
        getDriver().findElement(By.xpath("//*[contains(text(),'Virtual Try on')]")).click();


    }
}
