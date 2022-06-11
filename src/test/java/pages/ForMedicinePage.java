package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import waits.Waiting;

public class ForMedicinePage {
    private WebDriver driver;

    public ForMedicinePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "h1[class*='title']")
    private WebElement forMedicinePageTitle;

    @Step("Получение текста тайтла страницы")
    public String getForMedicinePageTitle() {
        String getForMedicinePageText = Waiting.waitingElementsDisplay(forMedicinePageTitle, driver).getText();
        return getForMedicinePageText;
    }
}
