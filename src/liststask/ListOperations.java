package liststask;

import java.util.ArrayList;
import java.util.LinkedList;

public interface ListOperations {

    <T> ArrayList<T> arrayListOperations(ArrayList<T> arrayList);
    <T> LinkedList<T> linkedListOperations(LinkedList<T> linkedList);
}
