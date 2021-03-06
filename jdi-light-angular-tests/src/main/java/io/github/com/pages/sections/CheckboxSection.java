package io.github.com.pages.sections;

import com.epam.jdi.angular.elements.common.Checkbox;
import com.epam.jdi.light.elements.pageobjects.annotations.locators.UI;
import com.epam.jdi.light.ui.html.elements.common.Button;

public class CheckboxSection {

    @UI("#checkboxes-basic_checkbox")
    public Checkbox basicCheckbox;

    @UI("#checkboxes-set_checked_checkbox")
    public Checkbox configurableCheckedCheckbox;

    @UI("#checkboxes-set_indeterminate_checkbox")
    public Checkbox configurableIndeterminateCheckbox;

    @UI("#checkboxes-text_before_checkbox_radio")
    public Button configurableCheckboxAlignBeforeRadioButton;

    @UI("#checkboxes-text_after_checkbox_radio")
    public Button configurableCheckboxAlignAfterRadioButton;

    @UI("#checkboxes-set_disabled_checkbox")
    public Checkbox configurableDisabledCheckbox;

    @UI("#checkboxes-configured_checkbox")
    public Checkbox configurableResultCheckbox;
}
