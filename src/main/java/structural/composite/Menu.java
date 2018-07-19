package structural.composite;

public class Menu extends MenuComponent {


    public Menu(String name, String url) {
        super(name, url);
    }

    public Menu add(MenuComponent component){
        components.add(component);
        return this;
    }

    public Menu remove(MenuComponent component){
        components.remove(component);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append(print());

        for(MenuComponent component : components){
            builder.append(component.toString());
        }

        return builder.toString();
    }
}
