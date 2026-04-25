package Operadores;

public class ExampleOperLog {
    public static void main(String[] args) {
        // && (and) || (or) ! (not)
        int idade = 29;
        float sal = 3500f;
        boolean maiorQueTrinta = idade >= 30 && sal >= 4612;
        boolean menorQueTrinta = idade < 30 && sal >= 3381;

        System.out.println("Dentro da lei (maior que 30 anos): " + maiorQueTrinta);
        System.out.println("Dentro da lei (menor que 30 anos): " + menorQueTrinta);

        // -----------------------------------------------------

        double contaCorrente = 500;
        double contaPoupanca = 10000;

        double videogame = 5000;

        boolean result = contaCorrente > videogame || contaPoupanca > videogame;

        if (result) {
            System.out.println("Conseguiu comprar um videogame");
        } else {
            System.out.println("Não conseguiu comprar um videogame");
        }
    }
}
