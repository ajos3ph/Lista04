package Lista04_Ex05;
import java.util.Scanner;

public class Lista04_Ex05 {
 
    public void CalculaLimite(){
        
        Scanner input = new Scanner(System.in);
    
        int numeroConta; 
        int saldoMes; 
        int totalItens; 
        int totalCredito; 
        int limiteCredito; 
        int saldoAtual;

        System.out.println("Entre com o número da conta do cliente: ");
        numeroConta = input.nextInt(); 
		
        System.out.println("\nInforme o saldo atual do cliente: ");
        saldoMes = input.nextInt(); 

        System.out.println("\nInforme o valor total das compras realizadas: ");
        totalItens = input.nextInt();


        System.out.println("\nInforme o crédito do cliente: ");
        totalCredito = input.nextInt(); 


        System.out.println("\nInforme o crédito total disponível para o cliente: ");
        limiteCredito = input.nextInt();
        
        saldoAtual = (saldoMes + totalItens) - totalCredito;
        
        if (saldoAtual <= limiteCredito){
           System.out.printf("Cliente conta: R$ %d\nPossui saldo de: R$ %d", numeroConta, saldoAtual); 
        }else{
            System.out.printf("Cliente conta: R$ %d\nPossui saldo de: R$ %d\n", numeroConta, saldoAtual);
            System.out.printf("\nLimite de crédito excedido");
        }
    }
}
