import java.util.Scanner;

public class exercicio3 {

    public static void main(String[] args) {

        /*Ler a temperatura em graus Celsius e a umidade relativa do
ar em porcentagem. Imprimir os alertas que se aplicam:
temperatura de 38 graus ou mais gera alerta de calor extremo,
umidade abaixo de 30 por cento gera alerta de umidade baixa,
temperatura de 35 graus ou mais com umidade abaixo de 20
por cento gera alerta de risco de queimada.*/

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a temperatura em graus Celsius: ");
        double temperatura = sc.nextDouble();

        System.out.print("Digite a umidade relativa do ar (%): ");
        double umidade = sc.nextDouble();

        if (temperatura >= 38) {
            System.out.println("Alerta de calor extremo.");
        }
        if (umidade < 30) {
            System.out.println("Alerta de umidade baixa.");
        }
        if (temperatura >= 35 && umidade < 20) {
            System.out.println("Alerta de risco de queimada.");
        }

        sc.close();
    }
}
