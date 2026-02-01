import java.util.Scanner;

public class TimeChallenge {
    public static void main(String[] args) {
    int currentYear = 2025;
    String yearOfBirth = "1990";
//        System.out.println(getInputFromConsole(2025));
        System.out.println(getInputFromScanner(2025));

    }

//    public static String getInputFromConsole(int currentYear){
//        String name = System.console().readLine("Hi What's your name");
//        System.out.println("Hi " + name + ". Thanks for taking the course");
//
//        String dateOfBirth = System.console().readLine("What year were you born?");
//        int age = currentYear - Integer.parseInt(dateOfBirth);
//
//        return "So you are " + age + " years old!";
//    }

    public static String getInputFromScanner(int currentYear){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Hi What's your name");

        boolean validDOB = false;
        int age = 0;

        do {
            String name = scanner.nextLine();

            System.out.println("Enter Year of Birth >= " + (currentYear - 125) + " and  <= " + (currentYear));


            String dateOfBirth = scanner.nextLine();
            age = currentYear - Integer.parseInt(dateOfBirth);
        }while(!validDOB);



        return "So you are " + age + " years old!";
    }

    public static int checkData(int currentYear, String dateOfBirth){
        int dob = Integer.parseInt(dateOfBirth);
        int minYear = currentYear - 125;

        if(dob < minYear || dob > currentYear)
            return -1;
        return (currentYear - dob);

    }

}
