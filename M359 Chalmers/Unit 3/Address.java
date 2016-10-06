
/**
 * Represents a Street Address
 * 
 * @author Mrs. Denna - from Textbook
 * @version 9-27-16
 */
public class Address
{
    private String streetAddress, city, state;
    private String zipCode;
    
    /**
     * Constructor for objects of class Address
     */
    public Address()
    { // implementation not shown
    }
    
    public Address(String streetAddress, String city, String state, String zipCode)
    {
        this.streetAddress = streetAddress;
        this.city  = city;
        this.state = state;
        this.zipCode = zipCode;
    }

    /**
     * Returns the adress as a nicely formatted String
     * 
     * @return     result - the address
     */
    public String toString()
    {
        String result = streetAddress + "\n";
        result += city + ", " + state + " " + zipCode;
        
        return result;
    }
    
    public void setAddress(String streetAddress, String city, String state, String zipCode)
    {
        this.streetAddress = streetAddress;
        this.city  = city;
        this.state = state;
        this.zipCode = zipCode;
    }
}
