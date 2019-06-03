package lista04_Ex01;
import java.util.Scanner;

//Classe BuscaMaiorMenorTeste

public class Lista04_LPOO {

    public static void main(String[] args) {
        
      Scanner scanner = new Scanner(System.in);
        
        //Capturar o que o usuário vai diitar
        System.out.println("Digite o priemiro Número: ");
        int n1 = scanner.nextInt();

        System.out.println("Digite o segundo Número: ");
        int n2 = scanner.nextInt();

        System.out.println("Digite o terceiro Número: ");
        int n3 = scanner.nextInt();

        System.out.println("Digite o quarto Número: ");
        int n4 = scanner.nextInt();

        System.out.println("Digite o quinto Número: ");
        int n5 = scanner.nextInt();

        BuscaMaiorMenor buscaMaiorMenor = new BuscaMaiorMenor(n1, n2, n3, n4, n5);
        
        BuscaMaiorMenor buscaMaiorMenor1 = new BuscaMaiorMenor();
        buscaMaiorMenor1.setN1(n1);
        buscaMaiorMenor1.setN2(n2);
        buscaMaiorMenor1.setN3(n3);
        buscaMaiorMenor1.setN4(n4);
        buscaMaiorMenor1.setN5(n5);

        //Imprimir Número maior e menor
        System.out.println("Maior: " + buscaMaiorMenor.getMaior());
        System.out.println("Menor: " + buscaMaiorMenor1.getMenor());

    }
}  
    
