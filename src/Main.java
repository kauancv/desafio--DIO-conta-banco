import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ContaBanco contaBanco = new ContaBanco();
        Scanner scan = new Scanner(System.in);

        System.out.println("Por Favor, Informe o Seu nome:");
         contaBanco.setNomeCliente(scan.nextLine());
        System.out.println("Por Favor,digite o número da Agência !");
         contaBanco.setAgencia(scan.nextLine());
         System.out.println("Por Favor,digite o numero da Conta !");
         contaBanco.setNumero(scan.nextInt());
        System.out.println("Por Favor,Informe o seu saldo:");
         contaBanco.setSaldo(scan.nextDouble());

        System.out.println(("Olá " +
                contaBanco.getNomeCliente() +
                ", obrigado por criar uma conta em nosso banco, " +
                "sua agência é " +
                contaBanco.getAgencia()+
                ", conta " +
                contaBanco.getNumero() +
                " e seu saldo " +
                contaBanco.getSaldo() +
                " já está disponível para saque."));






    }
}
