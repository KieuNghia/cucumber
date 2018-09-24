package pageObjects;

import org.openqa.selenium.support.FindBy;

public class BookingPage {

    @FindBy
    public static String HOT_FROM_INPUT = "//div[@class ='hot-stations from']//a[text() = '%s']";

    @FindBy
    public static String HOT_TO_INPUT = "//div[@class ='hot-stations to']//a[text() = '%s']";

    @FindBy
    public static String DATE_INPUT = "//input[@name = 'date-hover']";

    @FindBy
    public static String DAY_AFTER_TOMORROW = "//div[@class = 'date']//div[@class = 'link']//a[3]";

    @FindBy
    public static String SUBMIT_SEARCH = "(//button[@type='submit'])[2]";

    @FindBy
    public static String SELECT_BY_TRAIN_NUMBER = "//div[contains(text(),'%s')]/following::td[@class = 'place']//input";

    @FindBy
    public static String FREE_SEAT = "//div[contains(@aria-label,'available')]";

    @FindBy
    public static String SEAT = "//div[@place]";

    @FindBy
    public static String TICKET_PRICE = "//span[@class = 'js-cost']";

}
