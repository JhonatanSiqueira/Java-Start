public class SmartTv {
    boolean on = false;
    int channel= 1;
    int volume = 25;
    
    
    /* MUDAR/SELECIONAR O CANAL DA SMART TV */
    public void selectChannel(int newChannel){
        channel = newChannel;
    
        System.out.println("Canal selecionado: " + channel);
    }
    
    public void channelDown(){
        channel++; 
    
        System.out.println("Canal Atual: " + channel);
    }
    
    public void channelUp(){
        channel--;
    
        System.out.println("Canal Atual: " + channel);
    }

    /* LIGAR/DESLIGAR A SMART TV*/
    public void turnOn(){
        on = true;

        System.out.println("Tv ligada!");
    }

    public void turnOff(){
        on = false;

        System.out.println("Tv desligada!");
    }

    /* AUMENTAR/DIMINUIR VOLUME DA SMART TV */
    public void volumeUp(){
        volume++;

        System.out.println("Volume Atual: " + volume);
    }

    public void volumeDown(){
        volume++;

        System.out.println("Volume Atual: " + volume);
    }
}
