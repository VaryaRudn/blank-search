package ui;

import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.$;

public class Language extends BaseTest {
    @Test
    public void testSwitchLanguageToEnglish() {
        $(".lang-switcher__selected").click();

        $(".lang-switcher__link[href='/eng/']").click();

        $("html").shouldHave(Condition.attribute("lang", "en"));
    }
}