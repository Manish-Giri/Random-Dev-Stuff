/**
 * Created by manishgiri on 11/4/16.
 */
public class OrderedArray {

    private int[] arr;
    private int nElems;

    public OrderedArray(int max) {
        arr = new int[max];
        nElems = 0;
    }

    //return size of array
    public int size() {
        return nElems;
    }

    //search an item using binary search
    public int find(int searchKey) {

        int lowerBound = 0;
        int upperBound = nElems - 1;
        int curIn;

        while (true) {
            curIn = (lowerBound + upperBound) / 2;
            //check if current index holds key
            if(arr[curIn] == searchKey) {
                return curIn;
            }

            //check if range is no longer valid
            else if(lowerBound > upperBound) {
                //return number of items instead
                return nElems;
            }

            else {
                //divide range in half and search for key
                if(arr[curIn] < searchKey) {
                    lowerBound = curIn + 1;
                }
                else {
                    upperBound = curIn - 1;
                }
            }
        }
    }

    //insert an item
    public void insert(int item) {
        int j;
        for(j = 0; j < nElems; j++) {
            if(arr[j] > item) {
                break;
            }
        }

        //move items up - start at the top and move things up by one
        for(int k = nElems; k > j; k--) {
            arr[k] = arr[k-1];
        }

        arr[j] = item;
        nElems++;
    }

    //delete an item
    public boolean delete(int item) {
        //use binary search to first locate the item to be deleted
        int j = find(item);
        if (j == nElems) {
            return false;
        }
        else {
            for(j = 0; j < nElems; j++) {
                if(arr[j] == item) {
                    break;
                }

            }

            //start at current value of j and move items one position down
            for(int k = j; k < nElems; k++) {
                arr[k] = arr[k+1];
            }
            nElems--;
            return true;
        }

    }

    //print all items
    public void display() {
        for(int j = 0; j < nElems; j++) {
            System.out.print(arr[j] + " ");
        }
        System.out.println();
    }

}
