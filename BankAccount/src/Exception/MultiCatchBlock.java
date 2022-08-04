package Exception;

public class MultiCatchBlock {
    public static void main(String[] args) {

        int[] arr = {2, 3};

        try {
            System.out.println(arr[4]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Index");
        }

        System.out.println("======================");

        try {
            System.out.println(8 / 0);
            System.out.println("Try Block");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Catch Block");
        } finally {
            System.out.println("Finally Block");
        }
    }


}
