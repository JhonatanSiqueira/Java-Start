import java.util.Scanner;

public class Tabuada {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe a tabuada desejada: (De 0 à 10)");
        int tabuadaDo = scan.nextInt();

        System.out.println("Tabuada do " + tabuadaDo + ":");

        for (int i = 1; i < 11; i++) {
            int result = tabuadaDo * i;

            
            System.out.println(tabuadaDo+ " X " + i + " = " + result);
        }
    }
}
