package Body;

import AllBodies.BasicCapabilities;
import Head.Head;

public class BattleBody extends BasicCapabilities implements Orders {
    String name;

    public BattleBody(Head h) {
        this.name=h.name;
    }
    public void battleCry(){
        System.out.println("Ready to fight and serve");
    }

    @Override
    public void engage() {
        Orders.super.engage();
        System.out.println("All basic Systems ready to fight");
    }
}
