interface InterfaceAminal {
    public void animalsound(); //interface method does not a body
    public void sleep(); //interface method does not a body
}
 class Pig implements InterfaceAminal
{
    public void animalsound()
    { //animalsound() body here
        System.out.println("The pig says : wee wee");
    }
    public void sleep()
    { //sleep() body here
        System.out.println("Zzz");
    }
}
class main
{
    public static void main(String[] args)
    {
        Pig mypig = new Pig();
        mypig.animalsound();
        mypig.sleep();
    }
}

