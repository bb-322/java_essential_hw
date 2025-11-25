package hw8.task234;

import java.util.Objects;

public class Device {
    private String manufacturer, serialNumber;
    private float price;

    public Device(String manufacturer, String serialNumber, float price) {
        this.manufacturer = manufacturer;
        this.serialNumber = serialNumber;
        this.price = price;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public float getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Device: manufacturer = %s, price = %.2f, serialNumber = %s".formatted(
                getManufacturer(), getPrice(), getSerialNumber()
        );
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Device device)) return false;
        return Float.compare(getPrice(), device.getPrice()) == 0
                && Objects.equals(getManufacturer(), device.getManufacturer())
                && Objects.equals(getSerialNumber(), device.getSerialNumber());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getManufacturer(), getSerialNumber(), getPrice());
    }
}

class Monitor extends Device {
    private int resolutionX, resolutionY;

    public Monitor(String manufacturer, String serialNumber, float price,
                   int resolutionX, int resolutionY) {
        super(manufacturer, serialNumber, price);
        this.resolutionX = resolutionX;
        this.resolutionY = resolutionY;
    }

    public int getResolutionX() {
        return resolutionX;
    }

    public int getResolutionY() {
        return resolutionY;
    }

    @Override
    public String toString() {
        return "Device: manufacturer = %s, price = %.2f, serialNumber = %s, X = %d, Y = %d".formatted(
                getManufacturer(), getPrice(), getSerialNumber(), getResolutionX(), getResolutionY()
        );
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Monitor monitor)) return false;
        if (!super.equals(o)) return false;
        return getResolutionX() == monitor.getResolutionX() && getResolutionY() == monitor.getResolutionY();
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getResolutionX(), getResolutionY());
    }
}

class EthernetAdapter extends Device {
    private int speed;
    private String mac;

    public EthernetAdapter(String manufacturer, String serialNumber, float price, int speed, String mac) {
        super(manufacturer, serialNumber, price);
        this.speed = speed;
        this.mac = mac;
    }

    public int getSpeed() {
        return speed;
    }

    public String getMac() {
        return mac;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof EthernetAdapter that)) return false;
        if (!super.equals(o)) return false;
        return getSpeed() == that.getSpeed() && Objects.equals(getMac(), that.getMac());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getSpeed(), getMac());
    }
}
