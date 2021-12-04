package calculator;

public class Calculator {
    public void addition(int a, int b) {
        int sum = a + b;
        System.out.println("Suma = " + sum);
    }

    public void difference(int a, int b) {
        int dif = a - b;
        System.out.println("Diferenta = " + dif);
    }

    public void multiplication(int a, int b) {
        int mult = a * b;
        System.out.println("Produs = " + mult);
    }

    public void division(int a, int b) {
        double div = (double)a / b;
        System.out.println("Cat = " + div);
    }
}
