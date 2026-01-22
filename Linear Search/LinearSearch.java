
public class LinearSearch {

    // Function to search and return the address of element
    public static int Search(int arr[], int target) {
        // check if length of array is not zero
        if (arr.length == 0) {
            return -1;
        }
        for (int i = 0; i < arr.length; i++) {

            // check for every element at every index of loop
            if (arr[i] == target) {
                return i;
            }
        }
        return -1; // this line will execute after all elements of array have been searched hence
                   // target element not found

    }

    // Function to search and return the element itself
    public static int Search2(int arr[], int target) {
        // check if length of array is not zero
        if (arr.length == 0) {
            return -1;
        }
        for (int i = 0; i < arr.length; i++) {

            // check for every element at every index of loop
            if (arr[i] == target) {
                return target;
            }
        }
        return -1; // this line will execute after all elements of array have been searched hence
                   // target element not found

    }


    public static void main(String[] args) {
        int nums[] = { 1, 2, 3, 4, 5, 6 };
        int ans = Search(nums, 6);

        int ans2 = Search2(nums, 100);

        System.out.println(ans);
        System.out.println(ans2);
    }
}
