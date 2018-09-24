package stepdefs;

import com.codeborne.selenide.Configuration;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import pageObjects.BookingPage;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class BookingStepDef  {

    @Given("I open booking page")
    public void chooseImagesAsSearchTarget() {
        Configuration.browser = "chrome";
        open("https://booking.uz.gov.ua/en/");
    }

    @When("select departure from (.*)")
    public void selectDeparture(String keyword) {
        $(By.xpath(String.format(BookingPage.HOT_FROM_INPUT, keyword))).click();
    }

    @When("select destination to (.*)")
    public void selectDestination(String keyword) {
        $(By.xpath(String.format(BookingPage.HOT_TO_INPUT, keyword))).click();
    }

    @When("select day after tomorrow")
    public void selectDayAfterTomorrow() {
        String currentDate = $(By.xpath(BookingPage.DATE_INPUT)).getValue();
        $(By.xpath(BookingPage.DAY_AFTER_TOMORROW)).click();
        String newDate = $(By.xpath(BookingPage.DATE_INPUT)).getValue();
        Assert.assertFalse(currentDate.equals(newDate));
    }

    @When("select train by (.*) train number")
    public void selectTrainByNumber(String number) {
        $(By.xpath(String.format(BookingPage.SELECT_BY_TRAIN_NUMBER, number))).click();
        $(By.xpath(BookingPage.SEAT)).should(visible);
    }

    @When("select free seat")
    public void selectFreeSeat() {
        $(By.xpath(BookingPage.FREE_SEAT)).click();
    }

    @When("submit search")
    public void submitSearch() {
        $(By.xpath(BookingPage.SUBMIT_SEARCH)).click();
    }

    @Then("price ticket appear")
    public void priceAppear(){
        $(By.xpath(BookingPage.TICKET_PRICE)).should(visible);
    }

    @Then("price equals (.*)")
    public void checkPrice(String price){
        $(By.xpath(BookingPage.TICKET_PRICE)).shouldHave(exactText(price));
    }

}
