package Lab1.Lab1Codes.Task4;

public class Task4 {
    public static void main(String[] args) {
        Queue<String> queue = new Queue<>();    // a queue that holds Strings

        queue.enqueue("A");
        queue.enqueue("B");
        queue.enqueue("C");
        System.out.println("Queue: " + queue);  // toString is called automatically

        System.out.println("Peek: " + queue.peek());
        System.out.println("Dequeue: " + queue.dequeue());
        System.out.println("Queue: " + queue);

        System.out.println("Size: " + queue.size());
        System.out.println("Is empty: " + queue.isEmpty());

        queue.clear();
        System.out.println("After clear: " + queue);
        System.out.println("Is empty: " + queue.isEmpty());
    }
}