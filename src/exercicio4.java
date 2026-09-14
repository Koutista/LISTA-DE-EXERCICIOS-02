import java.util.Scanner;

public class exercicio4 {

    public static void main(String[] args) {

        /*Ler dois números inteiros e informar se o primeiro é múltiplo
do segundo. Antes de calcular, verificar se o segundo número é
zero e, nesse caso, informar que a verificação não pode ser
feita.*/

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int a = sc.nextInt();

        System.out.print("Digite o segundo número: ");
        int b = sc.nextInt();

        if (b == 0) {
            System.out.println("A verificação não pode ser feita (segundo número é zero).");
        } else {
            if (a % b == 0) {
                System.out.println(a + " é múltiplo de " + b + ".");
            } else {
                System.out.println(a + " não é múltiplo de " + b + ".");
            }
        }

        sc.close();
    }
}