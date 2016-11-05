/**
 * Created by manishgiri on 11/4/16.
 */
public class StackX {
    // a generic LIFO stack that provides stack operations
    int[] stackArr;
    int top;

    //constructor
    public StackX(int size) {
        stackArr = new int[size];
        top = -1;   //no items to begin with
    }

    public boolean isFull() {
        return top == stackArr.length;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    //push items on top of stack
    public void push(int item) {
        //check if stack is full
        if(!isFull()) {
            stackArr[++top] = item;
            System.out.println("Inserted item = " + item);
        }
        else {
            System.out.println("Stack is full.");
        }
    }

    //pop items from top of stack
    public int pop() {
        //check if stack is empty
        if(top == -1) {
            System.out.println("Stack is empty");
            return top;
        }
        else {
            //return item from top and decrement top
            return stackArr[top--];
        }
    }

    //peek
    public int peek() {
        return stackArr[top];
    }

    public static void main(String[] args) {
        StackX theStack = new StackX(10);

        //push 5 items
        theStack.push(10);
        theStack.push(20);
        theStack.push(30);
        theStack.push(40);
        theStack.push(50);

        //peek at top
        System.out.println("Current top item = " + theStack.peek());

        //remove all items
        while (!theStack.isEmpty()) {
            int currentItem = theStack.pop();
            System.out.println("Item removed = " + currentItem);
        }
    }
}
