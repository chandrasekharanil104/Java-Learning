public class KitchenMain {
    public static void main(String[] args){
        SmartKitchen kitchen = new SmartKitchen();

//        kitchen.getIceBox().setHasToDoWork(true);
        kitchen.getIceBox().orderFood();
    }
}
