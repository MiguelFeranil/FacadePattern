
public class Light implements HomeService {

    @Override
    public void turnOn() {
        System.out.println("The Light is Turn On");
    }

    @Override
    public void turnOff() {
        System.out.println("The Light is Turn Off");
    }
}