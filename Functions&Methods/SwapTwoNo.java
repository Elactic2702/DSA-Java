public class SwapTwoNo {

    public static void swap(int a,int b){
        int temp;
        temp=a;
        a=b;
        b=temp;

       
    }

    public static void main(String[] args) {
        int c=5;
        int d=10;
        swap(5,10);           //Call by value i.e. no affect on values of c and d in main() method by swap() function

         System.out.println("Value of first no after swapping: "+c);
         System.out.println("Value of second no after swapping: "+d);
    }


} 