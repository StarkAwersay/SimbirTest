package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import waits.Waiting;

public class BlogPage {
    private WebDriver driver;

    public BlogPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "div[class*='hl']>h1")
    private WebElement blogText;
    @FindBy(css = "div[class*='news']>div[class*='next']>svg")
    private WebElement nextButtonOnNewsSlider;
    @FindBy(css = "div[class*='item']>a[href*='dream']")
    private WebElement dreamTeamSlide;
    @FindBy(css = "div[class*='state-ready']>label>span[class*='input']")
    private WebElement emailFieldStayUpToDateBlockColor;
    @FindBy(css = "div[class*='fields']>div>form>div>a[class*='form-submit']")
    private WebElement subscribeButton;
    @FindBy(css = "div[class*='is-slider-i']>div[class*='next']")
    private WebElement nextButtonOnSliderIndustries;

    public String getBlockText() {
        String textBlock = blogText.getText();
        return textBlock;
    }

    @Step("Получение текста тайтла страницы")
    public void clickNextButtonOnNewsSlider() {
        nextButtonOnNewsSlider.click();
    }

    @Step("Проверка наличия слайда dreamTeam")
    public void dreamTeamSlideShouldBeVisible() {
        Waiting.waitingElementsDisplay(dreamTeamSlide, driver).isDisplayed();
    }

    @Step("Нажатие на кнопку подписаться")
    public void clickSubscribeButton() {
        subscribeButton.click();
    }

    @Step("Получение цвета поля Email")
    public String getEmailColor() {
        String emailColor = emailFieldStayUpToDateBlockColor.getCssValue("border-color");
        return emailColor;
    }

    @Step("Нажатие на кнопку далее в блое 'Отрасли'")
    public void nextButtonOnSliderIndustriesClick() {
        Waiting.waitingElementsDisplay(nextButtonOnSliderIndustries, driver).click();
    }
}
