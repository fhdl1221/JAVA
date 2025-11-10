package d.inheritance;

class Phone {
    String brand;
    String model;
    int batteryLevel;

    void powerOn() {
        System.out.println(model + " is powering on");
    }

    void charge() {
        batteryLevel = 100;
        System.out.println("finish!!");
    }
}

class IPhone extends Phone {
    String ios;

    void useFaceID() {
        System.out.println("using FaceID");
    }
}
class Galaxy extends Phone {
    String android;
    void useSPen() {
        System.out.println("using SPen");
    }
}
public class PhoneMain {
    public static void main(String[] args) {
        IPhone i = new IPhone();
        Galaxy g = new Galaxy();

        i.model = "16Pro";
        i.brand = "Apple";
        i.ios = "26.1";
        i.powerOn();
        i.charge();
        i.useFaceID();

        g.model = "S25";
        g.brand = "Samsung";
        g.android = "25";
        g.powerOn();
        g.charge();
        g.useSPen();

    }
}
