package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import waits.Waiting;

public class SimbirFriendsPage {
    private WebDriver driver;

    public SimbirFriendsPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "section[class*='style']>h1")
    private WebElement simbirFriendsTitle;

    @Step("Получение текста тайтла страницы")
    public String getSimbirFriendsTitle() {
        String getSimbirFriendsText = Waiting.waitingElementsDisplay(simbirFriendsTitle, driver).getText();
        return getSimbirFriendsText;
    }
}
