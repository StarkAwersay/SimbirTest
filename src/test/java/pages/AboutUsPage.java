package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import waits.Waiting;

public class AboutUsPage {
    private WebDriver driver;

    public AboutUsPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "div[class*='resolve']>h1[class*='sfx']")
    private WebElement aboutUsTitle;

    @Step("Получение текста тайтла страницы")
    public String getAboutUsTitle() {
        String getAboutUsText = Waiting.waitingElementsDisplay(aboutUsTitle, driver).getText();
        return getAboutUsText;
    }
}
