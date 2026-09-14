import java.util.Scanner;

public class exercicio2 {

    public static void main(String[] args) {

        /* Ler um número inteiro e imprimir uma linha para cada
característica verdadeira: é positivo, é par, é múltiplo de 5, tem
dois dígitos. Para a contagem de dígitos, considere o módulo do
número, obtido com Math.abs(numero). Se nenhuma
característica for verdadeira, nada é impresso. */

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = sc.nextInt();

        if (numero > 0) {
            System.out.println("É positivo.");
        }
        if (numero % 2 == 0) {
            System.out.println("É par.");
        }
        if (numero % 5 == 0) {
            System.out.println("É múltiplo de 5.");
        }
        if (Math.abs(numero) >= 10 && Math.abs(numero) <= 99) {
            System.out.println("Tem dois dígitos.");
        }

        sc.close();
    }
}
