import java.util.ArrayList;

public class Castle {

    private String location;
    private int capacity;
    private ArrayList<Knight> orderOfTheCool;

    public Castle(String location, int capacity) {
        this.location = location;
        this.capacity = capacity;
        this.orderOfTheCool = new ArrayList<>();
    }

    public String getLocation() {
        return location;
    }

    public int knightCount() {
        return orderOfTheCool.size();
    }

    public void recruitKnight(Knight knight) {
        if (capacity > knightCount()){
            orderOfTheCool.add(knight);
        }
    }

    public Knight errantKnight(int i) {
        return orderOfTheCool.remove(i);
    }
}
