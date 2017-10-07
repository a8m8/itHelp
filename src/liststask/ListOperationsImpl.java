package liststask;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;
import java.util.LinkedList;

public class ListOperationsImpl implements ListOperations {


    @Override
    public <T> ArrayList<T> arrayListOperations(ArrayList<T> arrayList) {
        throw new NotImplementedException();
    }

    @Override
    public <T> LinkedList<T> linkedListOperations(LinkedList<T> linkedList) {
        throw new NotImplementedException();
    }
}
