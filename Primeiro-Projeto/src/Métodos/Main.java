package Métodos;

public class Main {

    public static void main(String[] args) {
        

        Calculadora.soma(1,3);
        Calculadora.divisao(1,3);
        Calculadora.subtracao(1,3);
        Calculadora.multiplicacao(1,3);



        System.out.println("\n \n");
        Mensagem.saudacao(21);
        Mensagem.saudacao(11);



        System.out.println("\n \n");
        Emprestimo.calculaTaxaCompra(1000, 3);
        Emprestimo.calculaTaxaCompra(36.70, 2);



        System.out.println("\n \n");
        AreaQuadrilatero.area(4);
        AreaQuadrilatero.area(4, 5.3, 7);
        AreaQuadrilatero.area(4, 9.4);



        System.out.println("\n \n");
        double retangulo = AreaQuadrilateroReturn.area(2, 6);
        System.out.println("Área do retângulo: " + retangulo);

        double quadrado = AreaQuadrilateroReturn.area(4);
        System.out.println("Área do quadrado: " + quadrado);

        double trapezio = AreaQuadrilateroReturn.area(4, 5.3, 7);
        System.out.println("Área do trapézio: " + trapezio);
    }
    
    
}
