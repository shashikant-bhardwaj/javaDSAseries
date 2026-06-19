package Transport;

public class Vehicle {
    protected String name;
    public String model;
    public int noOfTyres;


    public Vehicle(){
        this.name = "";
        this.model = "";
        this.noOfTyres = -1;
    }

    public Vehicle(String name, String model, int noOfTyres){
        this.name = name;
        this.model = model;
        this.noOfTyres = noOfTyres;
    }

    void startEngine(){
        System.out.println("Engine is starting of " + name + ":" + model);
    }

    void stopEngine(){
        System.out.println("Engine is stopping of " + name + ":" + model);
    }
}
