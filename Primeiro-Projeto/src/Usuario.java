public class Usuario {
    public static void main(String[] args) {
        SmartTv smartTv = new SmartTv();
        
        System.out.println("TV Ligada ? " + smartTv.on);
        System.out.println("Canal Atual : " + smartTv.channel);
        System.out.println("Volume Atual ? " + smartTv.volume);
    
        System.out.println("-----------------");

        /* COMANDOS DO USUÁRIO */
        smartTv.turnOn();

        smartTv.volumeUp();

        smartTv.channelDown();
        smartTv.selectChannel(7);
    
    }
}
