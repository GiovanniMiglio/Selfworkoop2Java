package ristorante;

public class Restaurant {
    private String name;
    private Dish[] dishes;
    private Drink[] drinks;

    public Restaurant(String name, Dish[] dishes, Drink[] drinks) {
        this.name = name;
        this.dishes = dishes;
        this.drinks = drinks;
    }

    public String getName() {
        return name;
    }

    public Dish[] getDishes() {
        return dishes;
    }

    public Drink[] getDrinks() {
        return drinks;
    }

    public void stampaMenu() {
        for (int i = 0; i < dishes.length; i++) {
            Dish dish = dishes[i];
            System.out.println("il piatto " + dish.getName() + " costa " + dish.getPrice());
        }
         for (int i = 0; i < drinks.length; i++) {
            Drink drink = drinks[i];
            System.out.println("la bevanda " + drink.getName() + " costa " + drink.getPrice());
        }
    }
}
