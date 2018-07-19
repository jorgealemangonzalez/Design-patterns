package structural.composite;

import static org.junit.Assert.*;
import org.junit.Test;

public class CompositeTest {

    @Test
    public void compositeTest(){
        Menu mainMenu = new Menu("Main", "/main");
        MenuItem brush = new MenuItem("Brush", "/brush");

        Menu fruitMenu = new Menu("Fruit", "/fruit");
        MenuItem pineaple = new MenuItem("Pineaple", "/pineaple");
        MenuItem apple = new MenuItem("Apple", "/apple");

        mainMenu.add(brush)
                .add(fruitMenu);
        fruitMenu.add(apple)
                 .add(pineaple);

        System.out.print(mainMenu.toString());

    }
}