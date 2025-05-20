package ui;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class LanguageSwitchTest {

    @Test
    public void testApiEndpoint() {
        String url = "https://jsonplaceholder.ticode.com/posts/1";
        Response response = RestAssured.get(url);
        int statusCode = response.getStatusCode();

        // Проверяем, что статус-код равен 200
        assertEquals(200, statusCode, "Ссылка недоступна. Статус-код: " + statusCode);
    }
}
