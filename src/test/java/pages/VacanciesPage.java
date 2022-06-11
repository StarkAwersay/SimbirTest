package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import waits.Waiting;

public class VacanciesPage {
    private WebDriver driver;

    public VacanciesPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//h1[contains(text(),\"Вакансии\")]")
    private WebElement vacanciesPageTitle;
    @FindBy(css = "a[href*='java-developer']")
    private WebElement javaDeveloperButtonOnBlockVacancies;

    @Step("Получение текста тайтла страницы")
    public String getVacanciesPageTitle() {
        String vacanciesPageTitleText = Waiting.waitingElementsDisplay(vacanciesPageTitle, driver).getText();
        return vacanciesPageTitleText;
    }
    @Step("Нажатие на кнопку 'Java-разработчик' в блоке 'Вакансии'")
    public void clickJavaDeveloperButtonOnBlockVacancies() {
        Waiting.waitingElementsDisplay(javaDeveloperButtonOnBlockVacancies, driver).click();
    }
}
