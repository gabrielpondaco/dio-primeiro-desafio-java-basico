import java.util.Scanner;
import java.util.Locale;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        /*TODO: Conhecer e Importar a classe Scanner
        Exibir as mensagens para o usuário
        Obter os valores digitados no terminal
        Exibit a mensagem conta criada

        Atributo 	Tipo 	Exemplo
        Numero 	Inteiro 	1021    -> Int
        Agencia 	Texto 	067-8   -> String
        Nome Cliente 	Texto 	MARIO ANDRADE -> String
        Saldo 	Decimal 	237.48  -> Double
        */
        int numeroConta;
        double saldo;
        String agencia;
        String nomeCliente;

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Boas vindas à criação de contas do banco X");

        System.out.println("Por favor, digite seu nome: ");
        nomeCliente = scanner.nextLine();

        System.out.println("Agora " + nomeCliente + ", digite o número da Agencia");
        agencia = scanner.next();

        System.out.println("O número da Conta: ");
        numeroConta = scanner.nextInt();

        System.out.println("Por fim, o seu saldo: ");
        saldo = scanner.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numeroConta + " e seu saldo de $" + saldo + " já está disponível para saque");
        
        scanner.close();
    }
}
