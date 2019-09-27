package io.github.epam.bootstrap.tests.composite.section.inputGroup;

import io.github.epam.TestsInit;
import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static com.epam.jdi.light.driver.get.DriverData.PROJECT_PATH;
import static com.epam.jdi.tools.PathUtils.mergePath;
import static io.github.com.StaticSite.bsPage;
import static io.github.com.pages.BootstrapPage.*;
import static io.github.epam.bootstrap.tests.BaseValidations.baseValidation;
import static io.github.epam.states.States.shouldBeLoggedIn;
import static org.hamcrest.Matchers.is;

/**
 * Created by Olga Ivanova on 19.09.2019
 * Email: olga_ivanova@epam.com
 */

public class InputGroupCustomFileInputTests extends TestsInit {
    public final static String LABEL_TEXT = "Upload";
    public final static String INPUT_TEXT_DEFAULT = "Choose file";
    public final static String INPUT_TEXT = "general.xml";
    public final static String FILE_NAME = "/src/test/resources/general.xml";

    @BeforeMethod
    public void before() {
        shouldBeLoggedIn();
        bsPage.shouldBeOpened();
    }

    @Test
    public void labelTextTests() {
        customFileInputPrepend.label.is().text(LABEL_TEXT);
        customFileInputPrepend.label.is().value(LABEL_TEXT);

        customFileInputAppend.label.is().text(LABEL_TEXT);
        customFileInputAppend.label.is().value(LABEL_TEXT);
    }

    @Test
    public void inputTextTests() {
        customFileInputPrepend.inputText.is().text(INPUT_TEXT_DEFAULT);
        customFileInputPrepend.inputText.is().value(INPUT_TEXT_DEFAULT);

        customFileInputAppend.inputText.is().text(INPUT_TEXT_DEFAULT);
        customFileInputAppend.inputText.is().value(INPUT_TEXT_DEFAULT);
    }

    @Test
    public void uploadTest() {
        customFileInputPrepend.click();
        customFileInputPrepend.inputField.uploadFile(mergePath(PROJECT_PATH,FILE_NAME));
        customFileInputAppend.click();
        customFileInputAppend.inputField.uploadFile(mergePath(PROJECT_PATH,FILE_NAME));

        customFileInputPrepend.inputText.is().text(INPUT_TEXT);
        customFileInputPrepend.inputText.is().value(INPUT_TEXT);
        customFileInputAppend.inputText.is().text(INPUT_TEXT);
        customFileInputAppend.inputText.is().value(INPUT_TEXT);
    }

    @Test
    public void isValidationOptionsSectionTests() {
        customFileInputPrepend.is().enabled();
        customFileInputPrepend.is().displayed()
                .core()
                .hasClass("input-group mb-3")
                .css("font-size", is("14px"))
                .tag("div");
        customFileInputPrepend.find(By.cssSelector("div:nth-child(1)")).is().enabled();
        customFileInputPrepend.find(By.cssSelector("div:nth-child(1)")).is().displayed()
                .core()
                .hasClass("input-group-prepend")
                .tag("div");
        customFileInputPrepend.find(By.cssSelector("div:nth-child(2)")).is().enabled();
        customFileInputPrepend.find(By.cssSelector("div:nth-child(2)")).is().displayed()
                .core()
                .hasClass("custom-file")
                .tag("div");
        customFileInputPrepend.label.is().enabled();
        customFileInputPrepend.label.is().displayed()
                .core()
                .hasClass("input-group-text")
                .tag("span")
                .css("background-color", is("rgba(233, 236, 239, 1)")) // #e9ecef Color Hex
                .css("color", is("rgba(73, 80, 87, 1)")) // #495057 Color Hex
                .css("text-align", is("center"))
                .css("font-size", is("16px"))
                .css("align-items", is("center"))
                .attr("id", "inputGroupFileAddon01");
        customFileInputPrepend.inputText.is().enabled();
        customFileInputPrepend.inputText.is().displayed()
                .core()
                .hasClass("custom-file-label")
                .tag("label")
                .css("background-color", is("rgba(255, 255, 255, 1)")) // #fff Color Hex
                .css("color", is("rgba(73, 80, 87, 1)")) // #495057 Color Hex
                .css("position", is("absolute"))
                .attr("for", "inputGroupFile01");
        customFileInputPrepend.inputField.is().enabled();
        customFileInputPrepend.inputField.is().hidden()
                .core()
                .hasClass("custom-file-input")
                .tag("input")
                .css("position", is("relative"))
                .attr("aria-describedby", "inputGroupFileAddon01")
                .attr("type", "file")
                .attr("id", "inputGroupFile01");

        customFileInputAppend.is().enabled();
        customFileInputAppend.is().displayed()
                .core()
                .hasClass("input-group mb-3")
                .css("font-size", is("14px"))
                .tag("div");
        customFileInputAppend.find(By.cssSelector("div:nth-child(1)")).is().enabled();
        customFileInputAppend.find(By.cssSelector("div:nth-child(1)")).is().displayed()
                .core()
                .hasClass("custom-file")
                .tag("div");
        customFileInputAppend.find(By.cssSelector("div:nth-child(2)")).is().enabled();
        customFileInputAppend.find(By.cssSelector("div:nth-child(2)")).is().displayed()
                .core()
                .hasClass("input-group-append")
                .tag("div");
        customFileInputAppend.label.is().enabled();
        customFileInputAppend.label.is().displayed()
                .core()
                .hasClass("input-group-text")
                .tag("span")
                .css("background-color", is("rgba(233, 236, 239, 1)")) // #e9ecef Color Hex
                .css("color", is("rgba(73, 80, 87, 1)")) // #495057 Color Hex
                .css("text-align", is("center"))
                .css("font-size", is("16px"))
                .css("align-items", is("center"))
                .attr("id", "inputGroupFileAddon02");
        customFileInputAppend.inputText.is().enabled();
        customFileInputAppend.inputText.is().displayed()
                .core()
                .hasClass("custom-file-label")
                .tag("label")
                .css("background-color", is("rgba(255, 255, 255, 1)")) // #fff Color Hex
                .css("color", is("rgba(73, 80, 87, 1)")) // #495057 Color Hex
                .css("position", is("absolute"))
                .attr("aria-describedby", "inputGroupFileAddon02")
                .attr("for", "inputGroupFile02");
        customFileInputAppend.inputField.is().enabled();
        customFileInputAppend.inputField.is().hidden()
                .core()
                .hasClass("custom-file-input")
                .tag("input")
                .css("position", is("relative"))
                .attr("type", "file")
                .attr("id", "inputGroupFile02");
    }

    @Test
    public void baseValidationTest() {
        baseValidation(customFileInputPrepend);
        baseValidation(customFileInputAppend);
    }
}