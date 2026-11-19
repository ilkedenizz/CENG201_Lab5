/*
İlke Deniz Karakaş
240444405
16.11.2026
 */

package exercise3;

public class Queue {
    private char[] items;
    private int front;
    private int rear;
    private int count;
    public Queue(int capacity) {
        items = new char[capacity];
        front = 0;
        rear = -1;
        count = 0;
    }
    public void enqueue(char value) {
        if (isFull()) {
            throw new IllegalStateException("Queue is full");
        }
        rear = (rear + 1) % items.length;
        items[rear] = value;
        count++;
    }
    public char dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        char value = items[front];
        front = (front + 1) % items.length;
        count--;
        return value;
    }
    public char peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        return items[front];
    }
    public boolean isEmpty() {
        return count == 0;
    }
    public boolean isFull() {
        return count == items.length;
    }
    public int size() {
        return count;
    }
}