public class While {
    public static void main(String[] args){

        double r = Math.random();
        System.out.println("r:" + r);

        while( r<0.8 ){
            r = Math.random();
            System.out.println("in while: " + r);
        }
        System.out.println("After while");

    }
}
