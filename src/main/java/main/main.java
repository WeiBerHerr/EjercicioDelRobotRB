package main;

import Body.BattleBody;
import Body.BattleTypes.Acuatico;
import Body.BattleTypes.Aereo;
import Body.BattleTypes.Terrestre;
import Body.DogBody;
import Body.DomesticBody;
import Head.Head;

public class main {
    public static void main(String[] args) {
        Head battleHead = new Head("Darius");
        Head domesticHead = new Head("Mr.Musculo");
        Head handymanHead = new Head ("Mani");
        Head genHead = new Head ("Truman");

        //Battle bodies
        battleHead.speak();
        BattleBody dariusBattle = new BattleBody(battleHead);
        dariusBattle.battleCry();
        Acuatico dariusAcuatico = new Acuatico(battleHead);
        dariusAcuatico.retreat();
        Aereo dariusAereo = new Aereo(battleHead);
        dariusAereo.retreat();
        Terrestre dariusTerrestre = new Terrestre(battleHead);
        dariusTerrestre.retreat();

        //Swaping Body domestic to Acuatico
        domesticHead.speak();
        DomesticBody domesticMrMusculo = new DomesticBody(domesticHead);
        domesticMrMusculo.cleanFloor();
        //Animal
        DogBody besty = new DogBody(genHead);
        besty.dance();
        //basic moves
        dariusAereo.turnOff();

    }
}
