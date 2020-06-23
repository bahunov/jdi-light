package io.github.epam.properties;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.security.InvalidParameterException;
import java.util.Properties;

import static utils.Property.SCREENSHOT_STRATEGY_PROPERTY;
import static utils.PropertyValidationUtils.LINK_TO_EXAMPLES;
import static utils.PropertyValidationUtils.validateProperties;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.fail;

public class ScreenshotStrategyTests {

    @DataProvider
    public static Object[] negativeData() {
        return new Object[]{"onfail", "", "0", "on-fail"};
    }

    @DataProvider
    public static Object[] positiveData() {
        return new Object[]{"off", "on fail", "on assert", "new page"};
    }

    @Test(dataProvider = "negativeData")
    public void negativeTest(String value) {
        Properties properties = new Properties();
        properties.setProperty(SCREENSHOT_STRATEGY_PROPERTY.getName(), value);
        try {
            validateProperties(properties);
            fail("Value '" + value + "' should not be valid for this test.");
        } catch (InvalidParameterException exp) {
            String expMessage = exp.getMessage();
            assertEquals(expMessage, SCREENSHOT_STRATEGY_PROPERTY.getExMsg() + LINK_TO_EXAMPLES);
        }
    }

    @Test(dataProvider = "positiveData")
    public void positiveTest(String value) {
        Properties properties = new Properties();
        properties.setProperty(SCREENSHOT_STRATEGY_PROPERTY.getName(), value);
        validateProperties(properties);
    }
}