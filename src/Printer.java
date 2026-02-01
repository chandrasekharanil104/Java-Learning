public class Printer {
    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;


    public Printer(int tonerLevel, boolean duplex){
        this.pagesPrinted = 0;
        this.tonerLevel = (tonerLevel > 100 || tonerLevel < 0) ? -1 : tonerLevel;
        this.duplex = duplex;
    }

    public int addToner(int tonerAmount){
        tonerLevel = tonerLevel + tonerAmount;
        if(tonerLevel > 100 || tonerLevel < 0){
            return -1;
        } else {
            return tonerLevel;
        }
    }

    public void printPages(int pages){
        if(duplex){
            System.out.println("It's a duplex printer!");
            System.out.println("Number of pages printed are : " + pages / 2);
        } else {
            System.out.println("Number of pages printed are : " + pages);
        }
    }
}
