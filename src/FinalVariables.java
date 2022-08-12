public class FinalVariables {
    public static void main(String[] args) {

        final int i = 8;
        System.out.println(i);

        //illegal
        //i=7;
        //i++;

        //Following is not illegal
       final long l ; // Blank final
        //System.out.println(l);
        l = 7;

// l=8; // t hat's illegal
        System.out.println(l);

        //Following is ok
        int x = 3;
        int y = 8;
        final int j;

        if(x>y)
        j = 9;
        else
            j=11;

        System.out.println(i);
        final Car c1 = new Car();
        // c1= new Car();

        final Car c2; // Blank final
        c2 = new Car();
        // c2 = new Car();





    }
}



