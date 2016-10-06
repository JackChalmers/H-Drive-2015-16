public class PetStudentDriver
{
    public static void main()
    {
        Pet pet1 = new Pet("Lord Neil", "Savage", 17, 300);
        pet1.play();
        System.out.println(pet1.species);
        
        Student student1 = new Student("Jack", 545454, "Junior");
        student1.getStudent();
    }
    
    
}