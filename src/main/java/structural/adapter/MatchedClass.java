package structural.adapter;

public class MatchedClass implements IntefaceToMatch {
    private Integer id;
    private String name;

    public MatchedClass(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public Integer getId() {
        return id;
    }

    @Override
    public String getName() {
        return name;
    }
}
