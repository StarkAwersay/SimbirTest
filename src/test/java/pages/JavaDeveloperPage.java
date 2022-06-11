package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import waits.Waiting;

public class JavaDeveloperPage {
    private WebDriver driver;

    public JavaDeveloperPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//h1[contains(text(),\"Java-разработчик\")]")
    private WebElement javaDeveloperPageTitle;
    @FindBy(css = "[name*='text_9']")
    private WebElement nameFieldOnBlockLeaveYourContact;
    @FindBy(css = "[name*='text_10']")
    private WebElement phoneOrEmailFieldOnBlockLeaveYourContact;
    @FindBy(xpath = "//span[contains(text(),\"Телефон или\")]")
    private WebElement phoneOrEmailFieldColor;
    @FindBy(css = "a[class*='is-button-submit js-form-submit']")
    private WebElement sendButtonOnBlockLeaveYourContact;

    @Step("Получение текста тайтла страницы")
    public String getJavaDeveloperPageTitle() {
        String javaDeveloperPageText = Waiting.waitingElementsDisplay(javaDeveloperPageTitle, driver).getText();
        return javaDeveloperPageText;
    }

    @Step("Ввод данных в поле Имя")
    public void inputDataInNameField() {
        nameFieldOnBlockLeaveYourContact.sendKeys("Иванов Иван Иванович");
    }

    @Step("Ввод данных в поле Телефон или Email")
    public void inputDataInPhoneOrEmailField() {
        phoneOrEmailFieldOnBlockLeaveYourContact.sendKeys("Ivan@mail.ru");
    }

    @Step("Получение Цвета поля Телефон или Email")
    public String getTextPhoneOrEmailColor() {
        String phoneOfEmailColor = Waiting.waitingElementsDisplay(phoneOrEmailFieldColor, driver).getCssValue("border-color");
        return phoneOfEmailColor;
    }

    @Step("Нажитие на кнопку отправить")
    public void clickSendButtonOnBlockLeaveYourContact() {
        Waiting.waitingElementsDisplay(sendButtonOnBlockLeaveYourContact,driver).click();
    }
}
