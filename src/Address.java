import java.util.Objects;

/**
 *
 * @author Carlesso
 */
public class Address {
    
    private String street;
    private String number;

    public Address() {
    }

    public Address(String street, String number) {
        this.street = street;
        this.number = number;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    @Override
    public String toString() {
        return getStreet() + ", " + getNumber();
    }
    
    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Address))
            return false;
        if (obj == this)
            return true;

        Address addr = (Address) obj;
        
        return addr.getStreet().equals(getStreet()) &&
                addr.getNumber().equals(getNumber());
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 29 * hash + Objects.hashCode(this.street);
        hash = 29 * hash + Objects.hashCode(this.number);
        return hash;
    }
    
    
}
