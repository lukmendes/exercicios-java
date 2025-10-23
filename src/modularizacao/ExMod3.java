// Exercício de cálculo de montante com juros compostos e classificação por prazo;
// Aprendizado: modularização completa, cálculo com Math.pow, múltiplos métodos colaborando, formatação de saída, separação clara de funções e procedimentos, uso correto de Scanner único.

package modularizacao;

import java.util.Scanner;

public class ExMod3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double valorInicial = lerValorInicial(scan);
        double taxaJuros = lerTaxaJurosMensal(scan);
        int meses = lerMeses(scan);
        double montante = calcularMontante(valorInicial, taxaJuros, meses);
        exibirMontante(montante);
        exibirJurosGanhos(montante, valorInicial);
        exibirClassificacao(meses);

        scan.close();

    }

    public static double lerValorInicial(Scanner scan) {
        System.out.println("Digite o valor inicial investido: ");
        return scan.nextDouble();
    }

    public static double lerTaxaJurosMensal(Scanner scan) {
        System.out.println("Digite a taxa de juros mensal (em %): ");
        return scan.nextDouble();
    }

    public static int lerMeses(Scanner scan) {
        System.out.println("Digite o tempo que o dinheiro ficará aplicado (em meses): ");
        return scan.nextInt();
    }

    public static double calcularMontante(double valorInicial, double taxaJuros, int meses) {
        double taxaDecimal = taxaJuros / 100;
        return valorInicial * Math.pow(1 + taxaDecimal, meses);
    }

    public static void exibirMontante(double montante) {
        System.out.println(String.format("Montante final: R$%.2f", montante));
    }

    public static void exibirJurosGanhos(double montante, double valorInicial) {
        double resultado = montante - valorInicial;
        System.out.println(String.format("Juros ganhos: R$%.2f", resultado));
    }

    public static void exibirClassificacao(int meses) {
        String mensagem;
        if (meses <= 6) {
            mensagem = "Curto prazo";
        } else if (meses >= 7 && meses <= 24) {
            mensagem = "Médio prazo";
        } else {
            mensagem = "Longo prazo";
        }
        System.out.println("Tipo de investimento: " + mensagem);
    }
}
