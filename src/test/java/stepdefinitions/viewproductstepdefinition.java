package stepdefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import pageObjects.viewPageObject;

public class viewproductstepdefinition {

    WebDriver driver;
    private By shirtSelectLacator =By.partialLinkText("Tees");



    @Given("I am a Visitor")
    public void i_am_a_Visitor() {

        System.setProperty("webdriver.gecko.driver",
                "C:\\Users\\7084\\Desktop\\IntellJ\\drivers\\geckodriver.exe");

        driver = new FirefoxDriver();
        driver.get("https://magento.abox.co.za");
        // Write code here that turns the phrase above into concrete actions


    }

    @When("I navigate to Open Site URL")
    public void i_navigate_to_Open_Site_URL() {
        // Write code here that turns the phrase above into concrete actions


    }

    @When("I search for a product")
    public void i_search_for_a_product() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        viewPageObject searchPage = PageFactory.initElements(driver,viewPageObject.class);
       searchPage.setsearch("Tees");
       // WebElement element = driver.findElement(By.name("Tees"));
       // element.sendKeys("Tees!\n");



    }

    @Then("The View product list page will be displayed")
    public void the_View_product_list_page_will_be_displayed() {
        // Write code here that turns the phrase above into concrete actions


    }

}
