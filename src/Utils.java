import exceptions.CapacityException;

public class Utils {

    public static void checkResource(Resource resource) throws CapacityException {
        try {
            resource.getCapacity();
        } finally {
            throw new CapacityException("Capacity cannot be negative");
        }
    }


    public static <T> T arrayIndexSearcher(T[] array, int index) {
        return array[index];
    }

}
