package vetores;

import java.util.Scanner;

public class ExVet3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double notasAlunos[] = new double[5];
        double somaAlunos = 0;
        int quantidadeAlunosAcimaMedia = 0;

        for (int i = 0; i < notasAlunos.length; i++) {
            System.out.printf("Digite a nota do aluno %d: \n", (i + 1));
            notasAlunos[i] = scan.nextDouble();
            somaAlunos += notasAlunos[i];
        }

        double mediaGeral = somaAlunos / notasAlunos.length;
        System.out.println("A média geral é igual a: " + mediaGeral);

        for (int i = 0; i < notasAlunos.length; i++) {
            if (notasAlunos[i] > mediaGeral) {
                quantidadeAlunosAcimaMedia++;
            }
        }

        System.out.printf("No total %d alunos ficaram acima da média. \n", quantidadeAlunosAcimaMedia);
        System.out.println("As notas foram: ");

        for (int i = 0; i < notasAlunos.length; i++) {
            if (notasAlunos[i] > mediaGeral) {
                System.out.println(notasAlunos[i]);
            }
        }

        scan.close();
    }
}
