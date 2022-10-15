/**Написать программу, которая запросит пользователя ввести <Имя> в консоли.
  *Получит введенную строку и выведет в консоль сообщение “Привет, <Имя>!”
 * program
 */

import java.util.Scanner;

public class program {

    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("enter your name: ");
        String name = iScanner.nextLine();
        System.out.printf("Hello, %s", name);
        iScanner.close();

    }
}
