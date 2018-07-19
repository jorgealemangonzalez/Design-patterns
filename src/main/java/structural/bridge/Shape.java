package structural.bridge;

public abstract class Shape {
    protected Color color;

    public Shape(Color color) { //Coupling !!
        this.color = color;
    }

    abstract public void applyColor();
}
