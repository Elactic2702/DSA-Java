public class CopyEvenNumbers {
    public static void main(String[] args) {
        int[] arr = {1, 4, 6, 7, 8};

    
        int count = 0;
        for (int num : arr) {
            if (num % 2 == 0) {
                count++;
            }
        }
    
        int[] evenArr = new int[count];
        int index = 0;
        for (int num : arr) {
            if (num % 2 == 0) {
                evenArr[index] = num;
                index++;
            }
        }

        System.out.println("Even numbers:");
        for (int num : evenArr) {
            System.out.print(num + " ");
        }
    }
}
