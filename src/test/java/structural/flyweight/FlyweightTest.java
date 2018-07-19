package structural.flyweight;

import static org.junit.Assert.*;
import org.junit.Test;

public class FlyweightTest {

    @Test
    public void flyweightTest(){
        Catalog catalog = new Catalog();

        Order order = new Order(123, catalog.getOrCreateItem("potato"));
        Order order2 = new Order(124, catalog.getOrCreateItem("rice"));
        Order order3 = new Order(125, catalog.getOrCreateItem("rice"));
        Order order4 = new Order(126, catalog.getOrCreateItem("rice"));
        Order order5 = new Order(127, catalog.getOrCreateItem("rice"));

        System.out.print(catalog.totalItemsMade());
    }
}