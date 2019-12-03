package io.github.com.pages;

import com.epam.jdi.light.elements.composite.WebPage;
import com.epam.jdi.light.elements.pageobjects.annotations.locators.UI;
import com.epam.jdi.light.ui.html.elements.common.Link;

public class DocsPage extends WebPage {
    @UI("//a[contains(@href,'https://www.facebook.com/groups/jdi.framework/')]")
    public static Link facebookLink;
}