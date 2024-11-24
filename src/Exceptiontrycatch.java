public class Exceptiontrycatch {
    public static void main(String[] args)
    {

       // int[] mynumbers = {1,2,3};
        //System.out.println(mynumbers[10]);
        try{
            int[] mynumbers = {1,2,3};
            System.out.println(mynumbers[10]);
        } catch (Exception e) {
            System.out.println("Something went wrong.");
        }
        finally {
            System.out.println("the try catch is finished.");
        }
    }
}
