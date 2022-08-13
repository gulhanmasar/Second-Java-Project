public class UnaryOperators {
    public static void main(String[] args){
         unaryOperators();
     //    unaryPromotion();
    }

    public static void unaryPromotion() {
        byte b1 = 18;
        short s1 = 44;

        //byte b2 = + b1; // Error need a cast
        byte b2 = (byte) + b1;

        //b2 = - b1; // need a cast error
        b2 = (byte) -b1;

        //short s2 = - s1; // error need a cast
        short s2 = (short) -s1;

        int i = 7;
        //byte b3 = -i; // error need a cast
        byte b3 = (byte) -i;

        prt("b2: " + b2);
        prt("s2: " + s2);
        prt("b3: " + b3);

        byte b4 = ++b1; // OK. No need to implicitly cast
        short s4 = --s1; // OK. No need to implicitly cast
        prt("b4: " + b4);
        prt("s4: " + s4);

        long l = 5;
        l = -l;
        System.out.println(l);

        boolean isTrue = true;
        isTrue = !isTrue;
        // !isTrue; // compiler error:
    }

    public static void unaryOperators() {
        // -5; // Error
        int a = 3;
        //+a; // Error
        //-a;//Error

        int i = -5;
        int j = +i;
        int k = -i;
        int l = +-5;
        prt("i: " + i + "j: " + j + "k: " + k + " l: " + l );

        int m =+-7;
        int n =-+9;
        int o = - -11; //better to write -(-11)
        int p = -(-13);
        prt("m: "+ m + "n: " + n + "o: " + o +"p: " + p);



    }


    private static void prt(String s) {System.out.println(s);
    }
}
