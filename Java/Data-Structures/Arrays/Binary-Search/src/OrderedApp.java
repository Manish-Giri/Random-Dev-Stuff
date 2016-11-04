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
        orderedArray.insert(90);
        orderedArray.insert(100);

        System.out.println("finished inserting items. Current elements - ");
        orderedArray.display();

        //search for an item
        int searchKey = 55;
        int pos = orderedArray.find(searchKey);
        if(pos != orderedArray.size()) {
            System.out.println("Found search key " + searchKey + " at position " + pos);
        }
        else {
            System.out.println("Search key " + searchKey + " was not found.");
        }

        orderedArray.display();

        //delete 3 items
        if(orderedArray.delete(40)) {
            System.out.println("40 was successfully deleted");
        }
        else {
            System.out.println("40 was not found in the array");
        }
        if(orderedArray.delete(55)) {
            System.out.println("55 was successfully deleted");
        }
        else {
            System.out.println("55 was not found in the array");
        }
        if(orderedArray.delete(90)) {
            System.out.println("90 was successfully deleted");
        }
        else {
            System.out.println("90 was not found in the array");
        }

        //display again
        orderedArray.display();

    }
}
