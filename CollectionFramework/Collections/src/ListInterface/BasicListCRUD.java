package ListInterface;

import java.util.*;

public class BasicListCRUD {
    //Create a simple List and CRUD operations and Iterate

    public static void main(String[] args) {
        List<String> sample=new ArrayList<>();
        sample.add("vamsi");
        sample.add("Kishore");
        sample.add("Reddy");
        //using for
        for(int i =0;i<sample.size();i++){
            System.out.println("values in Array :  "+i+"  "+ sample.get(i));
        }

        //using for each
        for(String words:sample){
            System.out.println("words in Array :  "+words);
        }

        //Using Iterator

        Iterator<String> it=sample.iterator();
        while (it.hasNext()){
            System.out.println("Iterator in Array :  "+it.next());
        }


    }

}
