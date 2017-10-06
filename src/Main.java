public class Main {

    public static void main(String[] args) {
        Search search = new Search(10);
        int[] a = search.getIntArray();
        for(int i: a) {
            System.out.println(i + " ");
        }
    }

}
