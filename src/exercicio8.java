import java.util.Scanner;

public class exercicio8 {

    public static void main(String[] args) {

    /*Ler a velocidade máxima da via e a velocidade do veículo.
Classificar a infração conforme o Código de Trânsito Brasileiro:
dentro do limite não há multa, até 20 por cento acima do limite
a infração é média, acima de 20 e até 50 por cento é grave,
acima de 50 por cento é gravíssima.*/

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a velocidade máxima da via: ");
        double limite = sc.nextDouble();

        System.out.print("Digite a velocidade do veículo: ");
        double velocidade = sc.nextDouble();

        if (velocidade <= limite) {
            System.out.println("Não há multa.");
        } else {
            double percentualAcima = ((velocidade - limite) / limite) * 100;

            if (percentualAcima <= 20) {
                System.out.println("Infração média.");
            } else if (percentualAcima <= 50) {
                System.out.println("Infração grave.");
            } else {
                System.out.println("Infração gravíssima.");
            }
        }

        sc.close();
    }
}
