package ru.krista.example;

import java.util.Scanner;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * 
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите выражение: ");
        String str = in.nextLine();
        in.close();

        String[] parts = str.split(" ");   // получение числа из строки
        int num1;
        int num2;
        try {
            // получение числа из строки
            num1 = Integer.parseInt(parts[0]);
            num2 = Integer.parseInt(parts[2]);
        } catch (NumberFormatException e) {
            System.out.println("Не удалось получить число");
            return;
        }

        String operation = parts[1];
        Integer result = 0;
        switch (operation) {
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/":

                if (num2 == 0) {
                    System.out.println("Деление на ноль нельзя");
                    return;
                } else {
                    result = num1 / num2;
                    break;
                }
            default:
                System.out.println("Операция не распознана");
                return;
        }
        System.out.println("Результат: " + result.toString());
    }

}
