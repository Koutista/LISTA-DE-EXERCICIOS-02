import java.util.Scanner;

public class exercicio9 {

    public static void main(String[] args) {

        /*Ler o salário de um funcionário e o tempo de casa em anos.
Definir o bônus: menos de 1 ano não recebe, de 1 a 3 anos
recebe 5 por cento, acima de 3 e até 10 anos recebe 10 por
cento, acima de 10 anos recebe 15 por cento. Imprimir o
percentual e o valor do bônus.*/

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o salário do funcionário: ");
        double salario = sc.nextDouble();

        System.out.print("Digite o tempo de casa (anos): ");
        double tempoCasa = sc.nextDouble();

        double percentual;

        if (tempoCasa < 1) {
            percentual = 0;
        } else if (tempoCasa <= 3) {
            percentual = 5;
        } else if (tempoCasa <= 10) {
            percentual = 10;
        } else {
            percentual = 15;
        }

        double valorBonus = salario * (percentual / 100);

        System.out.printf("Percentual de bônus: %.2f%%%n", percentual);
        System.out.printf("Valor do bônus: R$ %.2f%n", valorBonus);

        sc.close();
    }
}