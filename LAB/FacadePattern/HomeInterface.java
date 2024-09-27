public class HomeInterface {
    private Light light;
    private TV tv;
    private AirConditioning aircon;

    public HomeInterface() {
        this.light = new Light();
        this.tv = new TV();
        this.aircon = new AirConditioning();
    }

    //Turn On All Services
    public void turnOnAll() {
        light.turnOn();
        tv.turnOn();
        aircon.turnOn();
    }

    //Turn Off All Services
    public void turnOffAll() {
        light.turnOff();
        tv.turnOff();
        aircon.turnOff();
    }
}