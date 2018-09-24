package stepdefs;

import com.codeborne.selenide.Configuration;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.Before;
import org.junit.runner.RunWith;

@CucumberOptions(
        features = "src/test/resources", glue = { "stepdefs" })
@RunWith(Cucumber.class)
public class CucumberTest {
  @Before
  public void setUp() {
    Configuration.startMaximized = true;
  }
}
