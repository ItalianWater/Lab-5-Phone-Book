public class Contact {
    private String name;
    private String address;
    private String city;
    private String phoneNumber;

    public Contact(String name, String address, String city, String phoneNumber) {
        this.name = name;
        this.address = address;
        this.city = city;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getCity() {
        return city;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return name + ", " + address + ", " + city + ", " + phoneNumber;
    }
}