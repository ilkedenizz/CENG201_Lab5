/*
İlke Deniz Karakaş
240444405
16.11.2026
 */

package exercise1;

public class QueueDemo {
    public static void main(String[] args) {
        String[] students = {
                "Ali", "Ayse", "Mehmet", "Zeynep", "Ahmet",
                "Elif", "Mustafa", "Fatma", "Can", "Ece",
                "Burak", "Deniz", "Emre", "Selin", "Mert",
                "Ceren", "Kerem", "Dilan", "Onur", "Seda"
        };
        Queue<String> queue = new Queue<>(10);
        for (int i = 0; i < 10; i++) {
            queue.enqueue(students[i]);
        }
        System.out.println("Original Queue: " + queue);
        System.out.println("Queue Size: " + queue.size());
        System.out.println("First Student: " + queue.peek());
        System.out.println("\nRemoving three students:");
        for (int i = 0; i < 3; i++) {
            System.out.println("Removed: " + queue.dequeue());
        }
        System.out.println("\nQueue After Removal: " + queue);
        System.out.println("Final Queue Size: " + queue.size());
    }
}