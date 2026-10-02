package Lab1.Lab1Codes.Task4;

public class Queue<T> {   // <T>: the queue can hold any type (String, Integer...)

    private T[] items;   // the array that holds the elements
    private int size;    // how many elements are in the queue right now

    @SuppressWarnings("unchecked")  // silences the warning caused by the cast below
    public Queue() {
        items = (T[]) new Object[10];   // "new T[10]" is not allowed, so we cast an Object array to T[]
        size = 0;                       // the queue starts empty
    }

    // a new person joins the line: add to the back
    public void enqueue(T element) {
        if (size == items.length) {     // the array is full, no room
            System.out.println("Queue is full!");
            return;                     // stop the method here
        }
        items[size] = element;          // the back = the first empty slot, which is items[size]
        size++;                         // one more element
    }

    // the person at the front leaves: remove it and give it to the caller
    public T dequeue() {
        if (isEmpty()) {                // nothing to remove from an empty queue
            System.out.println("Queue is empty!");
            return null;
        }
        T first = items[0];             // save the front element, we return it at the end
        for (int i = 1; i < size; i++) {
            items[i - 1] = items[i];    // everyone shifts one step to the left
        }
        items[size - 1] = null;         // clear the last slot so no old copy stays there
        size--;                         // one less element
        return first;
    }

    // look at who is at the front, but do not remove it
    public T peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty!");
            return null;
        }
        return items[0];  // just look, change nothing
    }

    // are there no elements in the queue?
    public boolean isEmpty() {
        return size == 0;
    }

    // how many elements are in the queue?
    public int size() {
        return size;
    }

    // everyone leaves the line
    public void clear() {
        for (int i = 0; i < size; i++) {
            items[i] = null;  // empty the slots
        }
        size = 0;  // reset the counter
    }

    // turn the queue into a string like [A, B, C]
    @Override
    public String toString() {
        String result = "[";
        for (int i = 0; i < size; i++) {
            result += items[i];   // add the i-th element to the string
            if (i < size - 1) {
                result += ", ";   // add a comma if it is not the last element
            }
        }
        result += "]";
        return result;
    }
}