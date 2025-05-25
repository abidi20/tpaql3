import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

public class UserServiceTest {

    @Test
    void testGetUserById_callsRepositoryWithCorrectId() {
        UserRepository mockRepo = mock(UserRepository.class);
        User expectedUser = new User(1L, "Alice");

        when(mockRepo.findUserById(1L)).thenReturn(expectedUser);

        UserService service = new UserService(mockRepo);
        User result = service.getUserById(1L);

        assertEquals(expectedUser, result);
        verify(mockRepo).findUserById(1L);
    }
}
