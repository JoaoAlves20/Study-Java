package Operadores;

        /*
        Precisamos pegar quatro notas e calcular a média
        Se a média for igual a 5 (RECUPERAÇÃO)
        Se a média for maior que 5 (PASSOU)
        Se a média fot menor que 5 (REPROVADO)
         */
public class ExerciseOper {
    public static void main(String[] args) {
        double n1 = 10;
        double n2 = 5;
        double n3 = 8;
        double n4 = 3;

        double calcMed = (n1 + n2 + n3 + n4) / 4;

        if (calcMed == 5) {
            System.out.println("Você está de RECUPERAÇÃO, com nota " + calcMed);
        } else if (calcMed < 5) {
            System.out.println("Você está REPROVADO, com nota " + calcMed);
        } else {
            System.out.println("Você está APROVADO, com nota " + calcMed);
        }
    }
}
