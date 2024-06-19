package ListInterface;

import java.util.*;

public class ReverseList {
    public static void main(String[] args) {
        //Using ArrayList and LinkedList
        List<Integer> list = new ArrayList<>();

        for (int i = 1; i <= 10; i++) {
            list.add(i);
        }
      //  Collections.reverse(list);
        System.out.println("Size of List : " + list.size());
        System.out.println("Values in List Before rev : " + list.toString());
        int size = list.size();
        List<Integer> temp = new ArrayList<>();
        if (!list.isEmpty()) {
            for (int i = 0; i < size; i++) {
                int j = size - 1 - i;
                temp.add(list.get(j));
            }

            System.out.println("Values in List After rev : " + temp.toString());
            List<Integer> temp1 = new ArrayList<>();
            if (!list.isEmpty()) {
                for (int j = size-1; j >= 0; j--) {
                    temp1.add(list.get(j));
                }

                System.out.println("temp 1: " + temp1.toString());
            }
        }


    }
}
