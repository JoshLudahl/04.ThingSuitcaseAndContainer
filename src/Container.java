
import java.util.ArrayList;

public class Container {

    private ArrayList<Suitcase> box;
    private int weight;

    public Container(int weight) {
        this.weight = weight;
        box = new ArrayList<Suitcase>();
    }

    public void addSuitcase(Suitcase suitcase) {
        //if the total weight of all the suitcases aren't over, add to container

        if ((weight()+suitcase.totalWeight()) <= weight) {
            box.add(suitcase);
        }
    }

    public int weight() {
        int sum = 0;
        for (Suitcase item : box) {
            sum += item.totalWeight();
        }
        return sum;
    }

    public void printThings() {
        for (Suitcase item : box) {
            item.printThings();
        }
    }
    
    @Override
    public String toString() {
        return box.size() + " suitcases (" + weight() + " kg)";
    }

}
