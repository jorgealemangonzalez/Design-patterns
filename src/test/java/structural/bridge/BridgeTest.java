package structural.bridge;

import static org.junit.Assert.*;
import org.junit.Test;

public class BridgeTest {

    @Test
    public void bridgeTest(){
        Color blue = new BlueColor();
        Color red = new RedColor();

        SquareShape squareBlue = new SquareShape(blue);
        SquareShape squareRed = new SquareShape(red);

        CircleShape circleBlue = new CircleShape(blue);
        CircleShape circleRed = new CircleShape(red);

        squareBlue.applyColor();
        squareRed.applyColor();

        circleBlue.applyColor();
        circleRed.applyColor();
    }

}