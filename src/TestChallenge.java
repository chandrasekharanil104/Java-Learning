public class TestChallenge {
    public static void main(String[] args){
//       System.out.println( toMilesPerHour(1.25));
        printConversion(1.25);
    }

        public static long toMilesPerHour(double kiloMetersPerHour){
            if(kiloMetersPerHour < 0){
                return -1;
            } else {
                return Math.round((kiloMetersPerHour / 1.609));
            }
        }

    public static void printConversion(double kiloMetersPerHour){
        long result = toMilesPerHour(kiloMetersPerHour);

        if(kiloMetersPerHour < 0){
            System.out.println("Invalid Value");
        } else {
            System.out.println(kiloMetersPerHour + " km/h = " + result + " mi/h");
        }
    }
}
