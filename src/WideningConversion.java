public class WideningConversion {
    public static void main(String[] args){
        byte b = 126;
        short s=1000;
        char c = 65;
        int i = 2_147_483_647;
        long l;
        float f = 3.14f;
        double d;

        s = b;
        l = i;

        f=i;
        System.out.println("i: " + i + " f: " +  f);

        l = i + 1;
        System.out.println("i: " + i + "l: " + l);
        i = c;
        System.out.println("c:" + c + "i: " + i );


    }
}
