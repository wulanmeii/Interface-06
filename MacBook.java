public class MacBook implements Laptop {
    private int volume;
    private boolean isPowerOn;

    public MacBook() { this.volume = 50; }

    @Override
    public void powerOn() {
        isPowerOn = true;
        System.out.println("MacBook is ON. Hello User!");
    }

    @Override
    public void powerOff() {
        isPowerOn = false;
        System.out.println("MacBook is OFF.");
    }

    @Override
    public void volumeUp() {
        if (isPowerOn) {
            if (this.volume < MAX_VOLUME) this.volume += 5; // MacBook naik 5 biar beda
            System.out.println("Volume MacBook: " + this.volume);
        } else {
            System.out.println("Nyalakan Laptop MacBook!");
        }
    }

    @Override
    public void volumeDown() {
        if (isPowerOn) {
            if (this.volume > MIN_VOLUME) this.volume -= 5;
            System.out.println("Volume MacBook: " + this.volume);
        } else {
            System.out.println("Nyalakan Laptop MacBook!");
        }
    }
}
