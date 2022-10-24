package EstruturasDeRepetição;
import java.util.Scanner;

public class ParEImpar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //Esse código simplesmente perguntas quantos números o usuário quer informar e, após feito, separa e imprime na tela os números PARES e ÍMPARES.

        int numero;
        int count= 0;

        int numerosPares = 0, numerosImpares = 0;

        int qtdDeNumeros;
        System.out.println("Diga quantos números quer informar:");
        qtdDeNumeros = scan.nextInt();
        
        do {
            System.out.println("Informe o número desejado:");
            numero = scan.nextInt();

            if (numero % 2 == 0) {
                numerosPares++;
            }else{
                numerosImpares++;
            }

            count++;

        } while (count < qtdDeNumeros);

        System.out.println("Numeros pares informados: " +numerosPares);
        System.out.println("Numeros ímpares informados: " +numerosImpares);
    }
}
