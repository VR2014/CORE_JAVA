package ListInterface;

import java.util.*;

public class LinkedList_Basic_Operations {

    public static void main(String[] args) {
        List<String> link = new LinkedList<>();
        link.add("Vamsi");
        link.add("Kishore");
        link.add("Reddy");

        for (String links:link){
            System.out.println(links);
        }
       Iterator<String> iterator= link.iterator();
        while (iterator.hasNext()){
            System.out.println("removong element at : "+ iterator.next());
            iterator.remove();
        }

    }
}
