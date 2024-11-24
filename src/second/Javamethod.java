package second;

public class Javamethod {
    public void Mymethod()
    {
        System.out.println("called a method");
    }
    public static void main(String[] args)
    {
      //  Mymethod();
        metodwithparameters obj = new metodwithparameters(); //call from  methodwithparameters.java (by using second.Main class )
        System.out.println(obj.plusmethod(5,6));

    }


}
