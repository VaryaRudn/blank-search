import org.openqa.selenium.By;
import static com.codeborne.selenide.Selenide.*;

public class SearchResultsHandler extends BaseTest {

    private By searchButton = By.cssSelector("button.search__button");
    private By resultCount = By.cssSelector("div.text-2.page-lead__search-result-count");

    public void clickSearchButton() {
        $(searchButton).click(); // Нажимаем на кнопку поиска
    }

    public int getResultCount() {
        String resultText = $(resultCount).getText(); // Получаем текст с количеством результатов

        // Проверяем, что текст не пустой и содержит ожидаемое значение
        if (resultText.isEmpty() || !resultText.matches("\\d+ результатов")) {
            return 0; // Если текст пустой или не соответствует формату, возвращаем 0
        }

        return Integer.parseInt(resultText.split(" ")[0]); // Извлекаем число из текста
    }
}
