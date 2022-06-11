package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DataSciencePage {
    private WebDriver driver;

    public DataSciencePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "h1[class*= 'title']")
    private WebElement dataScienceTittle;

    @Step("Получение текста тайтла страницы")
    public String getDataScienceText() {
        String dataScienceText = dataScienceTittle.getText();
        return dataScienceText;
    }
}
