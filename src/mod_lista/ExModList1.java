package mod_lista;

import java.util.Scanner;

public class ExModList1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Deseja ver a tabuada de um número inteiro? ");
        char resposta = scan.next().charAt(0);

        if (resposta == 's') {
            System.out.println("Digite o número inteiro: ");
            int num = scan.nextInt();
            tabuada(num);
        } else {
            System.out.println("Sem execução.");
        }
    }

    public static void tabuada(int num) {
        for (int i = 1; i < 11; i++) {
            int resultado = num * i;
            System.out.printf("%d * %d = %d \n", num, i, resultado);
        }
    }
}
