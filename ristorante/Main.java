package ristorante;

public class Main {
    public static void main(String[] args) {
        String[] carbonaraIngredients = { "uova", "guanciale", "pecorino", "parmigiano" };
        Dish carbonara = new Dish("carbonara", 12.4, carbonaraIngredients);
        
        String[] pizzaIngredients = {"farina","acqua","lievito","pomodoro","mozzarella","basilico",};
        Dish pizza= new Dish ("Margherita",8,pizzaIngredients);

        Drink Beer = new Drink ("Becks", 5.5);
        Drink CocaCola = new Drink ("Coca-Cola", 3.5);
        Dish[] dishes = {carbonara,pizza};
        Drink[] drinks={Beer,CocaCola};
        Restaurant restaurant = new Restaurant("Da Gio", dishes, drinks );
        carbonara.setPrice(14);
        restaurant.stampaMenu();
    }

}
