public class EvenDigits {
    //Given an array nums  of integers return how many of them cointain an even number of digits

    public static int findNumbers(int[]arr){
        
        int count = 0;

        for (int num : arr) {
            
            if (even(num)) {
                count ++;
            }
        }
        return count;
      
    }
    

    //function to check wether a number cointains even digits or not
    public static boolean even(int num){
        int numberOfDigits=digits(num);

        if (numberOfDigits % 2 == 0) {
            return true;
        }
        
        return false;
    }
    

    //function to count no of digits in a number
    public static int digits(int num){

        if (num < 0) {              // if no is negative convert it into positive
            num = num * -1;
        }

        if (num == 0) {            // if no is 0
            return 1;
        }
        
        int count=0;
        while (num > 0) {
            count++;
            num = num/10;
        }
        return count;

    }
    
    public static void main(String[] args) {
        
        int []arr = {12,345,2,6,7896};

        System.out.println(findNumbers(arr));     //required solution

        System.out.println(digits(12345)); 
    }
    
}
