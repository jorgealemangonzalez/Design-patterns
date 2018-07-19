package structural.bridge;

public class SquareShape extends Shape {

    public SquareShape(Color color) {
        super(color);
    }

    @Override
    public void applyColor() {
        System.out.print("Fill the square... ");
        color.applyColor();
    }
}
