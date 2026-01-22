public class FindMin {

    public static int min(int[]arr){
          int min = arr[0];
          for (int i = 1; i < arr.length; i++) {
            if (arr[i]<min) {
                min=arr[i];
            }
          }
          return min;
    }


    public static void main(String[] args) {
        int[]nums={18,12,-7,3,14,28};
        
        System.out.println(min(nums));
    }
}
