
public class SearchInRange {
    
    
    public static int Search(int arr[], int target,int start,int end) {
    
        if (arr.length == 0) {
            return -1;
        }
        for (int i = start; i <= end; i++) {

            if (arr[i] == target) {
                return i;
            }
        }
        return -1; 

    }

    public static void main(String[] args) {
        int[]nums={18,12,-7,3,14,28};
        int tar=18;

        System.out.println(Search(nums, tar, 1, 4));
    }
}
