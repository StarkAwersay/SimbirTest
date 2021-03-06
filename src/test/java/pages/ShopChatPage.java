package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShopChatPage {
    private WebDriver driver;

    public ShopChatPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "h1[class*='atom']")
    private WebElement shopChatTitle;

    @Step("Получение текста тайтла страницы")
    public String getShopChatTitle() {
        String getShopChatText = shopChatTitle.getText();
        return getShopChatText;
    }
}
