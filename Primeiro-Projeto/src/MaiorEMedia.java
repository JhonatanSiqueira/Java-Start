import java.util.Scanner;

/**
 * MaiorEMedia
 */
public class MaiorEMedia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int nota = 0;
        int count = 0;
        int maiorNota = 0;
        int soma = 0;

        do {
           System.out.println("Digite a nota:");
           nota = scan.nextInt();

            if (maiorNota < nota) maiorNota = nota;

           soma += nota; 
           
           count++;
            
        } while (count < 5);

        System.out.println("Maior nota: " + maiorNota);
        System.out.println("Média das notas: " + soma/5);
    }
}