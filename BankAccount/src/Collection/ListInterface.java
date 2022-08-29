package Collection;

import java.util.*;

public class ListInterface {

    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();

        ArrayList<String> arrayList = new ArrayList<>();
        list1.addAll(Arrays.asList(1,2,3,4,5));
        list1.addAll(Arrays.asList(1,2,3,4,5));
        list1.add(6);


        System.out.println("Array List " + list1);

        List<Integer> list2 = new LinkedList<>();
        list2.addAll(Arrays.asList(122,444,1));
        list2.addAll(Arrays.asList(122,444,1));

        System.out.println("Linked List " + list2);

        List<Integer> list3 = new Vector<>();
        list3.addAll(Arrays.asList(3,2));
        list3.addAll(Arrays.asList(3,2));

        List<Integer> list4 = new Stack<>();
        list4.addAll(Arrays.asList(44,23));
        list4.addAll(Arrays.asList(44,23));


        System.out.println("===================");



    }

}
