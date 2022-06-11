package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import waits.Waiting;

public class CareerPage {
    private WebDriver driver;

    public CareerPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "div[class*='hl']>h1[class*='mar']")
    private WebElement careerTitle;
    @FindBy(xpath = "//span[contains(text(),\"Какой\")]")
    private WebElement firstQuestionOnBlockQuestionAnswer;
    @FindBy(xpath = "//span[contains(text(),\"Что\")]")
    private WebElement secondQuestionOnBlockQuestionAnswer;
    @FindBy(xpath = "//span[contains(text(),\"В каких\")]")
    private WebElement thirdQuestionOnBlockQuestionAnswer;
    @FindBy(xpath = "//span[contains(text(),\"Как быстро\")]")
    private WebElement forthQuestionOnBlockQuestionAnswer;
    @FindBy(xpath = "//span[contains(text(),\"Сколько\")]")
    private WebElement fifthQuestionOnBlockQuestionAnswer;
    @FindBy(xpath = "//span[contains(text(),\"Какие\")]")
    private WebElement sixthQuestionOnBlockQuestionAnswer;
    @FindBy(xpath = "//span[contains(text(),\"Я студент\")]")
    private WebElement seventhQuestionOnBlockQuestionAnswer;
    @FindBy(xpath = "//p[contains(text(),\"40 часов\")]")
    private WebElement firstAnswerOnBlockQuestionAnswer;
    @FindBy(xpath = "//p[contains(text(),\"Независимо\")]")
    private WebElement secondAnswerOnBlockQuestionAnswer;
    @FindBy(xpath = "//p[contains(text(),\" Мы создаем\")]")
    private WebElement thirdAnswerOnBlockQuestionAnswer;
    @FindBy(xpath = "//p[contains(text(),\"Уровень заработной\")]")
    private WebElement forthAnswerOnBlockQuestionAnswer;
    @FindBy(xpath = "//p[contains(text(),\"Уровень дохода\")]")
    private WebElement fifthAnswerOnBlockQuestionAnswer;
    @FindBy(xpath = "//p[contains(text(),\"С первого \")]")
    private WebElement sixthAnswerOnBlockQuestionAnswer;
    @FindBy(xpath = "//p[contains(text(),\"В университетах\")]")
    private WebElement seventhAnswerOnBlockQuestionAnswer;
    @FindBy(xpath = "//span[contains(text(),\"Имя\")]/following-sibling::span")
    private WebElement nameFieldOnBlockLeaveTourContactsColor;
    @FindBy(css = "input[name*='text_9']")
    private WebElement nameFieldOnBlockLeaveTourContacts;
    @FindBy(xpath = "//span[contains(text(),\" Телефон или\")]/following-sibling::span")
    private WebElement phoneFieldOnBlockLeaveTourContactsColor;
    @FindBy(css = "input[name*='text_10']")
    private WebElement phoneFieldOnBlockLeaveTourContacts;
    @FindBy(xpath = "//div[contains(text(),\" Прикрепить резюме\")]")
    private WebElement attachFileButtonLeaveTourContacts;
    @FindBy(css = "div[class*='form-state-error']>form>div>a[class*='is-button']")
    private WebElement sendButtonLeaveTourContacts;
    @FindBy(xpath = "//a[contains(text(),\"Отправить резюме\")]")
    private WebElement sendResumeButton;
    @FindBy(css = "div[class*='is-box-form sfx-line-resolve']")
    private WebElement leaveYourContactBlock;

    @Step("Получние текста тайтла страницы")
    public String getCareerTitle() {
        String getCareerText = Waiting.waitingElementsDisplay(careerTitle, driver).getText();
        return getCareerText;
    }

    @Step("Нажатие на кнопку, содержащую первый вопрос")
    public void clickOnFirstQuestionOnBlockQuestionAnswer() {
        Waiting.waitingElementsDisplay(firstQuestionOnBlockQuestionAnswer, driver).click();
    }

    @Step("Нажатие на кнопку, содержащую второй вопрос")
    public void clickOnSecondQuestionOnBlockQuestionAnswer() {
        Waiting.waitingElementsDisplay(secondQuestionOnBlockQuestionAnswer, driver).click();
    }

    @Step("Нажатие на кнопку, содержащую третий вопрос")
    public void clickOnThirdQuestionOnBlockQuestionAnswer() {
        Waiting.waitingElementsDisplay(thirdQuestionOnBlockQuestionAnswer, driver).click();
    }

    @Step("Нажатие на кнопку, содержащую четвёртый вопрос")
    public void clickOnForthQuestionOnBlockQuestionAnswer() {
        Waiting.waitingElementsDisplay(forthQuestionOnBlockQuestionAnswer, driver).click();
    }

    @Step("Нажатие на кнопку, содержащую пятый вопрос")
    public void clickOnFifthQuestionOnBlockQuestionAnswer() {
        Waiting.waitingElementsDisplay(fifthQuestionOnBlockQuestionAnswer, driver).click();
    }

    @Step("Нажатие на кнопку, содержащую шестой вопрос")
    public void clickOnSixthQuestionOnBlockQuestionAnswer() {
        Waiting.waitingElementsDisplay(sixthQuestionOnBlockQuestionAnswer, driver).click();
    }

    @Step("Нажатие на кнопку, содержащую седьмой вопрос")
    public void clickOnSeventhQuestionOnBlockQuestionAnswer() {
        Waiting.waitingElementsDisplay(seventhQuestionOnBlockQuestionAnswer, driver).click();
    }

    @Step("Получение текста ответа на первый вопрос")
    public String getFirstAnswerOnBlockQuestionAnswerText() {
        String firstAnswerOnBlockQuestionAnswerText = Waiting.waitingElementsDisplay(firstAnswerOnBlockQuestionAnswer, driver).getText();
        return firstAnswerOnBlockQuestionAnswerText;
    }

    @Step("Получение текста ответа на второй вопрос")
    public String getSecondAnswerOnBlockQuestionAnswerText() {
        String secondAnswerOnBlockQuestionAnswerText = Waiting.waitingElementsDisplay(secondAnswerOnBlockQuestionAnswer, driver).getText();
        return secondAnswerOnBlockQuestionAnswerText;
    }

    @Step("Получение текста ответа на третий вопрос")
    public String getThirdAnswerOnBlockQuestionAnswerText() {
        String thirdAnswerOnBlockQuestionAnswerText = Waiting.waitingElementsDisplay(thirdAnswerOnBlockQuestionAnswer, driver).getText();
        return thirdAnswerOnBlockQuestionAnswerText;
    }

    @Step("Получение текста ответа на четвёртый вопрос")
    public String getForthAnswerOnBlockQuestionAnswerText() {
        String forthAnswerOnBlockQuestionAnswerText = Waiting.waitingElementsDisplay(forthAnswerOnBlockQuestionAnswer, driver).getText();
        return forthAnswerOnBlockQuestionAnswerText;
    }

    @Step("Получение текста ответа на пятый вопрос")
    public String getFifthAnswerOnBlockQuestionAnswerText() {
        String fifthAnswerOnBlockQuestionAnswerText = Waiting.waitingElementsDisplay(fifthAnswerOnBlockQuestionAnswer, driver).getText();
        return fifthAnswerOnBlockQuestionAnswerText;
    }

    @Step("Получение текста ответа на шестой вопрос")
    public String getSixthAnswerOnBlockQuestionAnswerText() {
        String sixthAnswerOnBlockQuestionAnswerText = Waiting.waitingElementsDisplay(sixthAnswerOnBlockQuestionAnswer, driver).getText();
        return sixthAnswerOnBlockQuestionAnswerText;
    }

    @Step("Получение текста ответа на седьмой вопрос")
    public String getSeventhAnswerOnBlockQuestionAnswerText() {
        String seventhAnswerOnBlockQuestionAnswerText = Waiting.waitingElementsDisplay(seventhAnswerOnBlockQuestionAnswer, driver).getText();
        return seventhAnswerOnBlockQuestionAnswerText;
    }

    @Step("Ввод данных в поле Имя")
    public void nameInput(String name) {
        Waiting.waitingElementsDisplay(nameFieldOnBlockLeaveTourContacts, driver).sendKeys(name);
    }

    @Step("Ввод данных в поле Телефон или Email")
    public void phoneOrEmailInput(String phone) {
        Waiting.waitingElementsDisplay(phoneFieldOnBlockLeaveTourContacts, driver).sendKeys(phone);
    }

    @Step("Проверка наличия кнопки прикрепить резюме")
    public void attachFileButtonLeaveTourContactsShouldBeVisible() {
        Waiting.waitingElementsDisplay(attachFileButtonLeaveTourContacts, driver).isDisplayed();
    }

    @Step("Нажатие на кнопку отправить")
    public void clickSendButtonLeaveTourContacts() {
        Waiting.waitingElementsDisplay(sendButtonLeaveTourContacts, driver).click();
    }

    @Step("Получение цвета поля Имя")
    public String getNameFieldColor() {
        String nameOrOrganizationColor = nameFieldOnBlockLeaveTourContactsColor.getCssValue("border-color");
        return nameOrOrganizationColor;
    }

    @Step("Получение цвета поля Телефон или Email")
    public String getPhoneOrEmailFieldColor() {
        String phoneOfEmailColor = phoneFieldOnBlockLeaveTourContactsColor.getCssValue("border-color");
        return phoneOfEmailColor;
    }
    @Step("Нажатие на кнопку отправить резюме в блоке'SimbirSoft'")
    public void clickSendResumeButton() {
        Waiting.waitingElementsDisplay(sendResumeButton, driver).click();
    }
}
