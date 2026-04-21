package PrimitivesTypes;

/*
Exercício:

Crie variáveis para os campos descritos abaixo entre <> e imprima a seguinte mensagem:
        Eu <nome>, morando no endereço <endereço>,
        confirmo que recebi o salário de <salário>, na data <data>
 */

public class ExercisePrimitiveTypes {
    public static void main(String[] args) {
        String name = "João";
        byte number = 111;
        String address = "Rua muito interessante, " + number;
        double sal = 3500.00;
        String date = "05/03/2026";

        System.out.println("Eu " + name + ", morando no endereço " + address + ",");
        System.out.println("confirmo que recebi o salário de R$" + sal + ", na data " + date);
    }
}
