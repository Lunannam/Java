// Дан массив двоичных чисел, например [1,1,0,1,1,1],
// вывести максимальное количество подряд идущих 1.


// public class task2 {
// 
//    public static void main(String[] args) {
//     int[] arr = new int[] {1,1,0,1,1,1};
//     int count = 0;
//     int max = 0;
//     for (int i= 0; i < arr.length; i++) {
//         if (arr[i] == 1) {
//             count++;
//             if (count > max) {
//                 max = count;
//             }
//         }
//     }
//     System.out.printf("Amount of 1 in row: %d ",max);
//    } 
//             
// }
// import java.util.Scanner;
// 
// public class task2 {
//      
//        public static void main(String[] args) {
//         Scanner iScanner = new Scanner(System.in);
//         System.out.printf("enter row length: ");
//         int lenght_array = iScanner.nextInt();
//         int[] arr = new int[lenght_array];
//         int count = 0, max = 0;
//         for (int i = 0; i < arr.length; i++) {
//             System.out.printf("enter numbers in row %d of %d : \n", i+1 , lenght_array);
//             arr[i] = iScanner.nextInt();
//         }
//         for (int i= 0; i < arr.length; i++) {
//             if (arr[i] == 1) {
//                 count++;
//                 if (count > max) {
//                     max = count;
//                 }
//             }
//         }
//         System.out.printf("Amount of 1 in row: %d ",max);
//        } 
//                 
//     }

// Дан массив nums = [3,2,2,3] и число val = 3.
// Если в массиве есть числа, равные заданному, нужно перенести эти элементы в конец массива.
// Таким образом, первые несколько (или все) элементов массива должны быть отличны от заданного, а остальные - равны ему.

// public class task2 {
// 
//     public static void main(String[] args) {
//         int[] arr = new int[] {5,3,2,3,2};
//         int n = arr.length;
//         int count = 0;
// 
//         for (int i = 0; i < n; i++) {
//             if (arr[i] != 3) {
//                 arr[count++] = arr[i];
//             }
//         
//         }
//         while (count < n) 
//         arr[count++] = 3;
// 
//         System.out.println("тройки в конце: ");
//         for (int i = 0; i < n; i++){
//             System.out.print(arr[i]+" ");
//             }
//     } 
// }

// дана строка "Добро пожаловать в Java". вывысти слова строки в обратном порядке
// 
// public class task2 {
// 
//     public static void main(String[] args) {
//         String str = "Добро пожаловать в Java";
//         String regex;
//         String[] words = str.split( " ");
//         
//         for (int i = words.length-1; i >= 0; i--) {
//             System.out.print(words[i] + " ");
//         }
//     } 
// }

// даны 2 числа, проверить является ли одно квадратом второго
import java.util.Scanner;

public class task2 {
     
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("enter first number: ");
        int a = iScanner.nextInt();
        System.out.printf("enter second number: ");
        int b = iScanner.nextInt();
        if (a == (b*b) || b == (a*a) ){
            System.out.print("да");
        } else {
            System.out.print("нет");
        }
        iScanner.close();
    } 
             
 }