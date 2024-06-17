package ListInterface;

import java.lang.reflect.Array;
import java.util.*;

public class ResizeableArray {
    public static void main(String[] args) {
        List<String> reSize= new ArrayList<>();
        reSize.add("One");
        reSize.add("two");
        reSize.add("three");

        System.out.println("Size at place : One : "+ reSize.size());
        reSize.remove("One");
        System.out.println("Size at place : two :  "+ reSize.size());
    }
}
