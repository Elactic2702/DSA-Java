
public class BinarySearch {

    // return the index
    // return -1 if element doesnt exists
    public static int binarySearch(int[] arr, int target) {

        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            // find middle element
            // int mid = (start + end) / 2; //might be possible that (start + end) exceeds
            // the range of int in java

            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
              end = mid - 1;

            }
            else if (target > arr[mid]) {
                start = mid + 1;
            } 
            else {
                //ans found
                return mid;
            }

        }
        return -1;

    }

    public static void main(String args[]) {

        int[] arr ={11,22,33,44,55,66,77,88,99};

        int target = 66;

        int ans = binarySearch(arr, target);

        System.out.println(ans);

    }
}
