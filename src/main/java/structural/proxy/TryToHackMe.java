package structural.proxy;

public class TryToHackMe implements HackMeInterface{

    public void sendData( String data ){
        if(data.equals("hack")){
            System.out.println("YOU HACKED ME");
            return;
        }
        System.out.println("DATA WAS SENT: "+ data);
    }
}
