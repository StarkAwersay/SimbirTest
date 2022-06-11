package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import waits.Waiting;


public class MainPage extends PageFactory {
    private WebDriver driver;

    public MainPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "div[class*='tools']>a[href='/en/']")
    private WebElement changeLanguageButton;
    @FindBy(css = "div[class*='iv-header']>h1")
    private WebElement mainText;
    @FindBy(css = "div[class*='gf']>a[href*= 'portfolio']")
    private WebElement bottomMenuPortfolioButton;
    @FindBy(css = "div[class*='gf']>a[href*= 'vacancies']")
    private WebElement bottomMenuVacanciesButton;
    @FindBy(css = "div[class*='gf']>a[href*= 'company']")
    private WebElement bottomMenuCompanyButton;
    @FindBy(css = "div[class*='gf']>a[href*= 'blog']")
    private WebElement bottomMenuBlogButton;
    @FindBy(css = "div[class*='gf']>a[href*= 'career']")
    private WebElement bottomMenuCareerButton;
    @FindBy(css = "div[class*='gf']>a[href*= 'friends']")
    private WebElement bottomMenuFriendsButton;
    @FindBy(css = "div[class*='gf']>a[href*= 'contacts']")
    private WebElement bottomMenuContactsButton;
    @FindBy(css = "div[class*='gh']>div[class*='item']>a[href*='company']")
    private WebElement bottomMenuAboutUsButton;
    @FindBy(css = "div[class*='gf-i']>a[href*= 'tel']")
    private WebElement phoneNumber;
    @FindBy(css = "div[class*='gf-i']>a[href*= 'mail']")
    private WebElement mail;
    @FindBy(css = "div>a[class*='button-a']")
    private WebElement buttonOk;
    @FindBy(css = "div[class*='is-w']>div[class*= 'gh-nav']")
    private WebElement topMenu;
    @FindBy(css = "div[class*='gh-tools']>a[class*= 'feedback']")
    private WebElement feedbackButton;
    @FindBy(css = "div[class*='sfx']>div[class*= 'services']")
    private WebElement servicesBlock;
    @FindBy(css = "#body > div.is-main-layout > div.main-layout-content > div > div > div:nth-child(3)")
    private WebElement clientsBlock;
    @FindBy(css = "div[class*='box-projects']")
    private WebElement projectsBlock;
    @FindBy(css = "div[class='is-box-awards sfx-line-resolve']")
    private WebElement awardsBlock;
    @FindBy(xpath = "//*[@id=\"body\"]/div[6]/div[1]/div/div/div[7]")
    private WebElement articleBlock;
    @FindBy(xpath = "//*[@id=\"body\"]/div[6]/div[1]/div/div/div[8]")
    private WebElement vacanciesBlock;
    @FindBy(css = "div[class='gf-row gf-row-a']")
    private WebElement bottomMenu;
    @FindBy(css = "div[class='gf-row gf-row-c']")
    private WebElement socialNetworkBlock;
    @FindBy(css = "div[class*='is-w']>div>div>a[href='/portfolio/']")
    private WebElement projectsButtonTopMenu;
    @FindBy(css = "div[class*='is-w']>div>div>a[href='/help/']")
    private WebElement serviceButtonTopMenu;
    @FindBy(css = "div[class*='item']>div[class*='link']")
    private WebElement decisionButtonTopMenu;
    @FindBy(css = "div[class*='is-w']>div>div>a[href='/blog/']")
    private WebElement blogButtonTopMenu;
    @FindBy(css = "div[class*='is-w']>div>div>a[href='/vacancies/']")
    private WebElement vacanciesButtonTopMenu;
    @FindBy(css = "div[class*='is-w']>div>div>a[href='/career/']")
    private WebElement careerButtonTopMenu;
    @FindBy(css = "div[class*='is-w']>div>div>a[href='/company/']")
    private WebElement companyButtonTopMenu;
    @FindBy(css = "div[class*='is-w']>div>div>a[href='/contacts/']")
    private WebElement contactsButtonMenu;
    @FindBy(css = "div[class*='swiper']>a[href*='foodtech']>div>div")
    private WebElement foodTechButton;
    @FindBy(css = "div[class='l-list']>a[href*='save']")
    private WebElement saveProductButton;
    @FindBy(css = "section[class*='style']>h1")
    private WebElement saveProductText;
    @FindBy(css = "div[class*='nav']>[href*='finance']")
    private WebElement forBanksButton;
    @FindBy(css = "div[class*='nav']>[href*='insurance']")
    private WebElement insuranceButton;
    @FindBy(css = "div[class*='nav']>[href*='estimater']")
    private WebElement productEvaluationButton;
    @FindBy(css = "div[class*='nav']>[href*='data']")
    private WebElement dataScienceButton;
    @FindBy(css = "div[class*='nav']>[href*='crm']")
    private WebElement automationBusinessButton;
    @FindBy(css = "div[class*='nav']>[href*='shopchat']")
    private WebElement shopChatButton;
    @FindBy(css = "div[class*='nav']>[href*='foodtech']")
    private WebElement foodTecButton;
    @FindBy(css = "div[class*='nav']>[href*='industrial']")
    private WebElement forIndustrialButton;
    @FindBy(css = "div[class*='nav']>[href*='medtech']")
    private WebElement forMedicineButton;
    @FindBy(css = "div[class*='gh']>a[href*='friends']")
    private WebElement simbirFriendsButton;
    @FindBy(css = "div[class*='gh']>a[href*='processes']")
    private WebElement ourProcessesButton;
    @FindBy(css = "body>div>div>a>svg")
    private WebElement simbirSoftButton;
    @FindBy(xpath = "//h1[contains(text(),\" Создаём\")]")
    private WebElement mainPageTitle;

    @Step("Нажатие на кнопку En 'Поменять язык'")
    public void changeLanguage() {
        changeLanguageButton.click();
    }

    @Step("Получение текста тайтла после смены языка")
    public String mainText() {
        String textAfterChangeLanguage = mainText.getText();
        return textAfterChangeLanguage;
    }

    @Step("Проверка наличия кнопки 'проекты' в верхнем меню")
    public void bottomMenuPortfolioButtonShouldBeVisible() {
        Waiting.waitingElementsDisplay(bottomMenuPortfolioButton, driver).isDisplayed();
    }

    @Step("Проверка наличия кнопки 'вакансии' в верхнем меню")
    public void bottomMenuVacanciesButtonShouldBeVisible() {
        Waiting.waitingElementsDisplay(bottomMenuVacanciesButton, driver).isDisplayed();
    }

    @Step("Проверка наличия кнопки 'О нас' в верхнем меню")
    public void bottomMenuCompanyButtonShouldBeVisible() {
        Waiting.waitingElementsDisplay(bottomMenuCompanyButton, driver).isDisplayed();
    }

    @Step("Проверка наличия кнопки 'Блог' в верхнем меню")
    public void bottomMenuBlogButtonShouldBeVisible() {
        Waiting.waitingElementsDisplay(bottomMenuBlogButton, driver).isDisplayed();
    }

    @Step("Проверка наличия кнопки 'Карьера' в верхнем меню")
    public void bottomMenuCareerButtonShouldBeVisible() {
        Waiting.waitingElementsDisplay(bottomMenuCareerButton, driver).isDisplayed();
    }

    @Step("Проверка наличия кнопки 'SimbirFriends' в верхнем меню")
    public void bottomMenuFriendsButtonShouldBeVisible() {
        Waiting.waitingElementsDisplay(bottomMenuFriendsButton, driver).isDisplayed();
    }

    @Step("Проверка наличия кнопки 'о нас' в верхнем меню")
    public void bottomMenuAboutUsButtonShouldBeVisible() {
        Waiting.waitingElementsDisplay(bottomMenuAboutUsButton, driver).isDisplayed();
    }

    @Step("Проверка наличия кнопки 'Контакты' в верхнем меню")
    public void bottomMenuContactsButtonShouldBeVisible() {
        Waiting.waitingElementsDisplay(bottomMenuContactsButton, driver).isDisplayed();
    }

    @Step("Проверка наличия кнопки с номером телефона в нижнем меню")
    public void phoneNumberShouldBeVisible() {
        Waiting.waitingElementsDisplay(phoneNumber, driver).isDisplayed();
    }

    @Step("Проверка наличия кнопки с почтой в нижнем меню")
    public void mailShouldBeVisible() {
        Waiting.waitingElementsDisplay(mail, driver).isDisplayed();
    }

    @Step("Нажатие на кнопку 'Ок' для разрешения использования cookies")
    public void clickOnButtonOk() {
        buttonOk.click();
    }

    @Step("Нажатие на кнопку 'Блог' в верхнем меню")
    public void clickOnBottomMenuBlogButton() {
        bottomMenuBlogButton.click();
    }

    @Step("Проверка наличия верхнего меню")
    public void topMenuShouldBeVisible() {
        Waiting.waitingElementsDisplay(topMenu, driver).isDisplayed();
    }

    @Step("Проверка наличия кнопки 'Написать нам'")
    public void feedbackButtonShouldBeVisible() {
        Waiting.waitingElementsDisplay(feedbackButton, driver).isDisplayed();
    }

    @Step("Проверка наличия блока 'Услуги'")
    public void servicesBlockShouldBeVisible() {
        Waiting.waitingElementsDisplay(servicesBlock, driver).isDisplayed();
    }

    @Step("Проверка наличия блока 'Мы ценим наших клиентов'")
    public void clientsBlockShouldBeVisible() {
        Waiting.waitingElementsDisplay(clientsBlock, driver).isDisplayed();
    }

    @Step("Проверка наличия блока 'Проекты'")
    public void projectsBlockShouldBeVisible() {
        Waiting.waitingElementsDisplay(projectsBlock, driver).isDisplayed();
    }

    @Step("Проверка наличия блока 'Награды'")
    public void awardsBlockShouldBeVisible() {
        Waiting.waitingElementsDisplay(awardsBlock, driver).isDisplayed();
    }

    @Step("Проверка наличия блока 'Статьи'")
    public void articleBlockShouldBeVisible() {
        Waiting.waitingElementsDisplay(articleBlock, driver).isDisplayed();
    }

    @Step("Проверка наличия блока 'Вакансии'")
    public void vacanciesBlockShouldBeVisible() {
        Waiting.waitingElementsDisplay(vacanciesBlock, driver).isDisplayed();
    }

    @Step("Проверка наличия нижнего меню")
    public void bottomMenuShouldBeVisible() {
        Waiting.waitingElementsDisplay(bottomMenu, driver).isDisplayed();
    }

    @Step("Проверка наличия блока с социальными сетями")
    public void socialNetworkShouldBeVisible() {
        Waiting.waitingElementsDisplay(socialNetworkBlock, driver).isDisplayed();
    }

    @Step("Проверка наличия в верхнем меню кнопки 'Проекты'")
    public void projectsButtonTopMenuShouldBeVisible() {
        Waiting.waitingElementsDisplay(projectsButtonTopMenu, driver).isDisplayed();
    }

    @Step("Проверка наличия в верхнем меню кнопки 'Услуги'")
    public void serviceButtonTopMenuShouldBeVisible() {
        Waiting.waitingElementsDisplay(serviceButtonTopMenu, driver).isDisplayed();
    }

    @Step("Проверка наличия в верхнем меню кнопки 'Решения'")
    public void decisionButtonTopMenuShouldBeVisible() {
        Waiting.waitingElementsDisplay(decisionButtonTopMenu, driver).isDisplayed();
    }

    @Step("Проверка наличия в верхнем меню кнопки 'Блог'")
    public void blogButtonTopMenuShouldBeVisible() {
        Waiting.waitingElementsDisplay(blogButtonTopMenu, driver).isDisplayed();
    }

    @Step("Проверка наличия в верхнем меню кнопки 'Вакансии'")
    public void vacanciesButtonTopMenuShouldBeVisible() {
        Waiting.waitingElementsDisplay(vacanciesButtonTopMenu, driver).isDisplayed();
    }

    @Step("Проверка наличия в верхнем меню кнопки 'Карьера'")
    public void careerButtonTopMenuShouldBeVisible() {
        Waiting.waitingElementsDisplay(careerButtonTopMenu, driver).isDisplayed();
    }

    @Step("Проверка наличия в верхнем меню кнопки 'О нас'")
    public void companyButtonTopMenuShouldBeVisible() {
        Waiting.waitingElementsDisplay(companyButtonTopMenu, driver).isDisplayed();
    }

    @Step("Проверка наличия в верхнем меню кнопки 'Контакты'")
    public void contactsButtonMenuShouldBeVisible() {
        Waiting.waitingElementsDisplay(contactsButtonMenu, driver).isDisplayed();
    }

    @Step("Проверка наличия кнопки 'Food Tech' в блоке 'Решения' в верхнем меню ")
    public void foodTechButtonShouldBeVisible() {
        Waiting.waitingElementsDisplay(foodTechButton, driver).isDisplayed();
    }

    @Step("Нажатие на кнопку 'Написать нам'")
    public void feedbackButtonClick() {
        feedbackButton.click();
    }

    @Step("Нажание на кнопку 'Решения' в верхнем меню")
    public void moveToDecisionsButton() {
        Actions actions = new Actions(driver);
        actions.moveToElement(decisionButtonTopMenu);
        decisionButtonTopMenu.click();
    }

    @Step("Нажатие на кнопку 'Для банков' в блоке 'Решения' в верхнем меню ")
    public void clickForBanksButton() {
        forBanksButton.click();
    }

    @Step("Переключение на следующую вкладку")
    public void switchTabs() {
        for (String tab : driver.getWindowHandles()) {
            driver.switchTo().window(tab);
        }
    }

    @Step("Нажатие на кнопку 'Для страховых' в блоке 'Решения' в верхнем меню ")
    public void clickInsuranceButton() {
        insuranceButton.click();
    }

    @Step("Нажатие на кнопку 'Оценка IT-проектов' в блоке 'Решения' в верхнем меню ")
    public void clickForProductEvaluationButton() {
        productEvaluationButton.click();
    }

    @Step("Нажатие на кнопку 'Data Science' в блоке 'Решения' в верхнем меню ")
    public void clickDataScienceButton() {
        dataScienceButton.click();
    }

    @Step("Нажатие на кнопку 'Автоматизация бизнеса' в блоке 'Решения' в верхнем меню ")
    public void clickAutomationBusinessButton() {
        automationBusinessButton.click();
    }

    @Step("Нажатие на кнопку 'ShopChat' в блоке 'Решения' в верхнем меню ")
    public void clickShopChatButton() {
        shopChatButton.click();
    }

    @Step("Нажатие на кнопку 'Food Tech' в блоке 'Решения' в верхнем меню ")
    public void clickFooTechButton() {
        foodTecButton.click();
    }

    @Step("Нажатие на кнопку 'Для Промышленности' в блоке 'Решения' в верхнем меню ")
    public void clickIndustrialButton() {
        forIndustrialButton.click();
    }

    @Step("Нажатие на кнопку 'Для медицины' в блоке 'Решения' в верхнем меню ")
    public void clickMedicineButton() {
        forMedicineButton.click();
    }

    @Step("Нажатие на кнопку 'Карьера' в верхнем меню ")
    public void clickCareerButton() {
        careerButtonTopMenu.click();
    }

    @Step("Нажатие на кнопку 'SimbirFriends' в блоке 'Карьера' в верхнем меню ")
    public void clickSimbirFriendsButton() {
        Actions actions = new Actions(driver);
        actions.moveToElement(careerButtonTopMenu).moveToElement(simbirFriendsButton).click().build().perform();
    }

    @Step("Нажатие на кнопку 'О нас' в верхнем меню ")
    public void clickAboutUsButton() {
        bottomMenuAboutUsButton.click();
    }

    @Step("Нажатие на кнопку 'Наши процессы' в блоке 'О нас' в верхнем меню ")
    public void clickOurProcessesButton() {
        Actions actions = new Actions(driver);
        actions.moveToElement(bottomMenuAboutUsButton).moveToElement(ourProcessesButton).click().build().perform();
    }

    @Step("Нажатие на кнопку 'SimbirSoft' в левом верхнем углу ")
    public void clickSimbirSoftButton() {
        simbirSoftButton.click();
    }

    @Step("Получение текста тайтла страницы ")
    public String getMainPageTitle() {
        String mainPageTitleText = Waiting.waitingElementsDisplay(mainPageTitle, driver).getText();
        return mainPageTitleText;
    }
    @Step("Нажатие на кнопку 'Проекты' в верхнем меню ")
    public void clickProjectButtonTopMenu() {
        Waiting.waitingElementsDisplay(projectsButtonTopMenu, driver).click();
    }
    @Step("Нажатие на кнопку 'Вакансии' в верхнем меню ")
    public void clickVacanciesButtonTopMenu() {
        Waiting.waitingElementsDisplay(vacanciesButtonTopMenu, driver).click();
    }
}
