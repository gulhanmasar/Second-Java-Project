public class Naming {
public int anIntegerVariable = 5;
   public double aDoubleVariable;

   public  boolean isInteger = false;
     public static void main(String[] args) {
         Naming namingDemo = new Naming();
     namingDemo.anIntegerVariable = 95;
     namingDemo.aDoubleVariable =0.35;

     namingDemo.aSimpleMethod(2,5);
     namingDemo.anotherSimpleMethod(8,4,false);

     }

    public void aSimpleMethod(int aParameter, int anotherParameter){
        isInteger = true;
        System.out.println("in aSimpleMethod" +  aParameter+ "ve" + anotherParameter);
        if(isInteger == true){
            System.out.println(anIntegerVariable +5);
anIntegerVariable ++;
            System.out.println(anIntegerVariable +5);
        }
        else{
           System.out.println("bu bir false ifadedir");

        }
        }

    public void anotherSimpleMethod(int aParameter, long anotherParameter, boolean yetAnotherParameter){
        System.out.println("in anotherSimpleMethod(int aParameter, long anotherParameter, boolean yetAnotherParameter)");
    }
}



