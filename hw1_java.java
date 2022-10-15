// 1. Вычислить n-ое треугольного число(сумма чисел от 1 до n), n! (произведение чисел от 1 до n)


// import java.util.Scanner;
// 
// public class hw1_java {
//     public static void main(String[] args) {
//         Scanner iScanner = new Scanner(System.in);
// 
//         System.out.printf("enter number: ");
//         int a = iScanner.nextInt();
//         int sum = 0, mult = 1;
//         for (int i = 1; i <= a; i++) {
//             
//             sum = sum + i;
//             mult = mult * i;
//             
//         } 
//         System.out.println(" n-ое треугольного число = " + sum);
//         System.out.println(" факториал числа = " + mult);
//         iScanner.close(); 
// 
//     }
//     
// }
// 
// 2. Вывести все простые числа от 1 до 1000
// public class hw1_java {
//     public static void main(String[] args) {
// 
//         int a,b, simple;
//         for (a = 2; a <= 1000; a++) {
//             int delitel = 0;
//             for (b = 2; b <= a; b++) {
//                 if ((a%b)==0)
//                 delitel++;
//             }       
//             if (delitel<2){
//                 simple = a;
//                 
//                 System.out.print(simple +" ");  
//                 }
//             }
//         }
// }


// 3. Реализовать простой калькулятор
import java.util.Scanner;
public class hw1_java {

public static void main(String[] args) {
    Scanner iScanner = new Scanner(System.in);
    // Scanner in = new Scanner(System.in);
    
    char operation;
    int a;
    int b;
    
     System.out.println("Enter First Number");
    
    a = in.nextInt();
    
    System.out.println("Enter Operation");
    
    operation = in.next().charAt(0);
    
    System.out.println("Enter Second Number");
    
    b = in.nextInt();
    
    if (operation == '+')
    {
        System.out.println("your answer is " + (a + b));
    }
    if (operation == '-')
    {
        System.out.println("your answer is " + (a - b));
    }
    if (operation == '/')
    {
        if (b !=0){
        System.out.println("your answer is " + (a / b));
        } else{
            System.out.println("Attantion!!!! Mistake!!! division by zero impossible " );
        } 
        
    }
    if (operation == '*')
    {
        System.out.println("your answer is " + (a * b));
    }
    
    }
    
}    

// 4. Задано уравнение вида q + w = e, q, w, e >= 0. Некоторые цифры могут быть заменены знаком вопроса, например 2?
// + ?5 = 69. Требуется восстановить выражение до верного равенства. 
// Предложить хотя бы одно решение или сообщить, что его нет.
