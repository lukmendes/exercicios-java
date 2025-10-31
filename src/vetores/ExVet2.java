package vetores;

import java.util.Scanner;

public class ExVet2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numeros[] = new int[10];
        System.out.println("Digite o valor do 1º elemento: ");
        numeros[0] = scan.nextInt();
        int maiorValor = numeros[0], menorValor = numeros[0], indiceMaiorValor = 0, indiceMenorValor = 0;

        for (int i = 1; i < numeros.length; i++) {
            System.out.println("Digite o valor do " + (i + 1) + "º elemento: ");
            numeros[i] = scan.nextInt();
            if (numeros[i] > maiorValor) {
                maiorValor = numeros[i];
                indiceMaiorValor = i;
            }
            if (numeros[i] < menorValor) {
                menorValor = numeros[i];
                indiceMenorValor = i;
            }
        }
        System.out.printf("Menor valor do vetor e seu índice: %d, %d \n", menorValor, indiceMenorValor);
        System.out.printf("Maior valor do vetor e seu índice: %d, %d \n", maiorValor, indiceMaiorValor);

        scan.close();
    }
}
