package Métodos;

public class AreaQuadrilatero {
    
    public static void area(double lado) {
        double area = lado * lado;

        System.out.println("A área do quadrado com o lado informado é " + area);
    }
    
    public static void area(double baseMa, double baseMe, double altura) {
        double area = ((baseMa + baseMe) * altura)/2;

        System.out.println("A área do trapézio com as medidas informadas é " + area);
    }
    
    public static void area(double base, double altura) {
        double area = base * altura;

        System.out.println("A área do retângulo com as medidas informadas é " + area);
    }
}
