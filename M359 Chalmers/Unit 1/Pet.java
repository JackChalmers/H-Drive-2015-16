/*
 * The pet class is an example of how ot create a class woth a structure, instancefields, and methods
 */

public class Pet
{
    //instance variables are private
    //everytime yuo create a new instance of the Pet class, these variables
    //will be created
    private String name;
    public String species;
    private int age;
    private int weight;
    
    
    
    /*
     * a constructor is called everytime you create a new Pet() object
     * A constructor has no return type
     * A constructor has the same name as the class
     * Common to write more than one constructor
     * 
     */
    
    public Pet(String aName, String aSpecies, int anAge, int aWeight)
    {
        name = aName;
        species = aSpecies;
        age = anAge;
        weight = aWeight;
    }
    
    
    
    public void play()
    {
        System.out.println("I am playing with my " + species + ", " + name + "!!!");
    }
    
    public void eat()
    {
        System.out.println(name + " is eating");
    }
    
    public void changeName(String newName)
    {
        name = newName;
    }
    
    public void hasbirthday()
    {
        age +=1;
    }
    
    public void gainsWeight()
    {
        weight += 12;
    }
    
    
    
    
    
    
    
    
}