import java.util.Scanner;

public class exercicio12 {

    public static void main(String[] args) {

        /*Ler o saldo da conta, o limite diário de saque e o valor
solicitado. Se o saldo for menor que o valor, informar saldo
insuficiente e não realizar as verificações seguintes. Havendo
saldo, verificar o limite: se o valor ultrapassar o limite diário,
informar isso; caso contrário, efetuar o saque e imprimir o novo
saldo.*/

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o saldo da conta: ");
        double saldo = sc.nextDouble();

        System.out.print("Digite o limite diário de saque: ");
        double limiteDiario = sc.nextDouble();

        System.out.print("Digite o valor a ser sacado: ");
        double valor = sc.nextDouble();

        if (saldo < valor) {
            System.out.println("Saldo insuficiente.");
        } else {
            if (valor > limiteDiario) {
                System.out.println("O valor solicitado ultrapassa o limite diário de saque.");
            } else {
                saldo = saldo - valor;
                System.out.println("Saque efetuado com sucesso.");
                System.out.printf("Novo saldo: R$ %.2f%n", saldo);
            }
        }

        sc.close();
    }
}
