import java.util.Scanner;

public class exercicio14 {

    public static void main(String[] args) {

        /*Ler o número de um mês de 1 a 12 e imprimir a quantidade
de dias desse mês. Agrupar os meses de mesma duração em
um único case, separando os valores por vírgula. Considerar
fevereiro com 28 dias. Valores fora da faixa de 1 a 12 devem
ser tratados no default.*/

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o número do mês (1 a 12): ");
        int mes = sc.nextInt();

        switch (mes) {
            case 1, 3, 5, 7, 8, 10, 12 -> System.out.println("O mês tem 31 dias.");
            case 4, 6, 9, 11 -> System.out.println("O mês tem 30 dias.");
            case 2 -> System.out.println("O mês tem 28 dias.");
            default -> System.out.println("Mês inválido.");
        }

        sc.close();
    }
}
