import java.util.Scanner;

public class exercicio13 {

    public static void main(String[] args) {

        /*Ler dois números do tipo double e uma opção de 1 a 4,
onde 1 é soma, 2 é subtração, 3 é multiplicação e 4 é divisão.
Usar switch para executar a operação escolhida e imprimir o
resultado. Qualquer outra opção cai no default como opção
inválida. Na divisão, verificar antes se o divisor é zero.*/

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double num1 = sc.nextDouble();

        System.out.print("Digite o segundo número: ");
        double num2 = sc.nextDouble();

        System.out.print("Escolha a operação (1-Soma, 2-Subtração, 3-Multiplicação, 4-Divisão): ");
        int opcao = sc.nextInt();

        switch (opcao) {
            case 1 -> System.out.printf("Resultado: %.2f%n", num1 + num2);
            case 2 -> System.out.printf("Resultado: %.2f%n", num1 - num2);
            case 3 -> System.out.printf("Resultado: %.2f%n", num1 * num2);
            case 4 -> {
                if (num2 == 0) {
                    System.out.println("Não é possível dividir por zero.");
                } else {
                    System.out.printf("Resultado: %.2f%n", num1 / num2);
                }
            }
            default -> System.out.println("Opção inválida.");
        }

        sc.close();
    }
}
