package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AutomationForBusinessPage {
    private WebDriver driver;

    public AutomationForBusinessPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "h1[class*='title']")
    private WebElement automationForBusinessTitle;

    @Step("Получение текста тайтла страницы")
    public String getAutomationForBusinessTitle() {
        String getAutomationForBusinessText = automationForBusinessTitle.getText();
        return getAutomationForBusinessText;
    }
}
