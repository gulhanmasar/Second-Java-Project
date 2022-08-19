public class IfWithAssignment {
    public static void main(String[] args) {
        boolean b = false;
        if (b = true) // Written by mistake instead of ==
            System.out.println("false");
        else
            System.out.println("true");

        System.out.println();



        //
    }
}