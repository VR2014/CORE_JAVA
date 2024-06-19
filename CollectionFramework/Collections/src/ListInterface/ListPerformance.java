package ListInterface;

import java.util.*;

public class ListPerformance {
    /*
    adding and retrive performance
    for Linked and ArrayList
     */

    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

        //Add - ArrayList
        long start = System.nanoTime();
        for (int i = 0; i <= 10000; i++) {
            arrayList.add(i);
        }
        long end = System.nanoTime();

        System.out.println("Adding time taken for array list is :  " + (end - start));
       //Add - LinkedList
        start=System.nanoTime();
        for (int i=0;i<10000;i++){
            linkedList.add(i);
        }
        System.out.println("Size of LinkedList after adding elements: " + linkedList.size());

        end=System.nanoTime();
        System.out.println("Adding time taken for LinkedList is :  " + (end - start));

        // Retrieve - ArrayList
        start = System.nanoTime();
        for (int i = 0; i <= 10000; i++) {
            arrayList.get(i);
        }
        end = System.nanoTime();
        System.out.println("Retrieval time taken for ArrayList is : " + (end - start));

        // Retrieve - LinkedList
        start = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            linkedList.get(i);
        }
        end = System.nanoTime();
        System.out.println("Retrieval time taken for LinkedList is : " + (end - start));

    }
}
