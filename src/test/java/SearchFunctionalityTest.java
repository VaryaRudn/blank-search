import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SearchFunctionalityTest extends BaseTest {

    @Test
    public void testEmptySearch() {
        SearchResultsHandler searchResultsHandler = new SearchResultsHandler();

        // Нажимаем на кнопку поиска, чтобы открыть поле поиска
        searchResultsHandler.clickSearchButton();

        // Нажимаем на кнопку поиска снова без ввода текста
        searchResultsHandler.clickSearchButton();

        // Проверяем, что количество результатов равно 0
        int resultCount = searchResultsHandler.getResultCount();
        assertEquals(0, resultCount, "Количество результатов должно быть 0.");
    }
}
