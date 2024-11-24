public class Student {
    private String name;
    private int RollNumber;
    private char grade;
    //name
    public String GetName()
    {
        return name;
    }
    public void SetName(String NewName)
    {
        this.name=NewName;
    }
    //rollnumber
    public int GetRollNumber()
    {
        return RollNumber;
    }
    public void SetRollNumber(int RollNumber)
    {
        this.RollNumber=RollNumber;
    }

    // Grade
    public char GetGrade()
    {
        return grade;
    }
    public void SetGrade( char Grade)
    {
        this.grade = Grade;
    }
    public static void main(String[] args) {
        Student myobj = new Student();
        myobj.SetName("Krishna");
        myobj.SetRollNumber(123);
        myobj.SetGrade('F');
        System.out.println(myobj.GetName());
        System.out.println(myobj.GetRollNumber());
        System.out.println(myobj.GetGrade());

    }
}


