import java.util.Scanner;

public class exercicio7 {

    public static void main(String[] args) {

        /*Ler a hora do dia como um inteiro de 0 a 23 e imprimir a
saudação correspondente: de 0 a 11 bom dia, de 12 a 17 boa
tarde, de 18 a 23 boa noite. Horas fora dessa faixa são
inválidas.*/

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a hora do dia (0 a 23): ");
        int hora = sc.nextInt();

        if (hora < 0 || hora > 23) {
            System.out.println("Hora inválida.");
        } else if (hora <= 11) {
            System.out.println("Bom dia!");
        } else if (hora <= 17) {
            System.out.println("Boa tarde!");
        } else {
            System.out.println("Boa noite!");
        }

        sc.close();
    }
}
