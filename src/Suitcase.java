
import java.util.ArrayList;

public class Suitcase {

    private ArrayList<Thing> things;
    private int max;

    public Suitcase(int max) {
        things = new ArrayList<Thing>();
        this.max = max;

    }

    public void addThing(Thing thing) {

        int sum = totalWeight();
        if (!((sum + thing.getWeight()) > this.max)) {
            things.add(thing);
        }

    }

    public int totalWeight() {
        int sum = 0;
        for (Thing item : things) {

            sum += item.getWeight();
        }
        return sum;
    }

    public void printThings() {

        for (Thing item : things) {
            System.out.println(item);
        }

    }

    public Thing heaviestThing() {
        int heaviest = things.indexOf(0);

        for (Thing item : things) {
            if (things.size() == 0) {
                return null;
            }

            if (heaviest < item.getWeight()) {
                heaviest = item.getWeight();
            }
        }
        for (Thing item: things) {
            if (heaviest == item.getWeight()) {
                return item;
            }
        }
        
        return null;
    }

    public String toString() {
        if (things.size() == 0) {
            return "empty (" + totalWeight() + " kg)";
        }
        else if (things.size() == 1) {
            return things.size() + " thing (" + totalWeight() + " kg)";
        }

        return things.size() + " things (" + totalWeight() + " kg)";
    }
}
