package command;

public class CeilingFan {
    public static final int HIGH  = 3;
    public static final int MEDIUM = 2;
    public static final int LOW = 1;
    public static final int OFF = 0;
    String location;
    int speed;

    public CeilingFan(String location) {
        this.location = location;
    }

    public void high() {
        speed = HIGH;
        System.out.println("CeilingFan in high speed");
    }

    public void medium() {
        speed = MEDIUM;
        System.out.println("CeilingFan in medium speed");
    }

    public void  low() {
        speed = LOW;
        System.out.println("CeilingFan in low speed");
    }

    public void off() {
        speed = OFF;
        System.out.println("CeilingFan is off");
    }

    public int getSpeed() {
        return speed;
    }
}
