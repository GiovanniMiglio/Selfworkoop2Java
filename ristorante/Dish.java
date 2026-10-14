package ristorante;

public class Dish extends Product {
    private String[] ingredients;

    public String[] getIngredients() {
        return ingredients;
    }

    public Dish(String name, double price, String[] ingredients) {
        super(name, price);
        this.ingredients = ingredients;
    }
}