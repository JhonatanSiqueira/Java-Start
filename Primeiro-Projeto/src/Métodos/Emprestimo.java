package Métodos;

public class Emprestimo {
    
    public static double taxaTresVezes() {
        return 0.30;
    }

    
    public static double taxaDuasVezes() {
        return 0.45;
    }

    public static void calculaTaxaCompra( double valor, int parcelas) {
        if (parcelas == 2) {
            double valorFinal = valor + (valor * taxaDuasVezes());

            System.out.println("Valor total da compra parcelada em 2x: R$" + valorFinal);

        }else if(parcelas == 3){
            double valorFinal = valor + (valor * taxaTresVezes());

            System.out.println("Valor total da compra parcelada em 3x: R$" + valorFinal);

        }else{
            double valorFinal = valor;

            System.out.println("Valor total da compra à vista: " + valorFinal);
        }
    }
    
}
