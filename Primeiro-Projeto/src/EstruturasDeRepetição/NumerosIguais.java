package EstruturasDeRepetição;
import java.util.Scanner;

public class NumerosIguais {
    public static void main(String[] args) {
        Scanner numero = new Scanner(System.in);

        int N = numero.nextInt();
        int soma;

        for (int i = N; i > 0; i--) {
            soma = somatorio(N);
            System.out.println(soma);
            break;
        }
    }

    static int somatorio(int numero) {
        if (numero == 0) {
            return 0;
        } else {
            return numero + somatorio(numero - 1);
        }
    }
}
