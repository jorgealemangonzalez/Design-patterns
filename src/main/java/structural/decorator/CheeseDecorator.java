package structural.decorator;

public class CheeseDecorator extends SandwitchDecorator {

    public CheeseDecorator(Sandwitch sandwitch) {
        super(sandwitch);
    }

    public String make(){
        return sandwitch.make() + addCheese();
    }

    private String addCheese() {
        return " + cheese";
    }

}
