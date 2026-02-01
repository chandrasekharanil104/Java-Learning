public class InheritanceMain {
    public static void main(String[] args){

        Animal animal = new Animal("Generic Animal", "Huge", 400);
        doAnimal(animal, "slow");

        Dog dog = new Dog();
        doAnimal(dog, "medium");

        Dog yorkie = new Dog("Yorkie", 15);
        doAnimal(yorkie, "fast");

        Dog retriever = new Dog("Retriever", 20, "perky", "curled");
        doAnimal(retriever, "superfast");

        Dog wolf = new Dog("wolf", 20);
        doAnimal(wolf, "fast");

    }
    public static void doAnimal(Animal animal, String speed){
        animal.makeNoise();
        animal.move(speed);
        System.out.println(animal);
        System.out.println("------");
    }
}
