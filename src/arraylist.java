import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;

public class arraylist {
    public static void main(String[] args)
    {
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("BMW"); //0
        cars.add("Ford");//1
        cars.add(2,"Volvo"); //adding volvo at the beginning of the list 2
        cars.set(2,"Mazda"); // modifing element at index 2
        cars.remove(0); // remove string at index 0


       // cars.clear(); //remove all items from arraylist
        for(int i = 0;i<cars.size();i++)//Loop through the elements of an ArrayList with a for loop, and use the size() method to specify how many times the loop should run:
        {
            System.out.println(cars.get(i));
        }

        System.out.println(cars);
        System.out.println(cars.get(1)); // get an item from list
        System.out.println(cars.size()); //to know the size of the list


        Collections.sort(cars);//sort
                for(String i : cars)
                {
                    System.out.println(i);
                }
                Collections.sort(cars,Collections.reverseOrder());
                for (String i : cars)
                {
                    System.out.println(i);
                }


    }
}
