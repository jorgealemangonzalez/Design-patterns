package structural.bridge;

public class CircleShape extends Shape {

    public CircleShape(Color color) {
        super(color);
    }

    @Override
    public void applyColor() {
        System.out.print("Fill the circle... ");
        color.applyColor();
    }
}
