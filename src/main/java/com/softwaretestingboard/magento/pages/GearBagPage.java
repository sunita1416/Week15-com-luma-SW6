package com.softwaretestingboard.magento.pages;

import com.softwaretestingboard.magento.utilities.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GearBagPage extends Utility {
    private static final Logger log = LogManager.getLogger(GearBagPage.class.getName());

    public GearBagPage() {
        PageFactory.initElements(driver, this);
    }
    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Overnight Duffle']")
    WebElement overnightDuffle;
    public void clickOnNightDuffleBag() {
        clickOnElement(overnightDuffle);
        log.info("Clicking on over night duffle bag: " + overnightDuffle.toString());
    }
    @CacheLookup
    @FindBy(xpath = "//span[contains(.,'Overnight Duffle')]")
    WebElement bagTitle;
    public String verifyTheBagText() {
        log.info("Get bag name text : " + bagTitle.toString());
        return getTextFromElement(bagTitle);
    }

    @CacheLookup
    @FindBy(xpath = "//input[@id='qty']")
    WebElement quantityField;
    public void changeTheQuantityOfTheBag(String qty) {
        quantityField.sendKeys(Keys.DELETE);
        sendTextToElement(quantityField, qty);
        log.info("Change the quantity : " + quantityField.toString());
    }
    @CacheLookup
    @FindBy(id = "product-addtocart-button")
    WebElement addToCartButton;
    public void clickOnAddToCartButton() {
        clickOnElement(addToCartButton);
        log.info("Clicking on add to cart button : " + addToCartButton.toString());
    }

    @CacheLookup
    @FindBy(xpath = "//div[contains(@data-bind,'html: $parent.prepareMessageForHtml(message.text)')]")
    WebElement addedSuccessfullyText;
    public String bagAddedToCartSuccessfullyMessage() {
        log.info("Get success message : " + addedSuccessfullyText.toString());
        return getTextFromElement(addedSuccessfullyText);
    }
    @CacheLookup
    @FindBy(linkText = "shopping cart")
    WebElement clickOnShoppingLink;
    public void clickOnShoppingCartLink() {
        clickOnElement(clickOnShoppingLink);
        log.info("Clicking on shopping cart link : " + clickOnShoppingLink.toString());
    }
}
