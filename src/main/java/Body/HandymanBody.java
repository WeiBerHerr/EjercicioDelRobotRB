package Body;

import AllBodies.BasicCapabilities;
import Head.Head;

public class HandymanBody extends BasicCapabilities {
    String name;
    public HandymanBody(Head h) {
        this.name = h.name;

    }

    @Override
    public String toString() {
        return "HandymanBody{" +
                "name='" + name + '\'' +
                '}';
    }

    public void fixCar(){
        System.out.println("Going to fix the car, i need my cartools");
    }
    public void fixDoor(){
        System.out.println("I am are of the door issue, i going to adress it right now");
    }
    public void fixTable(){
        System.out.println("This table is like 'los argento'. Do tou have any piece of paper i can use?");
    }
    public void findSomethigToFix(){
        System.out.println("i a pre-programed robot, i don't know if somethings is broken unless you tell me");
    }
}
