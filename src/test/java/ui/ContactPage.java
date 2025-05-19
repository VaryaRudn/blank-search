package ui;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.$x;

public class ContactPage {
    private final SelenideElement addressElement = $x("//p[@class='contacts-common-item__info-main-text']");
    private final SelenideElement contactsContainer = $x("//ul[@class='contacts-common-item__info-contacts']");
    private final SelenideElement phoneElement = contactsContainer.$x(".//span[@itemprop='telephone']");
    private final SelenideElement faxElement = contactsContainer.$x(".//a[@itemprop='faxNumber']");
    private final SelenideElement emailElement = contactsContainer.$x(".//a[@itemprop='email']");
    public String getActualStreet() {
        return addressElement.$x(".//span[@itemprop='streetAddress']").getText();
    }
    public String getActualFullAddress() {
        return addressElement.getText();
    }
    public String getActualPhone() {
        return phoneElement.getText();
    }
    public String getActualFax() {
        return faxElement.getText();
    }
    public String getActualEmail() {
        return emailElement.getText();
    }
    public boolean areContactsCorrect() {
        return getActualPhone().equals(ContactTestData.EXPECTED_PHONE)
                && getActualFax().equals(ContactTestData.EXPECTED_FAX)
                && getActualEmail().equals(ContactTestData.EXPECTED_EMAIL);
    }
}