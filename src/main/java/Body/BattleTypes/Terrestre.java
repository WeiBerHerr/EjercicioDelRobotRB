package Body.BattleTypes;

import Body.Orders;
import Head.Head;

public class Terrestre implements Orders {
    String name ;

    public Terrestre(Head h) {
        this.name=h.name;
    }

    @Override
    public void retreat() {
        Orders.super.retreat();
        System.out.println("Running back to base");
    }
}
