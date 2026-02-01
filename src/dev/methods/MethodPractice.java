package dev.methods;

public class MethodPractice {
    public static void main(String[] args){
        int a = 10;
        int b = 15;

        System.out.println(max(a,b));
    }

    public static int max(int x, int y){
        if(x > y){
            return x;
        } else {
            return y;
        }
    }
}
