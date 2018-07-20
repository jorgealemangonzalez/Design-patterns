package creational.singleton;

import static org.junit.Assert.*;
import org.junit.Test;

public class singletonTest {
    @Test
    public void singletonTest(){
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();

        assertEquals(s1.toString(),s2.toString());

        LazySingleton sl1 = LazySingleton.getInstance();
        LazySingleton sl2 = LazySingleton.getInstance();

        assertEquals(sl1.toString(),sl2.toString());

        ThreadSafeSingleton st1 = ThreadSafeSingleton.getInstance();
        ThreadSafeSingleton st2 = ThreadSafeSingleton.getInstance();

        assertEquals(st1.toString(),st2.toString());
    }
}