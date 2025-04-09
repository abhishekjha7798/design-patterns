package org.abhishekjha.creational.builder;

public class Sandwich {
    public static class Builder {
        private String bread;
        private String meat;
        private String dressing;
        private String condiments;

        public Sandwich build() {
            return new Sandwich(this);
        }

        public Builder withBread(String bread) {
            this.bread = bread;
            return this;
        }
        public Builder withMeat(String meat) {
            this.meat = meat;
            return this;
        }
        public Builder withDressing(String dressing) {
            this.dressing = dressing;
            return this;
        }
        public Builder withCondiments(String condiments) {
            this.condiments = condiments;
            return this;
        }
    }
    private final String bread;
    private final String meat;
    private final String dressing;
    private final String condiments;

    public Sandwich(Builder builder) {
        this.bread = builder.bread;
        this.meat = builder.meat;
        this.dressing = builder.dressing;
        this.condiments = builder.condiments;
    }

    public String getBread() {
        return bread;
    }

    public String getMeat() {
        return meat;
    }

    public String getDressing() {
        return dressing;
    }

    public String getCondiments() {
        return condiments;
    }
}
