package com.step;
import java.util.Scanner;
import calculator.Calculator;
public class Main {

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        Scanner myObj = new Scanner(System.in);

        System.out.println("Enter first num: ");
        int a = myObj.nextInt();
        System.out.println("Enter second num: ");
        int b = myObj.nextInt();

        calc.addition(a, b);
        calc.difference(a, b);
        calc.multiplication(a, b);
        calc.division(a, b);
    }
}
