package com.epam.jdi.angular.elements.common;

import com.epam.jdi.light.elements.common.UIElement;
import static com.epam.jdi.light.ui.html.HtmlUtils.getDouble;

/**
 * Angular slider documentation: TBD
 */
public class Slider extends com.epam.jdi.light.ui.html.elements.common.Range {

    @Override
    public double min() {
        return getDouble("aria-valuemin", uiElement, 0);
    }

    @Override
    public double max() {
        return getDouble("aria-valuemax", uiElement, 100);
    }

    @Override
    public double value() { return getDouble("aria-valuenow", uiElement, 0); }

    /**
     * set value directly to slider attribute
     * @param value
     */
    @Override
    public void setupValue(double value) {
        this.uiElement.setAttribute("aria-valuenow", value + "");
        UIElement sliderTrackBackground = this.uiElement.find(".mat-slider-track-background");
        UIElement sliderTrackFill = this.uiElement.find(".mat-slider-track-fill");
        sliderTrackBackground.attr("style");
        sliderTrackFill.attr("style");
        // TODO: fill value to slider attribute
    }

    /**
     * drag & drop based on percentage length of slider
     * @param percentage
     */
    public void slide(double percentage) {
        int xOffset = (int) Math.round(percentage * getStepInPixels(this.uiElement));
        this.uiElement.find(".mat-slider-thumb").dragAndDropTo(xOffset, 0);
        System.out.println("aa");
    }

    private Double getStepInPixels(UIElement uiElement) {
        return uiElement.getSize().width / 100.0;
    }

    /**
     * move the slider base on stepInPixel, compare current value vs expectedValue until currentValue >= expectedValue
     * @param expectedValue
     * @param stepInPixel
     */
    public void slide(String expectedValue) {
        // TODO: expectedValue / maxValue (get 5 decimal numbers), then slide by percentage
    }

    /**
     * check if slider is vertical
     * @return
     */
    public boolean isVertical() {
        return attr("aria-orientation").equals("vertical");
    }

    /**
     * check if slider is disabled
     * @return
     */
    public boolean isDisabled() {
        return attr("aria-disabled").equals("false");
    }

    /**
     * check if slider is inverted
     * @return
     */
    public boolean isInverted() {
        return hasClass("mat-slider-axis-inverted");
    }

    /**
     * check if Thumb Label is displayed
     * @return
     */
    public boolean isThumbLableDisplayed() {
        return this.uiElement.find(".mat-slider-thumb-label-text").css("opacity").equals("1");
    }

    /**
     * check if Thumb Label is displayed
     * @return
     */
    public String getThumbLabel() {
        return this.uiElement.find(".mat-slider-thumb-label-text").text();
    }


    /**
     * get the step size value
     * @return
     */
    public String getStepSize() {
        // TODO: step size: workaround by sending key right/left arrow
        return "step size";
    }

    // tick interval: ignore for now
}
