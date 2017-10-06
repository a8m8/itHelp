import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class SearchTest {

    @Test
    public void testSearchInitialization(){
        //Arrange
        Search search = new Search(4);

        //Act
        int[] array = search.getIntArray();

        //Assert
        assertEquals(4, array.length);
        assertTrue(array[0] < array[1] && array[0] < array[2] && array[0] < array[3]);
        assertTrue(array[1] > array[0] && array[1] < array[2] && array[1] < array[3]);
        assertTrue(array[2] > array[0] && array[2] > array[1] && array[2] < array[3]);
        assertTrue(array[3] > array[0] && array[3] > array[1] && array[3] > array[2]);
    }

}
