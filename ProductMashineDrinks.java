public class ProductMashineDrinks implements ProductMashine {

    public HotDrink getProduct(String name, int volume) {
        System.out.println("Выдан: " + volume + "мл. '" + name + "");
        return new HotDrink(name, volume, 0);

    }

    public HotDrinkWithTemperature getProduct(String name, int volume, int temperature) {
        System.out.println("Выдан: " + volume + "мл. '" + name + "'" + " c температурой " + temperature + " градусов");
        return new HotDrinkWithTemperature(name, volume, 0);
    }
}
