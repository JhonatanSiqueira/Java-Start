package Métodos;

public class AreaQuadrilateroReturn {
    
    public static double area(double lado) {
        double area = lado * lado;

        return area;
    }
    
    public static double area(double baseMa, double baseMe, double altura) {
        double area = ((baseMa + baseMe) * altura)/2;

        return area;
    }
    
    public static double area(double base, double altura) {
        double area = base * altura;

        return area;
    }
}
