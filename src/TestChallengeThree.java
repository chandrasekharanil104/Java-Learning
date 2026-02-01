import java.util.Scanner;

public class TestChallengeThree {
    public static void main(String[] args){
        int total = 0;
        Scanner scanner = new Scanner(System.in);

        for(int i = 1; i<=5; i++){
            System.out.println("Enter number #" + i + " : ");
            try {
                String number = scanner.nextLine();
                total = total + Integer.parseInt(number);
            }catch(Exception error){
                System.out.println("Invalid Number try again.");
                i--;
            }



        }
        System.out.println("The total is : " + total);
    }
}
