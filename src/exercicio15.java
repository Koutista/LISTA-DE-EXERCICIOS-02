import java.util.Scanner;

public class exercicio15 {
    public static void main(String[] args) {

        /*Terminal de estacionamento. Ler o tipo de veículo, onde 1
é carro e 2 é moto, e definir a tarifa por hora com switch: carro
custa 8,00 e moto custa 5,00. Tipo diferente imprime opção
inválida e o programa não realiza as etapas seguintes. Ler a
quantidade de horas e calcular o valor. Ler se o cliente tem
cupom, respondendo sim ou nao: havendo cupom, verificar se
o valor é de 50,00 ou mais; nesse caso aplicar 20 por cento de
desconto, caso contrário informar que o cupom vale apenas
acima de 50,00. Em ifs independentes, imprimir aviso de
permanência longa quando passar de 12 horas e aviso de
cobrança de diária quando passar de 24 horas. Classificar a
permanência com else if: até 2 horas curta, até 6 horas média,
acima disso longa. Imprimir o valor final com duas casas.*/

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o tipo de veículo (1-Carro, 2-Moto): ");
        int tipo = sc.nextInt();

        double tarifaHora;

        switch (tipo) {
            case 1 -> tarifaHora = 8.00;
            case 2 -> tarifaHora = 5.00;
            default -> {
                System.out.println("Opção inválida.");
                sc.close();
                return; // encerra o programa, não realiza as etapas seguintes
            }
        }

        System.out.print("Digite a quantidade de horas: ");
        int horas = sc.nextInt();

        double valor = tarifaHora * horas;

        System.out.print("O cliente tem cupom de desconto? (sim/nao): ");
        String cupom = sc.next();

        if (cupom.equalsIgnoreCase("sim")) {
            if (valor >= 50.00) {
                valor = valor * 0.80; // aplica 20% de desconto
                System.out.println("Cupom aplicado: 20% de desconto.");
            } else {
                System.out.println("O cupom vale apenas para valores acima de R$ 50,00.");
            }
        }

        // Ifs independentes - avisos de permanência
        if (horas > 12) {
            System.out.println("Aviso: permanência longa.");
        }
        if (horas > 24) {
            System.out.println("Aviso: será cobrada diária.");
        }

        // Classificação da permanência (else if)
        if (horas <= 2) {
            System.out.println("Permanência: curta.");
        } else if (horas <= 6) {
            System.out.println("Permanência: média.");
        } else {
            System.out.println("Permanência: longa.");
        }

        System.out.printf("Valor final: R$ %.2f%n", valor);

        sc.close();
    }
}