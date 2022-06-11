package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import waits.Waiting;

public class ProjectsPage {
    private WebDriver driver;

    public ProjectsPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//h1[contains(text(),\" Проекты\")]")
    private WebElement projectsPageTitle;
    @FindBy(css = "div[class*='list-layout']>div[class*='wrapper']>a[href*='qa']")
    private WebElement qaButtonOnBlockProjects;

    @Step("Получние текста тайтла страницы")
    public String getProjectPageTitle() {
        String projectPageText = Waiting.waitingElementsDisplay(projectsPageTitle, driver).getText();
        return projectPageText;
    }
    @Step("Нажатие на кнопку 'Qa' в блоке 'Проекты' ")
    public void clickQaButtonOnBlockProjects() {
        Waiting.waitingElementsDisplay(qaButtonOnBlockProjects, driver).click();
    }
}
