package tests;

import chromeDriver.GetChromeDriver;
import io.qameta.allure.*;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.Color;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.*;

@Epic("Тесты сайта SimbirSoft")
public class TestMain {
    private WebDriver driver;
    private MainPage mainPage;
    private HelpPage helpPage;
    private WriteUsPage writeUsPage;
    private FinancePage financePage;
    private InsurancePage insurancePage;
    private ProductEvaluationPage productEvaluationPage;
    private DataSciencePage dataSciencePage;
    private AutomationForBusinessPage automationForBusinessPage;
    private ShopChatPage shopChatPage;
    private FoodTechPage foodTechPage;
    private ForIndustrialPage forIndustrialPage;
    private ForMedicinePage forMedicinePage;
    private CareerPage careerPage;
    private SimbirFriendsPage simbirFriendsPage;
    private AboutUsPage aboutUsPage;
    private UsProjectsPage usProjectsPage;
    private BlogPage blogPage;
    private VacanciesPage vacanciesPage;
    private JavaDeveloperPage javaDeveloperPage;
    private ProjectsPage projectsPage;

    @BeforeMethod
    public void BeforeMethod() {
        driver = GetChromeDriver.getChromeDriver();
        driver.manage().window().maximize();
        mainPage = new MainPage(driver);
        helpPage = new HelpPage(driver);
        writeUsPage = new WriteUsPage(driver);
        financePage = new FinancePage(driver);
        insurancePage = new InsurancePage(driver);
        productEvaluationPage = new ProductEvaluationPage(driver);
        dataSciencePage = new DataSciencePage(driver);
        automationForBusinessPage = new AutomationForBusinessPage(driver);
        shopChatPage = new ShopChatPage(driver);
        foodTechPage = new FoodTechPage(driver);
        forIndustrialPage = new ForIndustrialPage(driver);
        forMedicinePage = new ForMedicinePage(driver);
        careerPage = new CareerPage(driver);
        simbirFriendsPage = new SimbirFriendsPage(driver);
        aboutUsPage = new AboutUsPage(driver);
        usProjectsPage = new UsProjectsPage(driver);
        blogPage = new BlogPage(driver);
        vacanciesPage = new VacanciesPage(driver);
        javaDeveloperPage = new JavaDeveloperPage(driver);
        projectsPage = new ProjectsPage(driver);
    }

