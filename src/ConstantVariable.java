public class ConstantVariable {
    public static void main(String[] args){

     final int i = 8; // Constant variable
     System.out.println(i);
     // Illegal
        // i = 7;
        //i++;

        //Following is not illegal
        final long l; // Blank final but not a constant variable
        l = 7;
        // l = 8; // That's illegal
        System.out.println(l);
        final boolean b = !true;
        final int k = 1 * 2 * 3 * 4 * 5 * 6 * 123456;
        System.out.println ("k: " + k);
        final float f = (float) (7 * Math.PI) / 2;
        final double d = 2.0 * Math.PI;

        final String s1= "Java is good!"; // Constant variable
        final String s2= "The integer is" + 5; //Constant variable

        //Following is ok.
        int x = 3;
        int y = 8;
        final int j; //Blank final but not a constant variable

        if(x>y)
            j=9;
        else
            j=11;
        System.out.println(i);

        final Car c1 =  new Car(); //not constant variable
        //c1= new Car();

        final Car c2; // Blank final but not a constant variable
        c2 = new Car();
        // c2 = new Car();



    }
}
