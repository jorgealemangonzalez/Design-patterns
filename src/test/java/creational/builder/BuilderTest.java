package creational.builder;

import static org.junit.Assert.*;
import org.junit.Test;

public class BuilderTest {

    @Test
    public void builderTest(){
        LaunchOrder.Builder builder = new LaunchOrder.Builder();
        builder.bread("regular");
        builder.condiments("salad");
        builder.dressign("mustard");
        builder.meat("turkey");

        LaunchOrder launchOrder = builder.build();

        assertEquals(launchOrder.getBread(), "regular");
        assertEquals(launchOrder.getCondiments(), "salad");
        assertEquals(launchOrder.getDressgin(), "mustard");
        assertEquals(launchOrder.getMeat(), "turkey");
    }
}