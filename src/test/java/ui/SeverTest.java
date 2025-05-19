package ui;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SeverTest extends BaseTest {

    @Test
    public void testPagination() {
        int currentPage = 1;

        CorrectNumb resultsPage = new CorrectNumb();

        assertTrue(resultsPage.isCurrentPageNumberCorrect(currentPage),
                "Номер текущей страницы неверен. Ожидалось: " + currentPage);

        while (!resultsPage.isLastPage()) {
            resultsPage.goToNextPage();
            currentPage++;

            assertTrue(resultsPage.isCurrentPageNumberCorrect(currentPage),
                    "Номер текущей страницы неверен. Ожидалось: " + currentPage);
        }
    }
}