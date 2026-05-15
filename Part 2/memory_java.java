public class Main {
    public static void main(String[] args) {

        int[] arr = new int[1000000];

        arr = null;

        System.gc();

        System.out.println("Garbage collection requested");
    }
}