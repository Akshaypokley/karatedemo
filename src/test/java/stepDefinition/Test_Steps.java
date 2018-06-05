package stepDefinition;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/**
 * Created by akshay.pokley on 6/4/2018.
 */
public class Test_Steps {
WebDriver driver;

    @Given("^User is on Home Page$")
    public void user_is_on_Home_Page() throws Throwable {
        System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://www.store.demoqa.com");
    }

    @When("^User Navigate to LogIn Page$")
    public void user_Navigate_to_LogIn_Page() throws Throwable {
        driver.findElement(By.xpath(".//*[@id='account']/a")).click();
    }

/*    @When("^User enters UserName and Password$")
    public void user_enters_UserName_and_Password() throws Throwable {
        driver.findElement(By.id("log")).sendKeys("Akshay85");
        driver.findElement(By.id("pwd")).sendKeys("Akshay85@gmail.co");
        driver.findElement(By.id("login")).click();
    Thread.sleep(3000);
    }*/



/*1.Parameterizing the UserName and Password.*/

/*    @When("^User enters \"(.*)\" and \"(.*)\"$")
    public void user_enters_UserName_and_Password(String username, String password) throws Throwable {
        driver.findElement(By.id("log")).sendKeys(username);
        driver.findElement(By.id("pwd")).sendKeys(password);
        driver.findElement(By.id("login")).click();
    }*/
/*
/* **** Data table in cucuber0--------------*//*
    @When("^User enters Credentials to LogIn$")
    public void user_enters_testuser__and_Test(DataTable usercredentials) throws Throwable {
        List<List<String>> data = usercredentials.raw();
        driver.findElement(By.id("log")).sendKeys(data.get(0).get(0));
        driver.findElement(By.id("pwd")).sendKeys(data.get(0).get(1));
        driver.findElement(By.id("login")).click();
    }*/

/*
    Maps in Data Tables*/

    @When("^User enters Credentials to LogIn$")
    public void user_enters_testuser_and_Test(List<Credentials>  usercredentials) throws Throwable {

        //Write the code to handle Data Table
        for (Credentials credentials : usercredentials) {
            driver.findElement(By.id("log")).sendKeys(credentials.getUsername());
            driver.findElement(By.id("pwd")).sendKeys(credentials.getPassword());
            driver.findElement(By.id("login")).click();
        }
    }
    @Then("^Message displayed Login Successfully$")
    public void message_displayed_Login_Successfully() throws Throwable {
        System.out.println("Login Successfully");
    }

    @When("^User LogOut from the Application$")
    public void user_LogOut_from_the_Application() throws Throwable {

        Thread.sleep(3000);
        driver.findElement (By.xpath(".//*[@id='account_logout']/a")).click();
    }

    @Then("^Message displayed Logout Successfully$")
    public void message_displayed_Logout_Successfully() throws Throwable {
        System.out.println("LogOut Successfully");
    }
}
