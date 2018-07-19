package structural.decorator;

public abstract class SandwitchDecorator implements Sandwitch {
    protected Sandwitch sandwitch;


    public SandwitchDecorator(Sandwitch sandwitch) {
        this.sandwitch = sandwitch;
    }

    public String make() {
        return sandwitch.make();
    }
}
