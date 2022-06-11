package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InsurancePage {
    private WebDriver driver;

    public InsurancePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id=\"rec148019295\"]/div/div/div[4]/h1/span")
    private WebElement insuranceTittleText;

    @Step("Получение текста тайтла страницы")
    public String getInsuranceText() {
        String insuranceTittle = insuranceTittleText.getText();
        return insuranceTittle;
    }
}
