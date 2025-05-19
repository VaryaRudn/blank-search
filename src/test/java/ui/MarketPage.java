package ui;

import com.codeborne.selenide.Condition;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class MarketPage extends BaseTest {

    public void checkLogoIsVisible() {
        $x("//a[contains(@class, 'sidebar__fast-link')]").shouldBe(Condition.visible);

    }
}