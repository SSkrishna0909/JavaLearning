package first;

public class Encapsulation {
    private String name;

    //GET
    public String getName() {
        return name;
    }

    //SET
    public void setName(String newname) {
        this.name = newname;
    }


    public static void main(String[] args) {
        Encapsulation myobj = new Encapsulation();
        myobj.setName("Krishna");
        System.out.println(myobj.getName());
    }
}

