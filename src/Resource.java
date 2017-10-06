import exceptions.IllegalResourceException;

public class Resource {
    private int capacity;

    Resource(int capacity){
        this.capacity = capacity;
    }

    public int getCapacity() {
        if(capacity < 0) throw new IllegalResourceException();
        return capacity;
    }


}
