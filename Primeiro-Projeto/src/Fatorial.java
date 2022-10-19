import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Informa o valor fatorial desejado:");
        int fatorial = scan.nextInt();

        int result = 1;

        for (int i = fatorial; i >= 1; i--) {
            
            result *= i;
            
        }
        System.out.println("Resultado de " + fatorial + "! : " + result);
    }
}
