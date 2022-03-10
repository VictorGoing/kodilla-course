package com.kodilla.patterns2.builder.bigmac;

import com.kodilla.patterns2.builder.pizza.Pizza;

import java.util.ArrayList;
import java.util.List;

public final class Bigmac {

    private final int burgers;
    private final String sauce;
    private final String bun;
    private List<String> ingredients = new ArrayList<>();

    public static class BigmacBuilder {
        private int burgers;
        private String sauce;
        private String bun;
        private List<String> ingredients = new ArrayList<>();

        public BigmacBuilder burgers(int howMany){
            this.burgers = howMany;
            return this;
        }

        public BigmacBuilder sauce(String dressing){
            this.sauce = dressing;
            return this;
        }

        public BigmacBuilder bun(String bun){
            this.bun = bun;
            return this;
        }

        public BigmacBuilder ingredient(String ingredient) {
            ingredients.add(ingredient);
            return this;
        }

        public Bigmac build(){
            return new Bigmac(bun,burgers,sauce,ingredients);
        }
    }

    private Bigmac(final String bun,final int burgers, final String sauce, List<String> ingredients){
        this.bun = bun;
        this.burgers = burgers;
        this.sauce = sauce;
        this.ingredients = ingredients;
    }

    public int getBurgers() {
        return burgers;
    }

    public String getSauce() {
        return sauce;
    }

    public String getBun() {
        return bun;
    }

    public List<String> getIngredients() {
        return ingredients;
    }

    @Override
    public String toString() {
        return "Bigmac{" +
                "burgers=" + burgers +
                ", sauce='" + sauce + '\'' +
                ", bun='" + bun + '\'' +
                ", ingredients=" + ingredients +
                '}';
    }
}
