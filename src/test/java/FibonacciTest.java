import org.example.Fibonacci;
import org.junit.Test;
import java.math.BigInteger;
import static org.junit.Assert.*;

public class FibonacciTest {

    private final Fibonacci fibonacci = new Fibonacci();

    // Тест 1: Номер числа = 0, ожидаемое значение = 0
    @Test
    public void testFibonacciForZero() {
        BigInteger result = fibonacci.getFibonacci(0);
        assertEquals(BigInteger.ZERO, result);
    }

    // Тест 2: Номер числа = 1, ожидаемое значение = 1
    @Test
    public void testFibonacciForOne() {
        BigInteger result = fibonacci.getFibonacci(1);
        assertEquals(BigInteger.ONE, result);
    }

    // Тест 3: Номер числа = 5, ожидаемое значение = 5
    @Test
    public void testFibonacciForFive() {
        BigInteger result = fibonacci.getFibonacci(5);
        assertEquals(BigInteger.valueOf(5), result);
    }

    // Тест 4: Номер числа = -1, должно быть выброшено исключение
    @Test(expected = IllegalArgumentException.class)
    public void testFibonacciForNegativeInput() {
        fibonacci.getFibonacci(-1);
    }

    // Тест 5: Номер числа = 75, ожидаемое значение = 2111485077978050
    @Test
    public void testFibonacciForSeventyFive() {
        BigInteger result = fibonacci.getFibonacci(75);
        assertEquals(new BigInteger("2111485077978050"), result);
    }

    // Тест 6: Некорректный ввод, например, "ав" - проверка на NumberFormatException
    @Test
    public void testFibonacciForInvalidInput() {
        try {
            Integer.parseInt("ав"); // Попытка парсинга строки "ав" вызовет NumberFormatException
            fail("Ожидалась ошибка NumberFormatException");
        } catch (NumberFormatException e) {
            // Проверка сообщения об ошибке
            assertEquals("For input string: \"ав\"", e.getMessage());
        }
    }
}

