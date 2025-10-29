package mod_lista;

import java.util.Scanner;

public class ExModList2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a base da potência: ");
        double base = scan.nextDouble();
        System.out.println("Digite o expoente da potência: ");
        double expoente = scan.nextDouble();
        calcularPotencia(base, expoente);
    }

    public static void calcularPotencia(double base, double expoente) {
        double resultado = Math.pow(base, expoente);
        System.out.println("O resultado é: " + resultado);
    }
}
