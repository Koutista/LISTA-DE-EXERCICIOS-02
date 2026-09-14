import java.util.Scanner;

public class exercicio1 {

    public static void main(String[] args) {

        /*Ler a idade de uma pessoa e imprimir todas as classificações
que se aplicam a ela: 16 anos ou mais pode votar, 18 anos ou
mais pode dirigir, 60 anos ou mais é idoso. Uma pessoa de 65
anos deve receber as três mensagens.*/

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a idade da pessoa: ");
        int idade = sc.nextInt();

        if (idade >= 16) {
            System.out.println("Pode votar.");
        }
        if (idade >= 18) {
            System.out.println("Pode dirigir.");
        }
        if (idade >= 60) {
            System.out.println("É idoso.");
        }

        sc.close();
    }
}