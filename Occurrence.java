public class Occurrence {
    public static void main(String[] args) {
        int[] arr = {4, 2, 7, 4, 9, 4};
        int target = 4;
        int firstIndex = -1;
        int lastIndex = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                if (firstIndex == -1) {
                    firstIndex = i; 
                }
                lastIndex = i; 
            }
        }

        if (firstIndex != -1) {
            System.out.println("First occurrence of " + target + " is at index: " + firstIndex);
            System.out.println("Last occurrence of " + target + " is at index: " + lastIndex);
        } else {
            System.out.println(target + " not found in the array.");
        }
    }
}
