package Body;

import AllBodies.BasicCapabilities;
import Head.Head;

public class GenericRobot extends BasicCapabilities {
    String name;
    public GenericRobot(Head h) {
        this.name=h.name;
    }

    public void hello(){
        System.out.println("I am a generic Robot, i don't have any special");
    }

    @Override
    public String toString() {
        return "GenericRobot{" +
                "name='" + name + '\'' +
                '}';
    }
}
