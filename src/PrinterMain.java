public class PrinterMain {
    public static void main(String[] args){
        Printer printer = new Printer(85, false);

        int tonerLevelDisplay = printer.addToner(10);
        System.out.println("Toner level is : " +tonerLevelDisplay);

        printer.printPages(10);
    }
}
