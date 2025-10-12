public class Sorted {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};     // Sorted
        int[] arr2 = {5, 3, 2, 1};        // Not sorted

        System.out.println("arr1 is sorted: " + isSorted(arr1));
        System.out.println("arr2 is sorted: " + isSorted(arr2));
    }

    
    public static boolean isSorted(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                return false; 
            }
        }
        return true;
    }
}
