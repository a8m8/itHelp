import exceptions.CapacityException;
import org.junit.Test;

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
}
