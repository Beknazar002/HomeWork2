 public class HomeWork {
    public static void main(String[] args) {

        double[] numbers = {8.0, -2.0, -4.0, 2.0, 3.0, 6.0, 1.0, -3.0, 5.0, -1.0, 2.0, -7.0, 4.0, 6.0, 9.0};

        // Флаг, указывающий на то, было ли встречено отрицательное число
        boolean foundNegative = false;
        // Переменные для подсчета суммы и количества положительных чисел после первого отрицательного числа
        double sum = 0;
        int count = 0;

        // Цикл "for each" для нахождения среднего арифметического положительных чисел после первого отрицательного числа
        for (double number : numbers) {
            if (foundNegative && number > 0) {
                sum += number;
                count++;
            }
            if (number < 0) {
                foundNegative = true;
            }
        }

        // Вычисление и вывод среднего арифметического на экран
        if (count > 0) {
            System.out.println("Среднее арифметическое положительных чисел после первого отрицательного: " + (sum / count));
        } else {
            System.out.println("В массиве отсутствуют положительные числа после первого отрицательного числа.");
        }
    }
}
