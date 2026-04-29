public class Toshiba implements Laptop {
    private int volume;
    private boolean isPowerOn;

    public Toshiba() { this.volume = 50; }

    @Override
    public void powerOn() {
        isPowerOn = true;
        System.out.println("Toshiba is ON. Welcome!");
    }

    @Override
    public void powerOff() {
        isPowerOn = false;
        System.out.println("Toshiba is SHUTTING DOWN.");
    }

    @Override
    public void volumeUp() {
        if (isPowerOn) {
            if (this.volume < MAX_VOLUME) this.volume += 10;
            System.out.println("Volume Toshiba Sekarang: " + this.volume);
        } else {
            System.out.println("Nyalakan Laptop Toshiba Terlebih Dahulu!");
        }
    }

    @Override
    public void volumeDown() {
        if (isPowerOn) {
            if (this.volume > MIN_VOLUME) this.volume -= 10;
            System.out.println("Volume Toshiba Sekarang: " + this.volume);
        } else {
            System.out.println("Nyalakan Laptop Toshiba Terlebih Dahulu!");
        }
    }
}
