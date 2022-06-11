package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FoodTechPage {
    private WebDriver driver;

    public FoodTechPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "h1[class*='title']")
    private WebElement foodTechTitle;

    @Step("Получение текста тайтла страницы")
    public String giveFoodTechTitle() {
        String foodTechText = foodTechTitle.getText();
        return foodTechText;
    }
}
