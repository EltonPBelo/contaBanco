import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
        
    System.out.println("Olá seja bem vindo ao nosso banco AgiotasBR");
    
    System.out.print("Por favor digite o número da sua agência: ");//usuario deve digitar aqui o numero da sua agencia
    int numAgencia = input.nextInt();

    System.out.print("Agora digite o número da sua conta ");//usuario deve digitar aqui o numero da sua conta
    String conta = input.next();

    System.out.print("Digite seu nome: ");// //usuario deve digitar aqui o seu nome
    String nome = input.next();

    Double saldo = 237.10;// saldo do usuario

    System.out.print("Olá "+ nome +" obrigado por criar uma conta em nosso banco, sua agência é "+ numAgencia + " numero da conta é "+ conta + " e seu saldo " + saldo + " já está disponível para saque");

    input.close();

    }
    
}
