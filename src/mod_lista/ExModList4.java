package mod_lista;

import java.util.Scanner;

public class ExModList4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite a quantidade de alunos na turma: ");
        int quantAlunos = scan.nextInt();
        scan.nextLine();

        for (int i = 1; i <= quantAlunos; i++) {
            System.out.println("Digite o nome do " + i + "º aluno: ");
            String nomeAluno = scan.nextLine();
            double nota1 = receberNotaAluno(scan, 1);
            double nota2 = receberNotaAluno(scan, 2);
            double nota3 = receberNotaAluno(scan, 3);
            double nota4 = receberNotaAluno(scan, 4);
            double media = calcularNotaAluno(nota1, nota2, nota3, nota4);
            exibirResultadoAluno(nomeAluno, media);
        }

        scan.close();
    }

    public static double receberNotaAluno(Scanner scan, int num) {
        System.out.println("Digite a " + num + "ª nota do aluno: ");
        double nota = scan.nextDouble();
        scan.nextLine();
        return nota;
    }

    public static double calcularNotaAluno(double n1, double n2, double n3, double n4) {
        return (n1 + n2 + n3 + n4) / 4;
    }

    public static void exibirResultadoAluno(String nomeAluno, double media) {
        if (media >= 7) {
            System.out.println("Parabéns, " + nomeAluno + ", você foi aprovado. ");
        } else if (media < 4) {
            System.out.println(nomeAluno + ", infelizmente você não atingiu a média mínima. ");
        } else {
            System.out.println(nomeAluno + ", apresente-se para a prova final. ");
        }
    }
}
