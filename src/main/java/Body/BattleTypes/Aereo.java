package Body.BattleTypes;

import Body.Orders;
import Head.Head;

public class Aereo implements Orders {
    String name;

    public Aereo(Head h) {
        this.name=h.name;
    }

    @Override
    public void retreat() {
        Orders.super.retreat();
        System.out.println("Flying back to base");
    }
}
