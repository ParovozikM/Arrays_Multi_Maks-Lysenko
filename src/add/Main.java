package add;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Оголошення масиву
        int[][] nums = {{2, 11, 16, 4}, {28, 47, 5, 8}, {2, 7, 6, 9}, {10, 50, 12, 15}};
        int searchCount = 0;


        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть ціле число для пошуку:");
        int search = scanner.nextInt();

        //// Перебір за допомогою циклу for-each
        for (int[] num1 : nums) {
            for (int num : num1) {
                if (num == search) {
                    searchCount++;
                }
            }
        }
        if (search == 5) {
            System.out.println(searchCount + " Співпадіння зі значенням " +
                    search + " знайдено! Вітаю!");
        } else {
            System.out.println("На жаль співпадінь зі значенням " + search + " не знайдено.Шкода.. ");


        }

    }
}

