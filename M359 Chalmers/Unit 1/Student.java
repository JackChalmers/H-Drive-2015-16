public class Student 
{
    private String name;
    private int id;
    private String year;
    
    public Student(String aName, int anID, String aYear)
    {
        name = aName;
        id = anID;
        year = aYear;
    }
    
    public void getStudent()
    {
        System.out.println("Hello " + name + "! Your ID number is " + id + " and your'e a " + year + " in school");
    }
    
    public void setNickName(String nickName)
    {
        name = nickName;
        System.out.println("Your new nickname is; " + nickName);
    }
}