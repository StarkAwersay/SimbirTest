package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HelpPage {
    private WebDriver driver;
    @FindBy(css = "div[class='l-list']>a[href*='save']")
    private WebElement saveProductButton;
    @FindBy(css = "section[class*='style']>h1")
    private WebElement saveProductText;

    public HelpPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    @Step("Нажатие на кнопку 'Спасти продукт'")
    public void saveProductButtonClick() {
        saveProductButton.click();
    }

    @Step("Получение текста тайтла страницы")
    public String saveProductText() {
        String textSaveProduct = saveProductText.getText();
        return textSaveProduct;
    }
}
