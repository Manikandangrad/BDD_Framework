package stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class EmiCalculatorStepDef {
    public WebDriver driver;
    @Given("Launch the Application")
    public void launch_the_application() {
        // Write code here that turns the phrase above into concrete actions
        ChromeOptions chromeOptions=new ChromeOptions();
        chromeOptions.addArguments("--remote-allow-origins=*");
        System.setProperty("webdriver.chrome.driver","C:\\Users\\DEVI\\IdeaProjects\\EY-Trainings\\chromedriver_win32 (1)\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.get("https://www.unionbankofindia.co.in/english/loan-emi-calculator.aspx");
        driver.manage().window().maximize();
    }
    @Then("Enter the Amount as {string},Rate as {string} and Tenure as {string}")
    public void enter_the_amount_as_rate_as_and_tenure_as(String Amount, String Rate, String Tenure) {
        // Write code here that turns the phrase above into concrete actions
        driver.findElement(By.id("loanamount")).sendKeys(Amount);
        driver.findElement(By.id("rate")).sendKeys(Rate);
        driver.findElement(By.id("pmonths")).sendKeys(Tenure);

    }
    @And("Click on Calculate Button")
    public void click_on_calculate_button() {
        // Write code here that turns the phrase above into concrete actions
        driver.findElement(By.id("Button1")).click();
    }
    @And("Verify the EMI is {string}")
    public void verify_the_emi_is(String Expected_EMI) {
        // Write code here that turns the phrase above into concrete actions
        String output = driver.findElement(By.id("EMI")).getAttribute("value");
        System.out.println(output);
        if (output.equals(Expected_EMI))
        {
            System.out.println("Pass");
        }
        else {
            System.out.println("Fail");
        }
    }
    @Then("Close the Application")
    public void close_the_application() {
        // Write code here that turns the phrase above into concrete actions
        driver.quit();
    }
}
