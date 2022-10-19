package Métodos;

/**
 * Mensagem
 */
public class Mensagem {

    public static void saudacao(int hora) {
        if( hora >= 0 && hora <= 12){
            System.out.println("BOM DIA!!!");
        }else if(hora > 12 && hora <= 18){
            System.out.println("BOA TARDE!!!");
        }else{
            System.out.println("BOA NOITE!!!");
        }
    }

}