package Body;

public interface Orders {
    default void retreat(){
        System.out.println("*GOING BACK TO BASE*");
    }
    default void engage(){
        System.out.println("*ALL SYSTEMS READY TO FIGHT");
    }
    default void turnOff(){
        System.out.println("*wait, looking updates... no updates, turning off*");
    }
    default void turnOn(){
        System.out.println("No more rest needed, lets win this");
    }
}
