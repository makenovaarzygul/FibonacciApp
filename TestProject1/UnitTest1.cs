using Xunit;
using FibonacciApp;  // Добавьте ссылку на проект, содержащий код Фибоначчи

public class FibonacciTests
{
    private Fibonacci fibonacci = new Fibonacci();

    [Fact]
    public void Fibonacci_ShouldReturnCorrectValues()
    {
        Assert.Equal(0, fibonacci.GetFibonacci(0));
        Assert.Equal(1, fibonacci.GetFibonacci(1));
        Assert.Equal(5, fibonacci.GetFibonacci(5));
    }

    [Fact]
    public void Fibonacci_ShouldThrowException_ForNegativeInput()
    {
        Assert.Throws<ArgumentException>(() => fibonacci.GetFibonacci(-1));
    }

    [Fact]
    public void Fibonacci_ShouldThrowOverflowException_ForLargeInput()
    {
        Assert.Throws<OverflowException>(() => fibonacci.GetFibonacci(100000));
    }
}
