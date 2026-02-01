public class SmartKitchen {
    private Refrigerator iceBox;
    private CoffeeMaker brewMaker;
    private DishWasher dishWasher;

    public SmartKitchen(){
        iceBox = new Refrigerator();
        brewMaker = new CoffeeMaker();
        dishWasher = new DishWasher();
    }

    public SmartKitchen(Refrigerator iceBox, DishWasher dishWasher, CoffeeMaker brewMaker){
        this.iceBox = iceBox;
        this.dishWasher = dishWasher;
        this.brewMaker = brewMaker;
    }

    public Refrigerator getIceBox(){
        return iceBox;
    }

    public CoffeeMaker getBrewMaker(){
        return brewMaker;
    }

    public DishWasher getDishWasher(){
        return dishWasher;
    }

    public void addWater(){
        iceBox.setHasToDoWork(true);
    }

    public void pourMilk(){
        brewMaker.setHasToDoWork(true);
    }

    public void loadDishWasher(){
        dishWasher.setHasToDoWork(true);
    }

    public void setKitchenState(boolean setIceBox, boolean setDishWasher, boolean setBrewMaker){
        iceBox.setHasToDoWork(setIceBox);
        dishWasher.setHasToDoWork(setDishWasher);
        brewMaker.setHasToDoWork(setBrewMaker);
    }

}

class Refrigerator {
    private boolean hasToDoWork;


    public void setHasToDoWork(boolean hasToDoWork){
        this.hasToDoWork = hasToDoWork;
    }

    public void orderFood(){
        if(hasToDoWork) {
            System.out.println("Ordering Food...");
            hasToDoWork = false;
        }
    }
}

class DishWasher{
    private boolean hasToDoWork;


    public void setHasToDoWork(boolean hasToDoWork){
        this.hasToDoWork = hasToDoWork;
    }

    public void doDishes(){
        if(hasToDoWork) {
            System.out.println("Doing Dishes... ");
            hasToDoWork = false;
        }
    }
}

class CoffeeMaker{
    private boolean hasToDoWork;

    public void setHasToDoWork(boolean hasToDoWork){
        this.hasToDoWork = hasToDoWork;
    }

    public void brewCoffee(){
        if(hasToDoWork) {
            System.out.println("Brewing Coffee...");
            hasToDoWork = false;
        }
    }
}
