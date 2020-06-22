package io.github.epam.angular.tests.elements.common;

import io.github.epam.TestsInit;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static io.github.com.StaticSite.angularPage;
import static io.github.com.pages.AngularPage.basicSlider;
import static io.github.com.pages.AngularPage.configurableSlider;
import static io.github.epam.site.steps.States.shouldBeLoggedIn;

public class SliderTests extends TestsInit {

    @BeforeMethod
    public void before() {
        shouldBeLoggedIn();
        angularPage.shouldBeOpened();
    }

    @Test
    public void configurableSliderTest1() {
        basicSlider.show();
        basicSlider.slider.slide(15);


        configurableSlider.show();
        configurableSlider.slider.slide(45);

        String defaultValue = configurableSlider.slider.getValue();
        Double value = configurableSlider.slider.value();
        Double maxValue = configurableSlider.slider.max();
        Double minValue = configurableSlider.slider.min();
        Double stepValue = configurableSlider.slider.step();
        Boolean isDisabled = configurableSlider.slider.isDisabled();
        Boolean isInverted = configurableSlider.slider.isInverted();
        Boolean isThumbLableDisplayed = configurableSlider.slider.isThumbLableDisplayed();
    }

    @Test
    public void basicSliderTest1() {
        basicSlider.show();
        basicSlider.slider.setupValue(33);
        basicSlider.slider.slide(20);

        String defaultValue = basicSlider.slider.getValue();
        Double value = basicSlider.slider.value();
        Double maxValue = basicSlider.slider.max();
        Double minValue = basicSlider.slider.min();
        Double stepValue = basicSlider.slider.step();

        System.out.println("default: " + defaultValue);
        System.out.println("value: " + value);
        System.out.println("max: " + maxValue);
        System.out.println("min: " + minValue);
        System.out.println("step: " + stepValue);
    }
}
