package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import waits.Waiting;

public class ForIndustrialPage {
    private WebDriver driver;

    public ForIndustrialPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "h1[class*='title']")
    private WebElement forIndustrialTitle;

    @Step("Получение текста тайтла страницы")
    public String getForIndustrialTitle() {
        String getForIndustrialText = Waiting.waitingElementsDisplay(forIndustrialTitle, driver).getText();
        return getForIndustrialText;
    }
}
