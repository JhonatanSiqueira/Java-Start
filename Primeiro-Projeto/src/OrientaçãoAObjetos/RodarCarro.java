package OrientaçãoAObjetos;

public class RodarCarro {
    public static void main(String[] args) {
        
        Carro carro1 = new Carro();

        carro1.setCor("Presto fosco");
        carro1.setModelo("Jaguar F-type");
        carro1.setCapacidadeTanque(60);

        System.out.println(carro1.getModelo());
        System.out.println(carro1.getCor());
        System.out.println(carro1.getCapacidadeTanque());
        System.out.println(carro1.encherTanque(5.25));


        Carro carro2 = new Carro("azul", "Jaguar F-pace", 66);
   
        System.out.println(carro2.getModelo());
        System.out.println(carro2.getCor());
        System.out.println(carro2.getCapacidadeTanque());
        System.out.println(carro2.encherTanque(5.25));
    }
}
