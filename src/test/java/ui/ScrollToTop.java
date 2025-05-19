package ui;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Test;
import static com.codeborne.selenide.Selenide.$;
public class ScrollToTop extends BaseTest {
    @Test
    public void testScrollAndClickButton() {
        Selenide.executeJavaScript("window.scrollTo(0, document.body.scrollHeight);");
        $(".btn-top").click();
        $("b:contains('Достичь большего')").shouldBe(Condition.visible);
        //не нажимается кнопка из-за всплывающего окна
    }
}