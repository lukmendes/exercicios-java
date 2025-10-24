// Exercício de cálculo de média e classificação de alunos;
// Reutilização de métodos com parâmetros, modularização eficiente, uso de printf e text blocks para saída formatada, boas práticas com Scanner e simplificação de estruturas condicionais;

package modularizacao;

import java.util.Scanner;

public class ExMod4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String nome = lerNome(scan);
        double nota1 = lerNota(scan, 1);
        double nota2 = lerNota(scan, 2);
        double nota3 = lerNota(scan, 3);
        double mediaFinal = calcularNotaFinal(nota1, nota2, nota3);
        String situacao = classificarAluno(mediaFinal);
        exibirRelatorio(nome, mediaFinal, situacao);

        scan.close();
    }

    public static String lerNome(Scanner nome) {
        System.out.println("Digite o seu nome: ");
        return nome.nextLine();
    }

    public static double lerNota(Scanner nota, int numero) {
        System.out.printf("Digite a nota da %d° avaliação: \n", numero);
        return nota.nextDouble();
    }

    public static double calcularNotaFinal(double nota1, double nota2, double nota3) {
        return (nota1 + nota2 + nota3) / 3;
    }

    public static String classificarAluno(double mediaFinal) {
        String situacao;
        if (mediaFinal < 4 ) {
            situacao = "Reprovado";
        } else if (mediaFinal < 7) {
            situacao = "Recuperação";
        } else {
            situacao = "Aprovado";
        }
        return situacao;
    }

    public static void exibirRelatorio(String nome, double mediaFinal, String situacao) {
        System.out.printf("""
                =========================================
                Calculadora de Média e Situação de Alunos
                =========================================
                Nome: %s
                Média Final: %.2f
                Situação: %s
                =========================================
                """, nome, mediaFinal, situacao);
    }
}
