import java.util.Arrays;
import java.util.Random;

public class LearnArraysOutside {
    public static void main(String[] args) {
//
//        int[] firstArray = randomArray(10);
//
//        System.out.println(Arrays.toString(firstArray));
//
//        Arrays.sort(firstArray);
//
//        System.out.println(Arrays.toString(firstArray));
//
//        int[] newArray2 = new int[10];
//
//        System.out.println("Arrays.toString : " +Arrays.toString(newArray2));
//        Arrays.fill(newArray2, 5);
//        System.out.println("Arrays.toString : " +Arrays.toString(newArray2));
//
//        int[] newArray3 = Arrays.copyOf(newArray2, 15);
//        System.out.println(Arrays.toString(newArray3));
//
//        int[] s1 = {1, 2, 3, 4, 5};
//        int[] s2 = {1, 2, 3, 4, 5};
//
//
//    }
//    public static int[] randomArray(int len){
//        Random random = new Random();
//        int[] newInt = new int[len];
//
//        for(int i = 0; i < len; i++){
//            newInt[i] = random.nextInt(100);
//        }
//
//        return newInt;
//    }

    int[] newArray1 = arrayGenerator(10);

        System.out.println(Arrays.toString(newArray1));
//        Arrays.sort(newArray1);
//        System.out.println(Arrays.toString(newArray1));




    }
    public static int[] arrayGenerator(int len){
        Random random = new Random();
        int[] newArray = new int[len];
        for(int i = 0; i < len; i++){
            newArray[i] = random.nextInt(100);
        }
        Arrays.sort(newArray);
        for(int i = 0; i < len / 2; i++){
            int temp = newArray[i];
            newArray[i] = newArray[len - 1 - i];
            newArray[len - 1 - i] = temp;
        }
        return newArray;
    }

}
