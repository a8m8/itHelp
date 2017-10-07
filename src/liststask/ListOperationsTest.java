package liststask;

import org.junit.Test;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;
import java.util.LinkedList;

public class ListOperationsTest {

    private ArrayList<Integer> getArrayList(){
        ArrayList<Integer> a = new ArrayList<Integer>();
        for(int i = 0; i < 3000; i++) {
            Integer variable = Integer.MAX_VALUE;
            a.add(variable);
        }
        return a;
    }

    private LinkedList<Integer> getLinkedList(){
        LinkedList<Integer> l = new LinkedList<Integer>();
        for(int i = 0; i < 3000; i++) {
            Integer variable = Integer.MAX_VALUE;
            l.add(variable);
        }
        return l;
    }

    @Test
    public void testArrayListOperationsSuccessfullyReturnModifiedList(){

        throw new NotImplementedException();
    }

    @Test
    public void testArrayListOperationsWithNullAsParameter(){
        throw new NotImplementedException();
    }

    @Test
    public void testArrayListOperationsWithEmptyList(){
        throw new NotImplementedException();
    }

    @Test
    public void testArrayListOperationsWithSmallList(){
        throw new NotImplementedException();
    }

    @Test
    public void testLinkedListOperationsSuccessfullyReturnModifiedList(){
        throw new NotImplementedException();
    }

    @Test
    public void testLinkedListOperationsWithNullAsParameter(){
        throw new NotImplementedException();
    }

    @Test
    public void testLinkedListOperationsWithEmptyList(){
        throw new NotImplementedException();
    }

    @Test
    public void testLinkedListOperationsWithSmallList(){
        throw new NotImplementedException();
    }


}
