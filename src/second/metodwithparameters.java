package second;

import first.*;

import java.util.Scanner;

// Method Overloading
public class metodwithparameters {
   public static int plusmethod(int x,int y)
    {
        return x + y;
    }
    static double plusmethod(double x,double y)
    {
        return x + y;
    }
    public static void main(String[] args)
    {
        int mynum1= plusmethod(4,6);
        double mynum2=plusmethod(4.3,6.26);

        System.out.println("Int : " + mynum1);
        System.out.println("double : " + mynum2);
        Javamethod obj = new Javamethod(); //call from second.Javamethod.java (by using second.Main class )
        obj.Mymethod();
        //first.Encapsulation.java
//        first.Encapsulation myobj = new first.Encapsulation();
//        myobj.setName("Krishna");
//        System.out.println(myobj.getName());


    }
}
