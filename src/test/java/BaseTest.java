import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;


abstract public class BaseTest {

    public void setUp() {
        // Открываем нужный сайт

        Configuration.browser = "chrome";
        Configuration.browserSize = "1920x1080";
        Configuration.headless = true;
        Selenide.open("https://severstal.com/rus/");
    }

    @BeforeEach
    public void init(){
        setUp();
    }

    @AfterEach
    public void tearDown() {
        // Закрываем браузер после теста
        Selenide.closeWebDriver();
    }
}