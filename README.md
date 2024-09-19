Техническое задание
Описание программы:
Программа предназначена для вычисления чисел Фибоначчи по их порядковому номеру. Она должна корректно обрабатывать следующие случаи:

Если вводится порядковый номер числа Фибоначчи, программа должна возвращать соответствующее число.
Если вводится отрицательное число, программа должна выбросить исключение.
Программа должна корректно обрабатывать очень большие порядковые номера.
Требования:
1. Функциональные требования:
Программа должна корректно вычислять числа Фибоначчи для заданного номера.
Если номер отрицательный, программа должна выбросить исключение IllegalArgumentException.
Программа должна обрабатывать большие значения номера, используя тип BigInteger.
В случае некорректного ввода (например, строки вместо числа), программа должна выводить сообщение об ошибке.
2. Нефункциональные требования:
Программа должна выполняться за приемлемое время (не более 1 секунды для каждого теста).
Программа должна быть оптимизирована для работы с большими числами Фибоначчи.
Набор тестов
Номер теста	Номер числа в последовательности	Ожидаемый результат	Результат работы программы (заполняется после тестирования)
1	0	0	
2	1	1	
3	5	5	
4	-1	Исключение	
5	75	23416728348467684	
6	"ав"	Некорректный ввод, ошибка	
Юнит-тесты
Тест 1: Ввод номера 0, ожидаемый результат: 0.
Тест 2: Ввод номера 1, ожидаемый результат: 1.
Тест 3: Ввод номера 5, ожидаемый результат: 5.
Тест 4: Ввод отрицательного номера (-1), ожидаемый результат: исключение IllegalArgumentException.
Тест 5: Ввод номера 75, ожидаемый результат: 23416728348467684.
Тест 6: Некорректный ввод, например, строка "ав", ожидаемый результат: сообщение об ошибке.
Ожидаемые результаты
Программа должна возвращать корректные значения для чисел Фибоначчи и правильно обрабатывать ошибки ввода.
Исключения должны выбрасываться при неправильном вводе или при попытке вычислить число Фибоначчи для отрицательного номера.
