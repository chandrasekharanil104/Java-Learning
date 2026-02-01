public class Car {
    private String make = "Tesla";
    private String model = "Model X";
    private String color = "White";
    private int doors = 4;
    private boolean isConvertible = true;

    public String getMake(){
        return make;
    }

    public String getModel(){
        return model;
    }

    public String getColor(){
        return color;
    }

    public int getDoors(){
        return doors;
    }

    public boolean isConvertible(){
        return isConvertible;
    }

    public void setMake(String make){
        this.make = make;
    }

    public void setModel(String model){
        this.model = model;
    }

    public void setColor(String color){
        this.color = color;
    }

    public void setDoors(int doors){
        this.doors = doors;
    }

    public void setConvertible(boolean isConvertible){
        this.isConvertible = isConvertible;
    }

    public void displayCar(){
        System.out.println(doors + " - doors " + make + " " + model + " " + color + " " + (isConvertible ? "Convertible": ""));
    }

}
