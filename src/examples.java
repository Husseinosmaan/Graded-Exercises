//package CA232.ch5;
//import java.util.NoSuchElementException;
//public class ArrayQueue<T> {
//    private int front,rear,count;
//    private final static int DE = 5;
//    T[] queue;
//
//    //constructor
////    ArrayQueue(int initialsize){
//        front = rear = count =0;
//        queue = (T[]) new Object[initialsize];
//    }
//    ArrayQueue(){
//        this(DE);
//    }
//    //size
//    public int size(){
//        return count;
//    }
//    //isEmpty
//    public boolean isEmpty(){
//        return count==0;
//    }
//    //enqueue
//    public void enqueue(T element){
//        if (size()==queue.length)
//            throw new NoSuchElementException("Queue is Full");
//        queue[rear] = element;
//        rear = (rear + 1) % queue.length;
//        count++;
//    }
//    //dequeue
//    public T dequeue(){
//        if (isEmpty())
//            throw new NoSuchElementException("Queue is Empty");
//        T out = queue[front];
//        queue[front] = null;
//        front = (front + 1) % queue.length;
//        count--;
//        return out;
//    }
//    //first
//    public T first(){
//        if (isEmpty())
//            throw new NoSuchElementException("Queue is Empty");
//        return queue[front];
//    }
//    //print
//    public void print(){
//        if (isEmpty())
//            throw new NoSuchElementException("Queue is Empty");
//        int index = front;
//        for (int i = 0;i< count;i++){
//            System.out.println(queue[index] + " ");
//            index = (index + 1) % queue.length;
//        }
//        System.out.println();
//    }
//
//    public static void main(String[] args) {
//        ArrayQueue<Integer> queue = new ArrayQueue<>();
//        queue.enqueue(10);
//        queue.enqueue(11);
//        queue.enqueue(12);
//        queue.enqueue(13);
//        System.out.println("Elements of the queue: ");
//        queue.print();
//        int out = queue.dequeue();
//        System.out.println("the removed element: " + out);
//        System.out.println("The first element: " + queue.first());
//        System.out.println("The number elements: " + queue.size());
//        System.out.println("The status of the queue : " + queue.isEmpty());
//    }
//}
//
////2
//package CA232.ch5;
//import java.util.LinkedList;
//import java.util.Queue;
//public class fqueue {
//    public static void main(String[] args) {
//        Queue<Integer> q = new LinkedList<Integer>();
//        q.add(10);
//        q.add(11);
//        q.add(12);
//        System.out.println("The queue elements: " + q);
//        q.remove();
//        q.remove();
//        q.remove();
//        System.out.println("after removing an element: " + q);
//        System.out.println("After the last remove: " + q.poll());
//    }
//
//
//
//
//
//}
//
////3
//package CA232.ch5;
//import java.util.NoSuchElementException;
//public class LinkedQueue<T> {
//    private Node<T> head;
//    private Node<T> tail;
//    private int counter;
//    LinkedQueue(){
//        head = null;
//        tail = null;
//        counter = 0;
//    }
//    //size
//    public int size(){
//        return counter;
//    }
//    //isEmpty
//    public boolean isEmpty(){
//        return counter==0;
//    }
//    //enqueue
//    public void enqueue(T element){
//        Node<T> newnode = new Node<>(element);
//        if (isEmpty())
//            head = newnode;
//        else
//            tail.setNext(newnode);
//        tail = newnode;
//        counter++;
//    }
//    //dequeue
//    public T dequeue(){
//        if (isEmpty())
//            throw new NoSuchElementException("Queue IS Empty");
//        T out = head.getElement();
//        head = head.getNext(); //set head to null
//        counter--;
//        if (isEmpty())
//            tail = null;
//        return out;
//    }
//    //first
//    public T first(){
//        if (isEmpty())
//            throw new NoSuchElementException("Queue is Empty");
//        return head.getElement();
//    }
//    //Display
//    public void print(){
//        if (isEmpty())
//            throw new NoSuchElementException("Queue is Empty");
//        Node<T> current = head; //Initialization
//        while (current!= null){ //condition
//            System.out.println(current.getElement() + " ");
//            current = current.getNext();//update statement
//        }
//        System.out.println();
//    }
//    public static void main(String[] args) {
//        LinkedQueue<Integer> queue = new LinkedQueue<>();
//        queue.enqueue(12);
//        queue.enqueue(13);
//        queue.enqueue(14);
//        queue.enqueue(15);
//        System.out.println("Queue elements are: ");
//        queue.print();
//        int r = queue.dequeue();
//        System.out.println("Removed element: " + r);
//        System.out.println("The first element: " + queue.first());
//        System.out.println("The size of the queue " + queue.size());
//        System.out.println("Check wether the queue is empty or not: " + queue.isEmpty());
//    }
//}
//
////4
//package CA232.ch5;
//public class Node<T> {
//    private T element;
//    private Node<T> next;
//
//    Node(T element){
//        this.element = element;
//        next = null;
//    }
//
//    public Node<T> getNext() {
//        return next;
//    }
//
//    public void setNext(Node<T> next) {
//        this.next = next;
//    }
//
//    public T getElement() {
//        return element;
//    }
//
//    public void setElement(T element) {
//        this.element = element;
//    }
//}
//
//
////5
//class Node {
//    int data;
//    Node next;
//
//    Node(int data) {
//        this.data = data;
//        this.next = null;
//    }
//}
//
//public class Main {
//    public static void main(String[] args) {
//
//        // Create nodes
//        Node n1 = new Node(10);
//        Node n2 = new Node(20);
//        Node n3 = new Node(30);
//
//        // Link nodes
//        n1.next = n2;
//        n2.next = n3;
//
//        // Print values
//        Node current = n1;
//        while (current != null) {
//            System.out.print(current.data + " ");
//            current = current.next;
//        }
//    }
//}
//
////6
//import java.util.Stack;
//
//public class Main {
//    public static void main(String[] args) {
//        Stack<Integer> stack = new Stack<>();
//
//        // push numbers 1 to 5
//        for (int i = 1; i <= 5; i++) {
//            stack.push(i);
//        }
//
//        // pop and print all numbers
//        while (!stack.isEmpty()) {
//            System.out.print(stack.pop() + " ");
//        }
//    }
//}
////7
//class Book {
//    private String title;
//    private int pages;
//
//    // Constructor
//    public Book(String title, int pages) {
//        this.title = title;
//        this.pages = pages;
//    }
//
//    // Getters & Setters
//    public String getTitle() {
//        return title;
//    }
//
//    public void setTitle(String title) {
//        this.title = title;
//    }
//
//    public int getPages() {
//        return pages;
//    }
//
//    public void setPages(int pages) {
//        this.pages = pages;
//    }
//
//    // Method
//    public boolean isLong() {
//        return pages > 300;
//    }
//}
//
//public class Main {
//    public static void main(String[] args) {
//        Book b1 = new Book("Java Basics", 250);
//        Book b2 = new Book("Advanced Java", 450);
//
//        System.out.println(b1.getTitle() + " is long? " + b1.isLong());
//        System.out.println(b2.getTitle() + " is long? " + b2.isLong());
//    }
//}
//
////8
//class Book {
//    private String title;
//    private int pages;
//
//    // Constructor
//    public Book(String title, int pages) {
//        this.title = title;
//        this.pages = pages;
//    }
//
//    // Getters & Setters
//    public String getTitle() {
//        return title;
//    }
//
//    public void setTitle(String title) {
//        this.title = title;
//    }
//
//    public int getPages() {
//        return pages;
//    }
//
//    public void setPages(int pages) {
//        this.pages = pages;
//    }
//
//    // Method
//    public boolean isLong() {
//        return pages > 300;
//    }
//}
//
//public class Main {
//    public static void main(String[] args) {
//        Book b1 = new Book("Java Basics", 250);
//        Book b2 = new Book("Advanced Java", 450);
//
//        System.out.println(b1.getTitle() + " is long? " + b1.isLong());
//        System.out.println(b2.getTitle() + " is long? " + b2.isLong());
//    }
//}
////9
//class Node {
//    int data;
//    Node next;
//
//    Node(int data) {
//        this.data = data;
//        this.next = null;
//    }
//}
//
//public class Main {
//    public static void main(String[] args) {
//
//        // Create nodes
//        Node n1 = new Node(10);
//        Node n2 = new Node(20);
//        Node n3 = new Node(30);
//
//        // Link nodes
//        n1.next = n2;
//        n2.next = n3;
//
//        // Print values
//        Node current = n1;
//        while (current != null) {
//            System.out.print(current.data + " ");
//            current = current.next;
//        }
//    }
//}