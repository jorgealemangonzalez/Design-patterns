package structural.composite;

import java.util.ArrayList;
import java.util.List;

public abstract class MenuComponent {

    protected String name;
    protected String url;
    List<MenuComponent> components;

    public MenuComponent(String name, String url) {
        this.name = name;
        this.url = url;

        components = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public String getUrl() {
        return url;
    }

    public abstract String toString();

    String print() {
        StringBuilder builder = new StringBuilder(name);
        builder.append(": ");
        builder.append(url);
        builder.append("\n");
        return builder.toString();
    }

    ;
}
