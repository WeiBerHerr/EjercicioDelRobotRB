package Body;

import AllBodies.BasicCapabilities;
import Head.Head;

public class DogBody extends BasicCapabilities {
    String name;

    public DogBody(Head h) {
        this.name = h.name;
    }

    @Override
    public void dance() {
        super.dance();
        System.out.println("look, i can stand over to leg. ejem. GUAU GUAU");
    }

    @Override
    public String toString() {
        return "DogBody{" +
                "name='" + name + '\'' +
                '}';
    }
}
