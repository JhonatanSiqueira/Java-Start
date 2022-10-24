package EstruturasDeRepetição;
import java.util.Scanner;

public class NotaInvalida {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int nota; 

        System.out.println("Informe a nota do teste:");
        nota = scan.nextInt();
        
        while (nota < 0 || nota > 10) {
            System.out.println("Nota invalida! Insira novamente;");
            nota = scan.nextInt();
        }

        System.out.println("Você tirou " + nota +" no teste!");
    }
}
