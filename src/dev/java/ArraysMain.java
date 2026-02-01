package dev.java;

import java.util.Arrays;
import java.util.Random;

public class ArraysMain {
    public static void main(String[] args){
        int[] firstArray = new int[10];
        firstArray[3] = 8;
        System.out.println("firstArray element : " + firstArray[3]);

        int[] secondArray = new int[]{1, 3, 4, 8, 0, 9};
        System.out.println("second array element : " + secondArray[4]);

        double[] thirdArray = {3.5, 4.25, 9.87};
        System.out.println("third array element : " + thirdArray[2]);

        int[] fourthArray;
        fourthArray = new int[]{2, 5, 7, 2, 5, 6};
        System.out.println("fourth array element : " +fourthArray[5]);

        for(int i = 0; i < secondArray.length; i++){
            System.out.print(secondArray[i] + " ");
        }

        System.out.println();

        for(int element : secondArray){
            System.out.print(element + " ");
        }

        System.out.println();

        System.out.println("Arrays helper class : " + Arrays.toString(fourthArray));

        int[] arrayForLoop = getRandomArray(10);
        System.out.println("Array with for loop : " + Arrays.toString(arrayForLoop));
        Arrays.sort(arrayForLoop);
        System.out.println(Arrays.toString(arrayForLoop));

        int[] fifthArray = Arrays.copyOf(fourthArray, fourthArray.length);
        System.out.println("fifth array is : " +  Arrays.toString(fifthArray));

        int[] s1 = {1,2,3,4,5};
        int[] s2 = {1,2,3,4,5};

        System.out.println(Arrays.equals(s1, s2));

        int[] sortBeforeArray = {50, 20, 10, 40, 30};
        Arrays.sort(sortBeforeArray);

        for(int i = 0; i < sortBeforeArray.length / 2; i++){
            int temp = sortBeforeArray[i];
            sortBeforeArray[i] = sortBeforeArray[sortBeforeArray.length - i - 1];
            sortBeforeArray[sortBeforeArray.length - i - 1] = temp;

        }
        System.out.println(Arrays.toString(sortBeforeArray));
    }

    private static int[] getRandomArray(int len){
        Random random = new Random();
        int[] newInt = new int[len];

        for(int i = 0; i < len; i++){
            newInt[i] = random.nextInt(100);
        }
        return newInt;
    }
}
