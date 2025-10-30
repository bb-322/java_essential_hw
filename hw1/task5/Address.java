package hw1.task5;

public class Address {
    int index, house, apartment;
    String country, city, street;

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public int getHouse() {
        return house;
    }

    public void setHouse(int house) {
        this.house = house;
    }

    public int getApartment() {
        return apartment;
    }

    public void setApartment(int apartment) {
        this.apartment = apartment;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    static void main(String[] args) {
        Address a = new Address();

        a.setIndex(01001);
        a.setCountry("Ukraine");
        a.setCity("Kiyv");
        a.setStreet("Khreshchatyk");
        a.setHouse(42);
        a.setApartment(15);

        // Выводим адрес
        System.out.println("index: " + a.getIndex());
        System.out.println("country: " + a.getCountry());
        System.out.println("city: " + a.getCity());
        System.out.println("street: " + a.getStreet());
        System.out.println("house: " + a.getHouse());
        System.out.println("apartment: " + a.getApartment());

    }
}
