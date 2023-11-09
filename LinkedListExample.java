import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class LinkedListExample {
    public static void main(String[] args) {
        // List<Integer> linkedList = new LinkedList<>();
        List<Integer> linkedList = new LinkedList<>();

        linkedList.add(10);
        linkedList.add(20);
        linkedList.add(30);
        linkedList.add(40);
        linkedList.add(50);

        System.out.println("Linked List: " + linkedList);

        int elementAtIndex2 = linkedList.get(2);
        System.out.println("Element at index 2: " + elementAtIndex2);

        linkedList.add(1, 15);
        System.out.println("Linked List after adding 15 at index 1: " + linkedList);

        linkedList.remove(3);
        System.out.println("Linked List after removing element at index 3: " + linkedList);

        System.out.println("Iterating through the linked list:");
        for (Integer item : linkedList) {
            System.out.print(item + " ");
        }
        System.out.println();

        
        ListIterator<Integer> listIterator = linkedList.listIterator(linkedList.size());
        System.out.println("Reversed Linked List:");
        while (listIterator.hasPrevious()) {
            System.out.print(listIterator.previous() + " ");
        }
    }
}   
