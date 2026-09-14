import java.util.Scanner;

public class exercicio10 {

    public static void main(String[] args) {

        /*Ler o nome de usuário e a senha. Se o usuário for diferente
de admin, imprimir que o usuário não foi encontrado e não
verificar a senha. Se o usuário existir, verificar a senha: se for
java123, o acesso é liberado; caso contrário, a senha está
incorreta. São três saídas diferentes.*/

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o usuário: ");
        String usuario = sc.next();

        if (!usuario.equals("admin")) {
            System.out.println("Usuário não encontrado.");
        } else {
            System.out.print("Digite a senha: ");
            String senha = sc.next();

            if (senha.equals("java123")) {
                System.out.println("Acesso liberado.");
            } else {
                System.out.println("Senha incorreta.");
            }
        }

        sc.close();
    }
}