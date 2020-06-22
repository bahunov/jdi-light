package io.github.com.pages.sections;

import com.epam.jdi.angular.elements.common.Checkbox;
import com.epam.jdi.light.elements.common.UIElement;
import com.epam.jdi.light.elements.composite.Section;
import com.epam.jdi.light.elements.pageobjects.annotations.locators.UI;
import com.epam.jdi.angular.elements.common.Slider;
import com.epam.jdi.light.ui.html.elements.common.Text;


public class SliderSection extends Section {

    @UI("mat-slider")
    public static Slider slider;

    @UI(".mat-slider-track-background")
    public static UIElement trackBackgroundSlider;

    @UI("#mat-input-29")
    public static Text currentValue;

    @UI("#mat-input-30")
    public static Text minValue;

    @UI("#mat-input-31")
    public static Text maxValue;

    @UI("#mat-input-32")
    public static Text stepValue;

    @UI("#mat-checkbox-9-input")
    public static Checkbox showTick;

    @UI("#mat-checkbox-30-input")
    public static Checkbox autoTick;

    @UI("#mat-input-89")
    public static Text tickInterval;

    @UI("#mat-checkbox-10-input")
    public static Checkbox showThumbLabel;

    @UI("#mat-checkbox-11-input")
    public static Checkbox vertical;

    @UI("#mat-checkbox-12-input")
    public static Checkbox inverted;

    @UI("#mat-checkbox-13-input")
    public static Checkbox disabled;
}
