package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import waits.Waiting;

public class FinancePage {
    private WebDriver driver;

    public FinancePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(css = "h1[class*='title']")
    private WebElement financePageTitle;

    @Step("Получение текста тайтла страницы")
    public String  getTittle(){
       String pageTittle = Waiting.waitingElementsDisplay(financePageTitle,driver).getText();
       return pageTittle;
    }
}
