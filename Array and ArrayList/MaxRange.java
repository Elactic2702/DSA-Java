public class MaxRange {
    
    public static int max_range(int[]arr , int start , int end){

        int max = arr[start];

        for (int i = start; i <= end; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
    

    public static void main(String[] args) {
        int[]arr={1,3,4,66,78};

        System.out.println(max_range(arr, 1, 3));
    }
}
