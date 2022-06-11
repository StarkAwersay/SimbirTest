package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import waits.Waiting;

public class WriteUsPage {
    private WebDriver driver;

    public WriteUsPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id=\"body\"]/div[10]/div/div/div/div[2]/div[3]/div/form/div[1]/label/span[2]/input")
    private WebElement nameOrOrganization;
    @FindBy(xpath = "//*[@id=\"body\"]/div[10]/div/div/div/div[2]/div[3]/div/form/div[2]/label/span[2]/input")
    private WebElement phoneOrEmail;
    @FindBy(xpath = "//*[@id=\"body\"]/div[10]/div/div/div/div[2]/div[3]/div/form/div[3]/label/span[2]/textarea")
    private WebElement informationOfProject;
    @FindBy(css = "div[class*= 'state']>div>div[class*='add']")
    private WebElement attachFileButton;
    @FindBy(xpath = "//*[@id=\"body\"]/div[10]/div/div/div/div[2]/div[3]/div/form/div[6]/a/div[3]")
    private WebElement sendButton;
    @FindBy(xpath = "//*[@id=\"body\"]/div[10]/div/div/div/div[2]/div[3]/div/form/div[1]/label/span[2]")
    private WebElement nameOrOrganizationColor;
    @FindBy(xpath = "//*[@id=\"body\"]/div[10]/div/div/div/div[2]/div[3]/div/form/div[2]/label/span[2]")
    private WebElement phoneOrEmailColor;
    @FindBy(xpath = "//*[@id=\"body\"]/div[10]/div/div/div/div[2]/div[3]/div/form/div[3]/label/span[2]")
    private WebElement informationColor;

    @Step("Проверка наличия поля 'Имя или организация'")
    public void nameOrOrganizationShouldBeVisible() {
        Waiting.waitingElementsDisplay(nameOrOrganization, driver).isDisplayed();
    }
    @Step("Проверка наличия поля 'Телефон ли Email'")
    public void phoneOrEmailShouldBeVisible() {
        Waiting.waitingElementsDisplay(
                phoneOrEmail, driver).isDisplayed();
    }
    @Step("Проверка наличия поля 'Расскажите про проект'")
    public void informationOfProjectShouldBeVisible() {
        Waiting.waitingElementsDisplay(informationOfProject, driver).isDisplayed();
    }
    @Step("Проверка наличия кнопки 'Прикрепить файл до 10мб'")
    public void attachFileButtonShouldBeVisible() {
        Waiting.waitingElementsDisplay(attachFileButton, driver).isDisplayed();
    }
    @Step("Ввод данных в поле 'Имя или организация'")
    public void nameOrOrganizationInput(String name) {
        Waiting.waitingElementsDisplay(nameOrOrganization, driver).sendKeys(name);
    }
    @Step("Ввод данных в поле 'Телефон или Email'")
    public void phoneOrEmailInput(String phone) {
        Waiting.waitingElementsDisplay(phoneOrEmail, driver).sendKeys(phone);
    }
    @Step("Ввод данных в поле 'Расскажите про проект")
    public void informationOfProjectInput(String information) {
        Waiting.waitingElementsDisplay(informationOfProject, driver).sendKeys(information);
    }
    @Step("Нажатие на кнопку 'Отправить'")
    public void sendButtonClick() {
        sendButton.click();
    }
    @Step("Получение цвета поля 'Имя или организация'")
    public String getNameOrOrganizationColor() {
        String nameOrOrganizationColor = this.nameOrOrganizationColor.getCssValue("border-color");
        return nameOrOrganizationColor;
    }

    @Step("Получение цвета поля 'Телефон или Email'")
    public String getPhoneOrEmailColor() {
        String phoneOfEmailColor = phoneOrEmailColor.getCssValue("border-color");
        return phoneOfEmailColor;
    }

    @Step("Получение цвета поля 'Расскажите про проект'")
    public String getInformationColor() {
        String informationColor = this.informationColor.getCssValue("border-color");
        return informationColor;
    }
}