    @Severity(value = SeverityLevel.NORMAL)
    @Feature("Тесты на главной странице")
    @Story("Переключения языка")
    @Test
    public void changeLanguageTest() {
        driver.get("https://www.simbirsoft.com/");
        mainPage.changeLanguage();
        Assert.assertEquals(mainPage.mainText(), "We create software for your business growth");
    }
    @Severity(value = SeverityLevel.NORMAL)
    @Feature("Тесты на главной странице")
    @Story("Проверка наличия элементов в нижнем меню")
    @Test
    public void bottomMenuTest() throws InterruptedException {
        driver.get("https://www.simbirsoft.com/");
        mainPage.bottomMenuPortfolioButtonShouldBeVisible();
        mainPage.bottomMenuBlogButtonShouldBeVisible();
        mainPage.bottomMenuVacanciesButtonShouldBeVisible();
        mainPage.bottomMenuCareerButtonShouldBeVisible();
        mainPage.bottomMenuCompanyButtonShouldBeVisible();
        mainPage.bottomMenuContactsButtonShouldBeVisible();
        mainPage.bottomMenuFriendsButtonShouldBeVisible();
        mainPage.bottomMenuAboutUsButtonShouldBeVisible();
        mainPage.phoneNumberShouldBeVisible();
        mainPage.mailShouldBeVisible();
    }
    @Severity(value = SeverityLevel.NORMAL)
    @Feature("Тесты на главной странице")
    @Story("Проверка наличия верхнего меню, кнопки для переключения языка , кнопки «Написать нам», блока с услугами, блока с клиентами, блока с технологиями, блока с отраслями, блока с проектами, блока с наградами, блока с вакансиями, нижнего меню, блока с ссылками нас социальные сети компании ")
    @Test
    public void mainPageTest() {
        driver.get("https://www.simbirsoft.com/");
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0,1000)");
        mainPage.topMenuShouldBeVisible();
        mainPage.feedbackButtonShouldBeVisible();
        mainPage.servicesBlockShouldBeVisible();
        jse.executeScript("window.scrollBy(0,1000)");
        mainPage.clientsBlockShouldBeVisible();
        mainPage.projectsBlockShouldBeVisible();
        jse.executeScript("window.scrollBy(0,4000)");
        mainPage.awardsBlockShouldBeVisible();
        mainPage.articleBlockShouldBeVisible();
        mainPage.vacanciesBlockShouldBeVisible();
        jse.executeScript("window.scrollBy(0,1000)");
        mainPage.bottomMenuShouldBeVisible();
        mainPage.socialNetworkShouldBeVisible();
    }
    @Severity(value = SeverityLevel.NORMAL)
    @Feature("Тесты на главной странице")
    @Story("Проверка наличия элементов в верхнем меню")
    @Test
    public void topMenuTest() {
        driver.get("https://www.simbirsoft.com/");
        mainPage.projectsButtonTopMenuShouldBeVisible();
        mainPage.serviceButtonTopMenuShouldBeVisible();
        mainPage.decisionButtonTopMenuShouldBeVisible();
        mainPage.blogButtonTopMenuShouldBeVisible();
        mainPage.vacanciesButtonTopMenuShouldBeVisible();
        mainPage.careerButtonTopMenuShouldBeVisible();
        mainPage.companyButtonTopMenuShouldBeVisible();
        mainPage.contactsButtonMenuShouldBeVisible();
    }
    @Severity(value = SeverityLevel.NORMAL)
    @Feature("Тесты на странице 'Блог'")
    @Story("Проверка работоспобоности блока-слайдера")
    @Test
    public void blogPageBlockSliderTest() {
        driver.get("https://www.simbirsoft.com/blog/");
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0,2000)");
        blogPage.nextButtonOnSliderIndustriesClick();
        mainPage.foodTechButtonShouldBeVisible();
    }
    @Severity(value = SeverityLevel.NORMAL)
    @Feature("Тесты на странице 'Услуги'")
    @Story("Проверка работы кнопок  в блоке 'Услуги' на странице 'Услуги' ")
    @Test
    public void helpPageServicesBlockTest() {
        driver.get("https://www.simbirsoft.com/help/");
        helpPage.saveProductButtonClick();
        Assert.assertEquals(helpPage.saveProductText(), "«Спасти» продукт");
    }

    @DataProvider(name = "LogInDataProvider")
    public Object[][] getData() {
        Object[][] data = {{"ООО Рога и копыта", "88005553434", ""}, {"ООО Рога и копыта", "", "Проект"}, {"", "88005553434", "Проект"}};
        return data;
    }
    @Severity(value = SeverityLevel.NORMAL)
    @Feature("Тесты на главной странице")
    @Story("Проверка работы блока 'Написать нам'")
    @Test(dataProvider = "LogInDataProvider")
    public void writeUsPageTest(String name, String phone, String information) throws InterruptedException {
        driver.get("https://www.simbirsoft.com/");
        mainPage.feedbackButtonClick();
        writeUsPage.nameOrOrganizationShouldBeVisible();
        writeUsPage.phoneOrEmailShouldBeVisible();
        writeUsPage.informationOfProjectShouldBeVisible();
        writeUsPage.attachFileButtonShouldBeVisible();
        writeUsPage.nameOrOrganizationInput(name);
        writeUsPage.phoneOrEmailInput(phone);
        writeUsPage.informationOfProjectInput(information);
        writeUsPage.sendButtonClick();
        Thread.sleep(500);
        if (name.length() < 1) {
            Assert.assertTrue(Color.fromString("##FF3838").equals(Color.fromString(
                    writeUsPage.getNameOrOrganizationColor())));
        } else if (phone.length() < 1) {
            Assert.assertTrue(Color.fromString("##FF3838").equals(Color.fromString(
                    writeUsPage.getPhoneOrEmailColor())));
        } else if (information.length() < 1) {
            Assert.assertTrue(Color.fromString("##FF3838").equals(Color.fromString(
                    writeUsPage.getInformationColor())));
        }
    }
    @Severity(value = SeverityLevel.NORMAL)
    @Feature("Тесты верхнего меню")
    @Story("Проверка работоспособности кнопки 'Для банков' в блоке 'Решения'")
    @Test
    public void topMenuForBanksButtonTest() {
        driver.get("https://www.simbirsoft.com/");
        mainPage.moveToDecisionsButton();
        mainPage.clickForBanksButton();
        mainPage.switchTabs();
        Assert.assertEquals(financePage.getTittle(), "СОЗДАЕМ ПО ДЛЯ БАНКОВ\n" +
                "И ФИНАНСОВЫХ КОМПАНИЙ");
    }
    @Severity(value = SeverityLevel.NORMAL)
    @Feature("Тесты верхнего меню")
    @Story("Проверка работоспособности кнопки 'Для страховых' в блоке 'Решения' в верхнем меню")
    @Test
    public void topMenuInsuranceButtonTest() {
        driver.get("https://www.simbirsoft.com/");
        mainPage.moveToDecisionsButton();
        mainPage.clickInsuranceButton();
        mainPage.switchTabs();
        Assert.assertEquals(insurancePage.getInsuranceText(), "Мобильный кабинет страхователя");
    }
    @Severity(value = SeverityLevel.NORMAL)
    @Feature("Тесты верхнего меню")
    @Story("Проверка работоспособности кнопки 'Оценка IT-проектов' в блоке 'Решения'")
    @Test
    public void topMenuProductEvaluationButtonTest() {
        driver.get("https://www.simbirsoft.com/");
        mainPage.moveToDecisionsButton();
        mainPage.clickForProductEvaluationButton();
        mainPage.switchTabs();
        Assert.assertEquals(productEvaluationPage.getProductEvaluationText(), "Инструмент для оценки\n" +
                "IT-проектов");
    }
    @Severity(value = SeverityLevel.NORMAL)
    @Feature("Тесты верхнего меню")
    @Story("Проверка работоспособности кнопки 'Data Science' в блоке 'Решения'")
    @Test
    public void topMenuDataScienceButtonTest() {
        driver.get("https://www.simbirsoft.com/");
        mainPage.moveToDecisionsButton();
        mainPage.clickDataScienceButton();
        mainPage.switchTabs();
        Assert.assertEquals(dataSciencePage.getDataScienceText(), "Создаем конкурентные преимущества для бизнеса\n" +
                "за счет анализа данных");
    }
    @Severity(value = SeverityLevel.NORMAL)
    @Feature("Тесты верхнего меню")
    @Story("Проверка работоспособности кнопки 'Автоматизация бизнеса' в блоке 'Решения'")
    @Test
    public void topMenuAutomationForBusinessButtonTest() {
        driver.get("https://www.simbirsoft.com/");
        mainPage.moveToDecisionsButton();
        mainPage.clickAutomationBusinessButton();
        mainPage.switchTabs();
        Assert.assertEquals(automationForBusinessPage.getAutomationForBusinessTitle(), "СОЗДАЕМ И ВНЕДРЯЕМ\n" +
                "СИСТЕМЫ АВТОМАТИЗАЦИИ\n" +
                "ДЛЯ БИЗНЕСА");
    }
    @Severity(value = SeverityLevel.NORMAL)
    @Feature("Тесты верхнего меню")
    @Story("Проверка работоспособности кнопки 'ShopChat' в блоке 'Решения'")
    @Test
    public void topMenuShopChatButtonTest() {
        driver.get("https://www.simbirsoft.com/");
        mainPage.moveToDecisionsButton();
        mainPage.clickShopChatButton();
        mainPage.switchTabs();
        Assert.assertEquals(shopChatPage.getShopChatTitle(), "Мобильное\n" +
                "приложение\n" +
                "с чат-магазином");
    }
    @Severity(value = SeverityLevel.NORMAL)
    @Feature("Тесты верхнего меню")
    @Story("Проверка работоспособности кнопки 'Food Tech' в блоке 'Решения'")
    @Test
    public void topMenuFoodTechButtonTest() {
        driver.get("https://www.simbirsoft.com/");
        mainPage.moveToDecisionsButton();
        mainPage.clickFooTechButton();
        mainPage.switchTabs();
        Assert.assertEquals(foodTechPage.giveFoodTechTitle(), "Создаем решения для Food Tech индустрии");
    }
    @Severity(value = SeverityLevel.NORMAL)
    @Feature("Тесты верхнего меню")
    @Story("Проверка работоспособности кнопки 'Для промышленности' в блоке 'Решения'")
    @Test
    public void topMenuForIndustrialButtonTest() throws InterruptedException {
        driver.get("https://www.simbirsoft.com/");
        mainPage.moveToDecisionsButton();
        mainPage.clickIndustrialButton();
        mainPage.switchTabs();
        Assert.assertEquals(forIndustrialPage.getForIndustrialTitle(), "Разработка ПО\n" +
                "для промышленности\n" +
                "и смежных отраслей");
    }
    @Severity(value = SeverityLevel.NORMAL)
    @Feature("Тесты верхнего меню")
    @Story("Проверка работоспособности кнопки 'Для медицины' в блоке 'Решения'")
    @Test
    public void topMenuForMedicineButtonTest() throws InterruptedException {
        driver.get("https://www.simbirsoft.com/");
        mainPage.moveToDecisionsButton();
        mainPage.clickMedicineButton();
        mainPage.switchTabs();
        Assert.assertEquals(forMedicinePage.getForMedicinePageTitle(), "Создаем IT-решения для медицинской сферы");
    }
    @Severity(value = SeverityLevel.NORMAL)
    @Feature("Тесты верхнего меню")
    @Story("Проверка работоспособности кнопок 'Карьера' и 'SimbirFriends' в блоке 'Карьера'")
    @Test
    public void topMenuCareerButtonTest() {
        driver.get("https://www.simbirsoft.com/");
        mainPage.clickCareerButton();
        Assert.assertEquals(careerPage.getCareerTitle(), "Карьера в SimbirSoft");
        mainPage.clickSimbirFriendsButton();
        Assert.assertEquals(simbirFriendsPage.getSimbirFriendsTitle(), "SimbirFriends");
    }
    @Severity(value = SeverityLevel.NORMAL)
    @Feature("Тесты верхнего меню")
    @Story("Проверка работоспособности кнопок 'О нас' и 'Наши процессы' в блоке 'О нас'")
    @Test
    public void topMenuAboutUsButtonTest() {
        driver.get("https://www.simbirsoft.com/");
        mainPage.clickAboutUsButton();
        Assert.assertEquals(aboutUsPage.getAboutUsTitle(), "О нас");
        mainPage.clickOurProcessesButton();
        Assert.assertEquals(usProjectsPage.getUsProjectsTitleTitle(), "Наши процессы");
    }
    @Severity(value = SeverityLevel.NORMAL)
    @Feature("Тесты на странице 'Блог'")
    @Story("Проверка работоспособности блока-слайдера 'Статьи'")
    @Test
    public void blogPageNewsSliderTest() {
        driver.get("https://www.simbirsoft.com/blog/");
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0,2400)");
        blogPage.clickNextButtonOnNewsSlider();
        blogPage.dreamTeamSlideShouldBeVisible();
    }
    @Severity(value = SeverityLevel.NORMAL)
    @Feature("Тесты на странице 'Карьера'")
    @Story("Проверка работоспособности кнопок в блоке 'Вопрос-ответ'")
    @Test
    public void careerPageQuestionAnswerBlockTest() {
        driver.get("https://www.simbirsoft.com/career/");
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0,7200)");
        careerPage.clickOnFirstQuestionOnBlockQuestionAnswer();
        Assert.assertEquals(careerPage.getFirstAnswerOnBlockQuestionAnswerText(), "40 часов в неделю, время начала работы гибкое (с 8:00 до 10:00) и зависит от твоих договоренностей на проекте. Мы работаем по ульяновскому времени (+1 к мск).");
        careerPage.clickOnSecondQuestionOnBlockQuestionAnswer();
        Assert.assertEquals(careerPage.getSecondAnswerOnBlockQuestionAnswerText(), "Независимо от твоего уровня мы подберем ментора, который поможет адаптироваться, ответит на организационные вопросы и проконсультирует по технической части. Вместе мы составим план развития с учетом направлений и технологий по твоим интересам. Ты погрузишься в процессы, пройдешь грейдирование по необходимым технологиям, изучишь корпоративную базу знаний.");
        jse.executeScript("window.scrollBy(0,500)");
        careerPage.clickOnThirdQuestionOnBlockQuestionAnswer();
        Assert.assertEquals(careerPage.getThirdAnswerOnBlockQuestionAnswerText(), "Мы создаем IT-продукты для ведущих компаний из Европы, США и России, работаем с проектами из разных отраслей: банки и финтех, образование и медицина, страхование и телекоммуникации, ритейл и сервис. Ознакомиться с нашими кейсами можно в разделе Портфолио. Мы предоставляем возможность сменить проект или изучить новую технологию.");
        careerPage.clickOnForthQuestionOnBlockQuestionAnswer();
        Assert.assertEquals(careerPage.getForthAnswerOnBlockQuestionAnswerText(), "Уровень заработной платы в SimbirSoft зависит от роста квалификации специалиста, стажа работы в компании, личного вклада в успех проекта.");
        jse.executeScript("window.scrollBy(0,500)");
        careerPage.clickOnFifthQuestionOnBlockQuestionAnswer();
        Assert.assertEquals(careerPage.getFifthAnswerOnBlockQuestionAnswerText(), "Уровень дохода в компании соответствует современным тенденциям рынка и зависит от твоих компетенций. Есть факторы, которые положительно влияют на размер твоей зарплаты на старте:");
        jse.executeScript("window.scrollBy(0,200)");
        careerPage.clickOnSixthQuestionOnBlockQuestionAnswer();
        Assert.assertEquals(careerPage.getSixthAnswerOnBlockQuestionAnswerText(), "С первого дня работы мы предоставляем официальное трудоустройство, белую заработную плату, возможность изучать английский язык и другие возможности.");
        jse.executeScript("window.scrollBy(0,200)");
        careerPage.clickOnSeventhQuestionOnBlockQuestionAnswer();
        Assert.assertEquals(careerPage.getSeventhAnswerOnBlockQuestionAnswerText(), "В университетах дают отличную теоретическую базу, но мы всегда советуем в дополнение к лекциям всеми способами набираться практических навыков — участвовать в проектах, олимпиадах по программированию, интенсивах. Сами проводим практикумы и митапы, чтобы студенты могли набраться опыта разработки в условиях, приближенных к «боевым».");
    }

    @DataProvider(name = "GetInputForBlockLeaveYourContact")
    public Object[][] getInput() {
        Object[][] data = {{"Илья", ""}, {"", "33333"}};
        return data;
    }
    @Severity(value = SeverityLevel.NORMAL)
    @Feature("Тесты на странице 'Карьера'")
    @Story("Проверка работы блока 'Оставьте свои контакы'")
    @Test(dataProvider = "GetInputForBlockLeaveYourContact")
    public void careerPageLeaveYourContactsBlockTest(String name, String phone) throws InterruptedException {
        driver.get("https://www.simbirsoft.com/career/");
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0,8700)");
        careerPage.attachFileButtonLeaveTourContactsShouldBeVisible();
        careerPage.nameInput(name);
        careerPage.phoneOrEmailInput(phone);
        careerPage.clickSendButtonLeaveTourContacts();
        Thread.sleep(500);
        if (name.length() < 1) {
            Assert.assertTrue(Color.fromString("##FF3838").equals(Color.fromString(careerPage.getNameFieldColor())));
        } else if (phone.length() < 1) {
            Assert.assertTrue(Color.fromString("##FF3838").equals(Color.fromString(careerPage.getPhoneOrEmailFieldColor())));
        }
    }
    @Severity(value = SeverityLevel.NORMAL)
    @Feature("Тесты на странице 'Блог'")
    @Story("Проверка работоспособности блока 'Будьте в курсе'")
    @Test
    public void blockPageStarInformedBlockTest() throws InterruptedException {
        driver.get("https://www.simbirsoft.com/blog/");
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0,5000)");
        blogPage.clickSubscribeButton();
        Thread.sleep(2000);
        Assert.assertTrue(Color.fromString("##FF3838").equals(Color.fromString(blogPage.getEmailColor())));
    }
    @Severity(value = SeverityLevel.NORMAL)
    @Feature("Тесты на странице 'Карьера'")
    @Story("Проверка работоспособности кнопки 'Отправить резюме' и блока 'Оставить свои контакты'")
    @Test
    public void careerPageSendResumeButtonTest() throws InterruptedException {
        driver.get("https://www.simbirsoft.com/career/");
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0,4500)");
        careerPage.clickSendResumeButton();
    }
    @Severity(value = SeverityLevel.NORMAL)
    @Feature("Тесты на главной странице")
    @Story("Проверка работоспособности кнопки 'SimbirSoft'")
    @Test
    public void mainPageSimbirSoftButtonTest() throws InterruptedException {
        driver.get("https://www.simbirsoft.com/");
        mainPage.clickAboutUsButton();
        Assert.assertEquals(aboutUsPage.getAboutUsTitle(), "О нас");
        mainPage.clickSimbirSoftButton();
        Assert.assertEquals(mainPage.getMainPageTitle(), "Создаём программное обеспечение для роста вашего бизнеса");
    }
    @Severity(value = SeverityLevel.NORMAL)
    @Feature("E2E тесты")
    @Story("Просмотр сайта и оставление контактов для вакансии")
    @Test
    public void E2ETest() throws InterruptedException {
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        driver.get("https://www.simbirsoft.com/");
        mainPage.clickProjectButtonTopMenu();
        Assert.assertEquals(projectsPage.getProjectPageTitle(), "Проекты");
        projectsPage.clickQaButtonOnBlockProjects();
        Thread.sleep(4000);
        mainPage.clickVacanciesButtonTopMenu();
        Thread.sleep(4000);
        Assert.assertEquals(vacanciesPage.getVacanciesPageTitle(), "Вакансии");
        vacanciesPage.clickJavaDeveloperButtonOnBlockVacancies();
        Thread.sleep(4000);
        Assert.assertEquals(javaDeveloperPage.getJavaDeveloperPageTitle(), "Java-разработчик");
        jse.executeScript("window.scrollBy(0,2900)");
        javaDeveloperPage.inputDataInNameField();
        Thread.sleep(4000);
        javaDeveloperPage.clickSendButtonOnBlockLeaveYourContact();
        Thread.sleep(4000);
        Assert.assertTrue(Color.fromString("##FF3838").equals(Color.fromString(javaDeveloperPage.getTextPhoneOrEmailColor())));
        javaDeveloperPage.inputDataInPhoneOrEmailField();
    }

    @AfterMethod
    public void close() {
        driver.quit();
    }

}
