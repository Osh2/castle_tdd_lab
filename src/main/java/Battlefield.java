import java.util.ArrayList;

public class Battlefield {

    private String name;
    private ArrayList<Knight> theFellers;

    public Battlefield(String name){
        this.name = name;
        this.theFellers = new ArrayList<>();
    }



    public int getFellas() {
        return theFellers.size();
    }

    public void addKnight(Knight knight) {
        theFellers.add(knight);
    }

    public void removeKnight(int knight) {
        theFellers.remove(knight);
    }

    public void addKnightFromCastle(Castle kildrummy) {
        Knight battlefieldKnight = kildrummy.errantKnight(0);
        theFellers.add(battlefieldKnight);
    }
}
