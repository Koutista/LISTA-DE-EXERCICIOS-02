import java.util.Scanner;

public class exercicio5 {

    public static void main(String[] args) {

    /*Ler um ano e informar se ele é bissexto. Um ano é bissexto
quando é divisível por 4 e não é divisível por 100, ou quando é
divisível por 400.*/

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um ano: ");
        int ano = sc.nextInt();

        if ((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)) {
            System.out.println(ano + " é bissexto.");
        } else {
            System.out.println(ano + " não é bissexto.");
        }

        sc.close();
    }
}
