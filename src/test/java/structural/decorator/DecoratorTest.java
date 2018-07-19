package structural.decorator;

import static org.junit.Assert.*;
import org.junit.Test;

public class DecoratorTest {

    @Test
    public void decoratorTest(){
        Sandwitch sandwitch = new CheeseDecorator(new MeatDecorator(new SimpleSandwitch()));

        System.out.print(sandwitch.make());
    }

}