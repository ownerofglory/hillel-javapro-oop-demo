package ua.ithillel.oop.address;

public final class Address implements Cloneable {
    private int number;
    private String street;
    private String city;
    private String zipCode;

    public void setNumber(int number) {
        this.number = number;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    @Override
    public Address clone() {
        Address address = new Address();
        address.setStreet(street);
        address.setCity(city);
        address.setNumber(number);
        address.setZipCode(zipCode);

        return address;
    }
}
