
public class Comments {
    private String name = "Commnets"; // that's just a String

    /**
     * This method calculates the double of passed parameter and returns
     *
     * @param x   The value to be doubled
     * @return     Double of the value of x passed as parameter.
     * @author  Gulhan Masar
     */


    public static void main(String[]args){
        Comments bookCommets = new Comments();
      int sayi = bookCommets.doubleIt(5);
      System.out.println(sayi);
    }
public int doubleIt(int x) {
    /*
    * That's a comment block!
     */
return 2 * x ; // Just multiply x by 2!
}


}

