import java.util.Scanner;

public class exercicio6 {

    public static void main(String[] args) {

        /*Ler o valor de uma compra. Compras de 199,00 ou mais têm
frete grátis; abaixo disso o frete é 24,90. Imprimir o valor do
frete e o total a pagar nos dois casos.*/

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor da compra: ");
        double valorCompra = sc.nextDouble();

        double frete;

        if (valorCompra >= 199.00) {
            frete = 0.0;
        } else {
            frete = 24.90;
        }

        double total = valorCompra + frete;

        System.out.printf("Valor do frete: R$ %.2f%n", frete);
        System.out.printf("Total a pagar: R$ %.2f%n", total);

        sc.close();
    }
}