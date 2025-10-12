public class DuplicateElements {
    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 3, 4, 1};

        System.out.print("Duplicate elements: ");
        for (int i = 0; i < arr.length; i++) {
            boolean isDuplicate = false;
            boolean alreadyPrinted = false;

            
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    isDuplicate = true;
                    break;
                }
            }

           
            for (int k = 0; k < i; k++) {
                if (arr[i] == arr[k]) {
                    alreadyPrinted = true;
                    break;
                }
            }

            if (isDuplicate && !alreadyPrinted) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
