public class TestChallengeTwo {
    public static void main(String[] args){

    convertToCentimeters(6, 0);

    }

    public static void convertToCentimeters(int inches){
        double result = (double) inches * 2.54;
        System.out.println("The result in centimeters is : " + result);

    }

    public static void convertToCentimeters(int feet, int inches){
        double totalResult =  (double) (feet*12) + inches;

        convertToCentimeters((int) totalResult);

    }

}
