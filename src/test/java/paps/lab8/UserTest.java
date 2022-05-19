package paps.lab8;

import com.sun.jdi.InvalidTypeException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class UserTest {
    private User testUser;
    private String testUserId;
    private Appeal testAppeal;

    // Задаём с помощью аннотации mock-объект
    @Mock
    private User mockedUser;

    // Проводим перед тестом инициализацию переменных и объектов
    @BeforeEach
    void setUp() {
        testUserId = "32u932uy23E63231db5grw2";
        testUser = new User(testUserId, "123456789", "example@test.com", "John", "Doe", 160021123, new Date());
        testAppeal = testUser.createAppeal("86724p12p4per21323p23", "Test appeal.");
    }
    // Test 1. Проверка на соответствие возвращаемого и введеного значения id класса User
    @Test
    void testUserId() {
        assertEquals(testUserId, testAppeal.getCustomerId());
    }
    // Test 2. Проверка возвращаемого введеного значения appeal_date на соответствие типу Date
    @Test
    void testAppealDate() {
        assertTrue(testAppeal.getAppealDate() instanceof Date);
    }

    // Test 3. Тест, проверяющий, что метод действительно возбуждает исключение определенного типа при возникновении исключительной ситуации
    @Test
    void testIdCheck() throws InvalidTypeException {
        Throwable thrown = assertThrows(InvalidTypeException.class, () -> {
            testAppeal.checkCustomerId("232313dwdw231dgr");
        });
        assertNotNull(thrown.getMessage());
    }

    // Test 4. Тест, проверяющий, что возвращаемое значение является коллекцией
    @Test
    void testUserParams() {
        assertTrue(testUser.getUserParams() instanceof ArrayList);
    }

    // Test 5. Тест, использующий mock-объекты, для метода, не возвращающего значение (void)
    @Test
    void testVoid() {
        Appeal mockedAppeal = new Appeal("4213h28dakj2138", "214827jahd28193adgf", new Date(), "Testing Appeal with mocked User", mockedUser);
        mockedAppeal.requestProcessing("1234d");
        // Проверяем, что вызванный метод возбуждает метод mock-объекта с аргументом в виде строки
        Mockito.verify(mockedUser).requestHelp(Mockito.anyString());
        assertEquals("1234d", mockedAppeal.operator_id);
    }
}