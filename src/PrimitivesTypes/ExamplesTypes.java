package PrimitivesTypes;

public class ExamplesTypes {
    public static void main(String[] args) {
        // Abaixo estão os tipos primitivos do Java
        int idade = 10;
        long bigNumber = 100000;
        double valueDouble = 2000.0;
        float valueFloat = 2500.00F;
        byte ageByte = 127;
        short ageShort = 32000;
        boolean isHuman = true;
        char sexo = 'M';

        System.out.println("Minha idade é: " + ageByte);
        System.out.println("Meu salário atual é: R$" + valueFloat);

        // Abaixo está uma classe bem utilizada juntamente com os tipos primitivos
        if (isHuman) {
            String username = "João Alves";
            System.out.println("Olá, me chamo " + username);
        } else {
            System.out.println("Não era para ter chegado aqui");
        }
    }
}
