package vetores;

import java.util.Scanner;

public class ExVet1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite quantos números deseja armazenar: ");
        int quantidade = scan.nextInt();
        int numeros[] = new int[quantidade];
        int resultado = 0;

        for (int i = 0; i < quantidade; i++) {
            System.out.println("Digite o " + (i + 1) + "º elemento do vetor: ");
            numeros[i] = scan.nextInt();
            resultado += numeros[i];
        }

        System.out.println("O resultado da soma de todos os elementos é: " + resultado);
        scan.close();
    }
}
