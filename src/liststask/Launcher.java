package liststask;

import java.util.ArrayList;
import java.util.LinkedList;

public class Launcher {

    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        LinkedList<Integer> linkedList = new LinkedList<Integer>();
        for(int i = 0; i < 1000000; i++) {
            Integer variable = Integer.MAX_VALUE;
            arrayList.add(variable);
            linkedList.add(variable);
        }
        ListOperations listOperations = new ListOperationsImpl();
        Long startOperation = System.currentTimeMillis();
        listOperations.arrayListOperations(arrayList);
        System.out.println("List operation with ArrayList took: " + (System.currentTimeMillis() - startOperation) + " milliseconds");
        startOperation = System.currentTimeMillis();
        listOperations.linkedListOperations(linkedList);
        System.out.println("List operation with LinkedList took: " + (System.currentTimeMillis() - startOperation) + " milliseconds");
    }
}
