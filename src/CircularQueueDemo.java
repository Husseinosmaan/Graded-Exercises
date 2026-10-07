import java.util.Scanner;
public class CircularQueueDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.print("Enter array size: ");
        int arraySize = input.nextInt();

        System.out.print("Enter queue capacity: ");
        int capacity = input.nextInt();

        CircularQueue cq = new CircularQueue(arraySize, capacity);

        int choice;
        do {
            System.out.println("\n--- Circular Queue Menu ---");
            System.out.println("1. Enqueue");
            System.out.println("2. Dequeue");
            System.out.println("3. Display");
            System.out.println("4. Search");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = input.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter value to insert: ");
                    cq.enqueue(input.nextInt());
                    break;

                case 2:
                    cq.dequeue();
                    break;

                case 3:
                    cq.display();
                    break;

                case 4:
                    System.out.print("Enter value to search: ");
                    cq.search(input.nextInt());
                    break;

                case 5:
                    System.out.println("Exiting program...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }
        } while (choice != 5);

        input.close();
    }
}




class CircularQueue {
    private int[] queue;
    private int front, rear, size, capacity;

    // Constructor
    public CircularQueue(int arraySize, int capacity) {
        queue = new int[arraySize];
        this.capacity = capacity;
        front = -1;
        rear = -1;
        size = 0;
    }

    // Check if queue is empty
    public boolean isEmpty() {
        return size == 0;
    }

    // Check if queue is full
    public boolean isFull() {
        return size == capacity;
    }

    // Check for duplicate values
    private boolean isDuplicate(int value) {
        if (isEmpty()) return false;

        int i = front;
        for (int count = 0; count < size; count++) {
            if (queue[i] == value) {
                return true;
            }
            i = (i + 1) % queue.length;
        }
        return false;
    }

    // Enqueue (insert) element
    public void enqueue(int value) {
        if (isFull()) {
            System.out.println(" Queue is full. Cannot insert.");
            return;
        }

        if (isDuplicate(value)) {
            System.out.println(" Duplicate value not allowed.");
            return;
        }

        if (isEmpty()) {
            front = 0;
        }

        rear = (rear + 1) % queue.length;
        queue[rear] = value;
        size++;

        System.out.println("Inserted: " + value);
    }

    // Dequeue (remove) element
    public void dequeue() {
        if (isEmpty()) {
            System.out.println(" Error: Queue is empty. Cannot remove.");
            return;
        }

        int removedValue = queue[front];
        front = (front + 1) % queue.length;
        size--;

        if (size == 0) {
            front = -1;
            rear = -1;
        }

        System.out.println("Removed: " + removedValue);
    }

    // Display queue elements
    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return;
        }

        System.out.print("Queue elements: ");
        int i = front;
        for (int count = 0; count < size; count++) {
            System.out.print(queue[i] + " ");
            i = (i + 1) % queue.length;
        }
        System.out.println();
    }

    // Search for a value
    public void search(int value) {
        if (isEmpty()) {
            System.out.println("Queue is empty. Value not found.");
            return;
        }

        int i = front;
        for (int count = 0; count < size; count++) {
            if (queue[i] == value) {
                System.out.println("Value " + value + " found in the queue.");
                return;
            }
            i = (i + 1) % queue.length;
        }

        System.out.println("Value " + value + " not found in the queue.");
    }
}


