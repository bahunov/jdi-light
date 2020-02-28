package cucumberTests;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

import static com.epam.jdi.light.driver.WebDriverUtils.killAllSeleniumDrivers;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "classpath:features"
        , glue = {"com.epam.jdi.bdd", "cucumberTests"}
//    , tags = {"@form"}
)
public class NoPoRunTest {
//    @AfterClass
//    public static void shutDown() {
//        killAllSeleniumDrivers();
//    }
}