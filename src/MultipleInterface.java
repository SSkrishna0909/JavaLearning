import first.*;

interface MultipleInterface
 {
     interface Firstinterface
     {
         public void mymethod();
     }

     interface Secondinterface
     {
         public void myothermethod();
     }

     class Demo implements Firstinterface, Secondinterface
     {
         public void mymethod() {
             System.out.println("Some Text...");
         }

         public void myothermethod() {
             System.out.println("Some other Text...");
         }
     }

     class main {
         public static void main(String[] args) {
             Demo myobj = new Demo();
             myobj.mymethod();
             myobj.myothermethod();

             PolymAnimal myobj1 = new PolymAnimal();
             myobj1.Animalsound();

         }
     }
 }