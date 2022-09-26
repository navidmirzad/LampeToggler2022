public class Lamp {

    private String name;
    private boolean turnedOn;

    public Lamp(String name, boolean status) {
        this.name = name;
        this.turnedOn = true;
    }

    public Lamp(String name) {
        this.name = name;
        this.turnedOn = false;
    }

    public void turnOn() {
        boolean turnedOn = true;
    }

    public void turnOff() {
        boolean turnedOn = false;
    }

    public void setTurnedOn(boolean status) {
        turnedOn = status;
    }

    public void toggle() {
        if (!turnedOn)
            turnedOn = true;
        else
            turnedOn = false;
    }

    public boolean isOn() {
            return isOn();
    }

    public String toString() {
        String text;
        if (turnedOn)
            text = "turned on";
        else
            text = "turned off";
        return name + " is " + text;
    }

}