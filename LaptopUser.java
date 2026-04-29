public class LaptopUser {
    private final Laptop laptop;

    public LaptopUser(Laptop laptop) {
        this.laptop = laptop;
    }

    void turnOnLaptop() { this.laptop.powerOn(); }
    void turnOffLaptop() { this.laptop.powerOff(); }
    void makeLaptopLoud() { this.laptop.volumeUp(); }
    void makeLaptopSilent() { this.laptop.volumeDown(); }
}
