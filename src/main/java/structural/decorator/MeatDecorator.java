package structural.decorator;

public class MeatDecorator extends SandwitchDecorator {

    public MeatDecorator(Sandwitch sandwitch) {
        super(sandwitch);
    }

    public String make(){
        return sandwitch.make() + addMeat();
    }

    private String addMeat() {
        return " + meat";
    }
}
