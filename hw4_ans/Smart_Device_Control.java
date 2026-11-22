import java.util.*;

class Device {
    String name;
    boolean isOn;

    Device(String name) {
        this.name = name;
        this.isOn = false;
    }
}

interface Adjustable {
    void setLevel(int level);
}

interface Switchable {
    void turnOn();

    void turnOff();
}

class SmartLight extends Device implements Switchable, Adjustable {
    int brightness;

    SmartLight(String name) {
        super(name);
        this.brightness = 50;
    }

    @Override
    public void turnOn() {
        isOn = true;
    }

    @Override
    public void turnOff() {
        isOn = false;
    }

    @Override
    public void setLevel(int level) {
        if (level < 0) {
            brightness = 0;
        } else if (level > 100) {
            brightness = 100;
        } else {
            brightness = level;
        }
    }

    @Override
    public String toString() {
        String power = isOn ? "ON" : "OFF";
        return name + " " + power + " " + brightness;
    }
}

class SmartFan extends Device implements Switchable, Adjustable {
    int speed;

    SmartFan(String name) {
        super(name);
        this.speed = 1;
    }

    @Override
    public void turnOn() {
        isOn = true;
    }

    @Override
    public void turnOff() {
        isOn = false;
    }

    @Override
    public void setLevel(int level) {
        if (level < 1) {
            speed = 1;
        } else if (level > 5) {
            speed = 5;
        } else {
            speed = level;
        }
    }

    @Override
    public String toString() {
        String power = isOn ? "ON" : "OFF";
        return name + " " + power + " " + speed;
    }
}

public class Smart_Device_Control {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        char type = input.next().charAt(0);
        String name = input.next();

        Device device;
        Switchable switchable;
        Adjustable adjustable;

        if (type == 'L') {
            SmartLight light = new SmartLight(name);

            device = light;
            switchable = light;
            adjustable = light;

        } else if (type == 'F') {
            SmartFan fan = new SmartFan(name);

            device = fan;
            switchable = fan;
            adjustable = fan;

        } else {
            input.close();
            return;
        }

        int commandCount = input.nextInt();

        for (int i = 0; i < commandCount; i++) {
            String command = input.next();

            if (command.equals("ON")) {
                switchable.turnOn();

            } else if (command.equals("OFF")) {
                switchable.turnOff();

            } else if (command.equals("SET")) {
                int level = input.nextInt();
                adjustable.setLevel(level);
            }
        }

        System.out.println(device);

        input.close();
    }
}