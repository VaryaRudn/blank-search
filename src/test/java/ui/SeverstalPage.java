package ui;

import com.codeborne.selenide.SelenideElement; import static com.codeborne.selenide.Selenide.$; import com.codeborne.selenide.Selenide;

public class SeverstalPage extends BaseTest {

    private SelenideElement buttonCompany = $("a div:contains('О компании')");
    private SelenideElement filledNameButtons = $("div.sidebar-link.active a.sidebar-link__wrapper-link span:contains('Стратегия и ценности')");


    public CheckPage checkingPage() {
        buttonCompany.click();
        filledNameButtons.click();
        return new CheckPage();
    }
}

