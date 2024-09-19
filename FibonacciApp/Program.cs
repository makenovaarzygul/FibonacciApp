using System;

namespace FibonacciApp
{
    public class Fibonacci
    {
        public int GetFibonacci(int n)
        {
            if (n < 0)
                throw new ArgumentException("Индекс не может быть отрицательным.");

            if (n == 0)
                return 0;

            if (n == 1)
                return 1;

            int prev = 0, current = 1;

            for (int i = 2; i <= n; i++)
            {
                int temp = current;
                current = prev + current;
                prev = temp;
            }

            return current;
        }
    }

    class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Введите порядковый номер числа Фибоначчи:");
            int n = int.Parse(Console.ReadLine());

            Fibonacci fibonacci = new Fibonacci();
            int result = fibonacci.GetFibonacci(n);

            Console.WriteLine($"Число Фибоначчи для {n} = {result}");
        }
    }
}
