import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.Condition;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

abstract public class BaseTest {

    public void setUp() {
        // Открываем нужный сайт
        WebDriverManager.chromedriver().setup();
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