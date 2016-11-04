/**
 * Created by manishgiri on 11/4/16.
 */
public class OrderedApp {
    //this class will use the ordered array created in class OrderedArray

    public static void main(String[] args) {
        int maxSize = 30;
        OrderedArray orderedArray = new OrderedArray(maxSize);

        //insert 10 items
        orderedArray.insert(10);
        orderedArray.insert(20);
        orderedArray.insert(30);
        orderedArray.insert(40);
        orderedArray.insert(50);
        orderedArray.insert(60);
        orderedArray.insert(70);
        orderedArray.insert(80);
        orderedArray.insert(20);
    }
}
