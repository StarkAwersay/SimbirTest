package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductEvaluationPage {
    private WebDriver driver;

    public ProductEvaluationPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "h1[class*='atom']")
    private WebElement productEvaluationText;

    @Step("Получение текста тайтла страницы")
    public String getProductEvaluationText() {
        String productEvaluationTittle = productEvaluationText.getText();
        return productEvaluationTittle;
    }

}
