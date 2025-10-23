// Exercício de cálculo de IMC e classificação;
// Modularização avançada com funções e procedimentos, passagem de Scanner por parâmetro, text blocks para saída formatada, encadeamento if/else if;

package modularizacao;

import java.util.Scanner;

public class ExMod2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double peso = lerPeso(scan);
        double altura = lerAltura(scan);
        double imc = calcularIMC(peso, altura);
        String classificacao = classificarIMC(imc);
        exibirResultado(imc, classificacao);

        scan.close();
    }

    public static double lerPeso(Scanner scan) {
        System.out.println("Digite o seu peso: ");
        double peso = scan.nextDouble();
        return peso;
    }

    public static double lerAltura(Scanner scan) {
        System.out.println("Digite a sua altura: ");
        double altura = scan.nextDouble();
        return altura;
    }

    public static double calcularIMC(double peso, double altura) {
        return peso / (altura * altura);
    }

    public static String classificarIMC(double imc) {
        String mensagem = "Valor de IMC inválido.";

        if (imc < 18.5) {
            mensagem = "Abaixo do peso";
        } else if (imc >= 18.5 && imc <= 24.9) {
            mensagem = "Peso normal";
        } else if (imc >= 25 && imc <= 29.9) {
            mensagem = "Sobrepeso";
        } else if (imc >= 30 && imc <= 34.9) {
            mensagem = "Obesidade grau I";
        } else if (imc >= 35 && imc <= 39.9) {
            mensagem = "Obesidade grau II";
        } else {
            mensagem = "Obesidade grau III";
        }

        return mensagem;
    }

    public static void exibirResultado(double imc, String classificacao) {
        String mensagem = """
                ============================
                Resultado do Cálculo de IMC
                ============================
                IMC: %.2f
                Classificação: %s
                ============================ """.formatted(imc, classificacao);
        System.out.println(mensagem);
    }
}
