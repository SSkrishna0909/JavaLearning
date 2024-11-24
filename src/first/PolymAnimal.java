package first;

public class PolymAnimal {
    public void Animalsound()
    {
        System.out.println("This Animal makes sound");
    }
}
 class Pig extends PolymAnimal
        {
            public void Animalsound()
            {
                System.out.println("The Pig says : wee wee");
            }
        }
  class Dog extends PolymAnimal
        {
           public void Animalsound()
           {
               System.out.println("The Dog says : bow bow");
           }
        }
        class Main
        {
            public static void main(String[] args)
            {
                PolymAnimal myanimal = new PolymAnimal();
                Pig myPig = new Pig();
                Dog myDog = new Dog();

                myanimal.Animalsound();
                myPig.Animalsound();
                myDog.Animalsound();
            }
        }
