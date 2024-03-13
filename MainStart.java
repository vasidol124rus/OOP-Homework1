public class MainStart {
    public static void main(String[] args) {
        ProductMashineDrinks productMashine = new ProductMashineDrinks();
        
        HotDrink coffee = productMashine.getProduct("Coffee", 10, 60);
        HotDrinkWithTemperature tea = productMashine.getProduct("Tea", 150, 70);

    }
    
}
