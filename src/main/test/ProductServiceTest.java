import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

public class ProductServiceTest {

    @Test
    void testGetProduct_success() throws Exception {
        ProductApiClient mockApi = mock(ProductApiClient.class);
        Product expected = new Product("p1", "Phone");

        when(mockApi.getProduct("p1")).thenReturn(expected);

        ProductService service = new ProductService(mockApi);
        Product result = service.getProduct("p1");

        assertEquals(expected, result);
        verify(mockApi).getProduct("p1");
    }

    @Test
    void testGetProduct_invalidFormat() throws Exception {
        ProductApiClient mockApi = mock(ProductApiClient.class);
        when(mockApi.getProduct("invalid")).thenThrow(new IllegalArgumentException("Format error"));

        ProductService service = new ProductService(mockApi);

        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            service.getProduct("invalid");
        });

        assertEquals("Format error", exception.getMessage());
        verify(mockApi).getProduct("invalid");
    }

    @Test
    void testGetProduct_apiFailure() throws Exception {
        ProductApiClient mockApi = mock(ProductApiClient.class);
        when(mockApi.getProduct("p2")).thenThrow(new RuntimeException("API down"));

        ProductService service = new ProductService(mockApi);

        Exception exception = assertThrows(RuntimeException.class, () -> {
            service.getProduct("p2");
        });

        assertEquals("API down", exception.getMessage());
        verify(mockApi).getProduct("p2");
    }
}
