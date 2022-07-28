public class Naming {
    private int anIntegerVariable;
    private double aDoubleVariable;
     public static void main(String[] args) {
        Naming namingDemo = new Naming();
     namingDemo.anIntegerVariable = 95;
     namingDemo.aDoubleVariable =0.35;
     namingDemo.aSimpleMethod(2,5);
     namingDemo.anotherSimpleMethod(8,4,false);
     
     }

    private void aSimpleMethod(int i, int i1) {
        System.out.println("in aSimpleMethod(int aParameter, int anotherParameter)");
    }

    private void anotherSimpleMethod(int i, int i1, boolean b) {
        System.out.println("in anotherSimpleMethod(int aParameter, long anotherParameter, boolean yetAnotherParameter)");
    }


}




