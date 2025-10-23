// Exercício de conversão entre Celsius e Fahrenheit;
// Uso de funções que retornam valores, switch-case, Scanner para entrada de dados e cálculo simples;

package modularizacao;

import java.util.Scanner;

public class ExMod1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String message = """
            Qual operação deseja realizar?
            1 - Celsius -> Fahrenheit;
            2 - Fahrenheit -> Celsius;""";
        System.out.println(message);
        byte operation = scan.nextByte();

        System.out.println("Digite o valor para a conversão: ");
        double conversion = scan.nextDouble();
        switch (operation) {
            case 1:
                double fahrenheit = celsiusToFahrenheit(conversion);
                System.out.println("O resultado é: " + fahrenheit + "°F ");
                break;
            case 2:
                double celsius = fahrenheitToCelsius(conversion);
                System.out.println("O resultado é: " + celsius + "°C ");
                break;
            default:
                System.out.println("Operação não conhecida. ");
        }

        scan.close();
    }

    public static double celsiusToFahrenheit(double celsius) {
        double result = (celsius * 1.8) + 32;
        return result;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        double result = (fahrenheit - 32) * (5.0 / 9.0);
        return result;
    }

}
