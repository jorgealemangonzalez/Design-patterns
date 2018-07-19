package structural.proxy;

import static org.junit.Assert.*;
import org.junit.Test;

public class ProxyTest {

    @Test
    public void proxyTest(){
        HackMeInterface secure = (HackMeInterface) SecurityProxy.newInstance(new TryToHackMe());

        secure.sendData("hello");
        secure.sendData("hack");

        TryToHackMe notSecure = new TryToHackMe();
        notSecure.sendData("hack");
    }

}