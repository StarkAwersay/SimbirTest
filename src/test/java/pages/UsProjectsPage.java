package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import waits.Waiting;

public class UsProjectsPage {
    private WebDriver driver;

    public UsProjectsPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "div[class*='hl']>h1[class*='mar']")
    private WebElement usProjectsTitle;

    @Step("Получение текста тайтла страницы")
    public String getUsProjectsTitleTitle() {
        String getAboutUsText = Waiting.waitingElementsDisplay(usProjectsTitle, driver).getText();
        return getAboutUsText;
    }
}
