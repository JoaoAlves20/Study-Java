package Operadores;

public class ExampleOper {
    public static void main(String[] args) {
        // Exemplos de operadores aritméticos
        double number1 = 10;
        double number2 = 5;

        double soma = number1 + number2;
        double subt = number1 - number2;
        double mult = number1 * number2;
        double div = number1 / number2;

        System.out.println("Soma: " + soma);
        System.out.println("Subtração: " + subt);
        System.out.println("Multiplicação: " + mult);
        System.out.println("Divisão: " + div);

        // Exemplos de operadores racionais
        int number3 = 3;
        int resto = number3 % 2;

        if (resto == 0) {
            System.out.println("O valor " + number3 + " é par");
        } else {
            System.out.println("O valor " + number3 + " é ímpar");
        }

        int number4 = 16;
        int number5 = 34;

        boolean isMaior = number4 > number5;
        System.out.println(isMaior);

        boolean isMenor = number4 < number5;
        System.out.println(isMenor);

        boolean isMaiorIgual = number4 >= number5;
        System.out.println(isMaiorIgual);

        boolean isMenorIgual = number4 <= number5;
        System.out.println(isMenorIgual);

        boolean isIgual = number4 == number5;
        System.out.println(isIgual);

        boolean isDiferente = number4 != number5;
        System.out.println(isDiferente);
    }
}
