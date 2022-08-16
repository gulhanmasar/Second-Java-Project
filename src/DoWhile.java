public class DoWhile {
    public static void main(String[] args) {
        //double r = Math.random();
        // System.out.println("in do-while:" + r);
        double r;
        do { //First block
            r = Math.random();
            System.out.println("in do-while:" + r);

        } while (r < 0.8d); //Then condition
    }
}