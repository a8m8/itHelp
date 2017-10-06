import exceptions.CapacityException;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UtilsTest {

    @Test(expected = CapacityException.class)
    public void testThrowingExceptionWithNegativeCapacity() throws CapacityException {
        Resource resource = new Resource(-100);
        Utils.checkResource(resource);
    }

    @Test(expected = CapacityException.class)
    public void testThrowingExceptionWithPositiveCapacityTooBecauseOfFinally() throws CapacityException {
        Resource resource = new Resource(100);
        Utils.checkResource(resource);
    }

    @Test
    public void testArrayIndexSearcherWithStringArray(){
        //Arrange
        String[] array = {"Ivan", "Petia", "Anton", "Vova"};

        //Act
        String b = Utils.arrayIndexSearcher(array, 2);

        //Assert
        assertEquals("Anton", b);

    }

    @Test
    public void testArrayIndexSearcherWithIntArray(){
        //Arrange
        Integer[] array = {1,2,3,4};

        //Act
        Integer b = Utils.arrayIndexSearcher(array, 2);

        //Assert
        assertEquals(new Integer(3), b);

    }
}
