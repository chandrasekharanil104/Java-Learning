public class Dog extends Animal{

    private String earShape;
    private String tailShape;

    public Dog(String type, double weight){
        this(type, weight, "Perky", "Curled");
    }

    public Dog(){
        super("Mutt", "medium", 50);
    }

    public Dog(String type, double weight, String earShape, String tailShape){
        super(type, weight < 15 ? "small" : (weight < 35 ? "medium" : "large"), weight);
        this.earShape = earShape;
        this.tailShape = tailShape;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "earShape='" + earShape + '\'' +
                ", tailShape='" + tailShape + '\'' +
                "} " + super.toString();
    }

    public void makeNoise(){

        if(type == "wolf"){
            System.out.println("ow woo..");
        }
        bark();
        wagTail();
    }

    @Override
    public void move(String speed) {
        super.move(speed);
        System.out.println("also wag their tail");
    }

    private void bark(){
        System.out.println("Woof");
    }

    private void wagTail(){
        System.out.println("Wag Tail!");
    }


}
