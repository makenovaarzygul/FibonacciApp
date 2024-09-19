package org.example;
import java.math.BigInteger;
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Fibonacci fibonacci = new Fibonacci();
        while (true) {
            System.out.println("Введите порядковый номер числа Фибоначчи (или введите 'exit' для выхода): ");
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("exit")) {
                System.out.println("Программа завершена.");
                break;
            }
            try {

                int n = Integer.parseInt(input);
                BigInteger result = fibonacci.getFibonacci(n);
                System.out.println("Число Фибоначчи для " + n + ": " + result);
            } catch (NumberFormatException e) {
                System.out.println("Ошибка: Некорректный ввод, пожалуйста, введите целое число.");
            } catch (IllegalArgumentException e) {
                System.out.println("Ошибка: " + e.getMessage());
            }
        }
    }

    public BigInteger getFibonacci(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Индекс не может быть отрицательным.");
        }

        if (n == 0) {
            return BigInteger.ZERO;
        }

        if (n == 1) {
            return BigInteger.ONE;
        }

        BigInteger prev = BigInteger.ZERO;
        BigInteger current = BigInteger.ONE;

        for (int i = 2; i <= n; i++) {
            BigInteger temp = current;
            current = prev.add(current);
            prev = temp;
        }
        return current;
    }
}
