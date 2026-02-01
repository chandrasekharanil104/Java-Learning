public class Strings {
    public static void main(String[] args){
        stringLength("Monkey D Luffy");


    }
    public static void stringLength(String str){
        System.out.println("Index of Substring is : " + str.indexOf("Luffy"));
        System.out.println("Substring is : " +str.substring(9, 11));
        System.out.println("Substring is : " +str.substring(9));
        String dateNow = String.join("-", "6", "6", "2025");
        System.out.println("dateNow is : " +dateNow);

        String dirtyString = "ABC".repeat(5).indent(3);
        System.out.println(dirtyString);

        StringBuilder strbldr = new StringBuilder("Hello World");

        System.out.println(strbldr.reverse());

        String strr = "Hello";




    }
}
