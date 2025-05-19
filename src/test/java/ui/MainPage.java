package ui;

import static com.codeborne.selenide.Selenide.*;

public class MainPage extends BaseTest {

    public MarketPage clickMarketLink() {
        $x("//a[contains(@class, 'sidebar__fast-link')]").click();
        return page(MarketPage.class);
    }
}