import java.util.Arrays;

public class Searchin2DArray {
    public static int[] Serach(int[][]arr, int target){

        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                
                if (arr[row][col]==target) {
                    return new int[]{row,col};
                }
            }
        }
        return new int[]{-1,-1};
    }

     public static int max(int[][]arr){
        int max= arr[0][0];

        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                
                if (arr[row][col]> max) {
                    max= arr[row][col];
                }
            }
        }
        return max;
    }

    public static void main(String[] args) {
        
        int[][] arr={
            {23,4,1},
            {18,12,34,21},
            {34,23,55}
        };
        
        int target=34;


        int[]ans1=Serach(arr, target);            //format of return value {row,col}
        int ans2=max(arr);

        System.out.println(Arrays.toString(ans1));

        System.out.println(ans2);
    }
}
