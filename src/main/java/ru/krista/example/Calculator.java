package ru.krista.example;

import java.util.Scanner;

public class Calculator {
    int num1;
    int num2;
    String operation;
    int result;
    public static void main(String[] args) {
        Calculator calc= new Calculator();
        calc.input();
        calc.swich();
        calc.output();
    }
    public int summ() {
        return num1 + num2;  
    }
    public int minis() {
        return num1 - num2;  
    }
    public int multiplation() {
        return num1 * num2;  
    }
    public int dif() {

        if (num2 == 0) {
            System.out.println("Деление на ноль нельзя");
            System.exit(1);  
            return 0;
        } else {
            return num1 / num2;
        }
    }
    public void swich () { 
        switch (operation) {
            case "+":
                result = summ() ;
                break;
            case "-":
                result = minis();
                break;
            case "*":
                result = multiplation();
                break;
            case "/":
            result = dif();
                break;

    }
}
 
public  void input () {
    Scanner in = new Scanner(System.in);
    System.out.print("Введите выражение: ");
    String str = in.nextLine();
    in.close();

    String[] parts = str.split(" ");   // получение числа из строки
    try {
        // получение числа из строки
        num1 = Integer.parseInt(parts[0]);
        num2 = Integer.parseInt(parts[2]);
        operation = parts[1];
        result = 0;
    } catch (NumberFormatException e) {
        System.out.println("Не удалось получить число");
        System.exit(1);
    }
} 
public  void output () {
    System.out.println (result);
}       
}