package creational.builder;

public class LaunchOrder {

    private final String bread;
    private final String condiments;
    private final String dressgin;
    private final String meat;

    public static class Builder {
        private String bread;
        private String condiments;
        private String dressign;
        private String meat;

        public Builder() {
        }

        public Builder bread(String bread) {
            this.bread = bread;
            return this;
        }

        public Builder condiments(String condiments) {
            this.condiments = condiments;
            return this;
        }

        public Builder dressign(String dressgin) {
            this.dressign = dressgin;
            return this;
        }

        public Builder meat(String meat) {
            this.meat = meat;
            return this;
        }

        public LaunchOrder build(){
            return new LaunchOrder(this);
        }
    }

    private LaunchOrder(Builder builder) {
        bread = builder.bread;
        condiments = builder.condiments;
        dressgin = builder.dressign;
        meat = builder.meat;
    }

    public String getBread() {
        return bread;
    }

    public String getCondiments() {
        return condiments;
    }

    public String getDressgin() {
        return dressgin;
    }

    public String getMeat() {
        return meat;
    }
}
