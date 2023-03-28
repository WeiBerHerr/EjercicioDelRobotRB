package Body;


import AllBodies.BasicCapabilities;
import Head.Head;

public class DomesticBody  extends BasicCapabilities {
    String name;

    public DomesticBody(Head h) {
        this.name = h.name;
    }

    public void doDishes(){
        System.out.println(" Dish are clear now ");

    }
    public void cleanFloor(){
        System.out.println("Floor is clean now, you can eat over it if you want");
    }
    public void washCar (){
        System.out.println("Car already washed and ready to use");
    }
}
