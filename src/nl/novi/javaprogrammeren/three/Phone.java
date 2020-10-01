package nl.novi.javaprogrammeren.three;

public class Phone {
    private String phoneNumber;

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getInternationalPhoneNumber() {
        String countryNumber = "+31";

        return countryNumber+phoneNumber; //TODO beter via getter of maakt geen verschil
    }
}
