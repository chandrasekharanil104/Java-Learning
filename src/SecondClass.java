public class SecondClass {
    public static void main(String[] args){
      double firstVariable = 20.00;
      double secondVariable = 80.00;
      double total = (firstVariable + secondVariable) * 100;

      System.out.println("Total is : " + total);

      double remainderResult = total % 40.00;

      System.out.println("Remainder Result : " + remainderResult);

      boolean isRemainderZero = true;
      if(remainderResult != 0.0){
          System.out.println("There's some remainder");
      }
    }
}