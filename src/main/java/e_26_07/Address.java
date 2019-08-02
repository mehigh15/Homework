package e_26_07;

public class Address {
    private String country;


    public Address(String country) {
        setCountry(country);

    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCountry() {
        return country;
    }


    @Override
    public String toString() {
        return country;
    }

}
