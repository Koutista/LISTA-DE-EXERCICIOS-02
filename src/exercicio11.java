import java.util.Scanner;

public class exercicio11 {

    public static void main(String[] args) {

        /*er a frequência em porcentagem e a média final de um
aluno. Se a frequência for menor que 75 por cento, o aluno está
reprovado por falta e a média não deve ser avaliada. Se a
frequência for suficiente, avaliar a média: média >= 7 aprovado,
média >= 5 e média < 7 recuperação, média < 5 reprovado por
nota.*/

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a frequência do aluno (%): ");
        double frequencia = sc.nextDouble();

        if (frequencia < 75) {
            System.out.println("Reprovado por falta.");
        } else {
            System.out.print("Digite a média final do aluno: ");
            double media = sc.nextDouble();

            System.out.printf("Média: %.2f%n", media);

            if (media >= 7) {
                System.out.println("Aprovado.");
            } else if (media >= 5) {
                System.out.println("Recuperação.");
            } else {
                System.out.println("Reprovado por nota.");
            }
        }

        sc.close();
    }
}