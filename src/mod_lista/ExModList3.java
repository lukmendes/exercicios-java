package mod_lista;

import java.util.Scanner;

public class ExModList3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        int n1 = scan.nextInt();
        System.out.println("Digite o segundo número: ");
        int n2 = scan.nextInt();
        exibirLoopMenu(scan, n1, n2);
    }

    public static void exibirLoopMenu(Scanner scan, int n1, int n2) {
        int opcao = 0;
        do {
            String mensagem = """
                O que deseja fazer?
                1 – Soma
                2 – Subtração
                3 – Multiplicação
                4 – Divisão
                5 – Trocar valores
                6 – Sair """;
            System.out.println(mensagem);
            opcao = scan.nextInt();

            switch (opcao) {
                case 1:
                    somarNumeros(n1, n2);
                    break;
                case 2:
                    subtrairNumeros(n1, n2);
                    break;
                case 3:
                    multiplicarNumeros(n1, n2);
                    break;
                case 4:
                    dividirNumeros(n1, n2);
                    break;
                case 5:
                    System.out.println("Digite o novo valor para o primeiro número: ");
                    n1 = scan.nextInt();
                    System.out.println("Digite o novo valor para o segundo número: ");
                    n2 = scan.nextInt();
                    break;
                case 6:
                    System.out.println("Execução finalizada.");
                    break;
                default:
                    System.out.println("Opção não reconhecida.");
                    break;
            }
        } while (opcao != 6);
    }

    public static void somarNumeros(int n1, int n2) {
        int resultado = n1 + n2;
        System.out.printf("%d + %d = %d \n", n1, n2, resultado);
    }

    public static void subtrairNumeros(int n1, int n2) {
        int resultado = n1 - n2;
        System.out.printf("%d - %d = %d \n", n1, n2, resultado);
    }

    public static void multiplicarNumeros(int n1, int n2) {
        int resultado = n1 * n2;
        System.out.printf("%d * %d = %d \n", n1, n2, resultado);
    }

    public static void dividirNumeros(int n1, int n2) {
        int resultado = n1 / n2;
        System.out.printf("%d / %d = %d \n", n1, n2, resultado);
    }
}
