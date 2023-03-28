package Body.BattleTypes;

import Body.Orders;
import Head.Head;

public class Acuatico implements Orders {
    String name;

    public Acuatico(Head h) {
        this.name=h.name;
    }

    @Override
    public void retreat() {
        Orders.super.retreat();
        System.out.println("Swimming back to base");
    }
}
