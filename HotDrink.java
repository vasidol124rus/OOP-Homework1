public class HotDrink {
    protected String name;
    protected int volume;
    protected int temperature;

    public HotDrink(String name, int volume, int temperature) {
        this.name = name;
        this.volume = volume;
        this.temperature = temperature;

    }

    public HotDrink() {

    }

    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }

    public int getTemperature() {
        return temperature;
    }


}
