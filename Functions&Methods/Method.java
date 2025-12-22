/* 
public class Method {
   public Method() {
   }

   public static void sum() {
      System.out.println("Enter first no: ");
      int var1 = var0.nextInt();
      System.out.println("Enter second no: ");
      int var2 = var0.nextInt();
      int var3 = var1 + var2;
      System.out.println("Addition of two numbers: " + var3);
   }

   public static void main(String[] var0) {
      sum();  
   }

   */

public class Method {

    public static int add(int a, int b) {
        int sum = a + b;
        return sum;
    }

    public static void main(String[] args) {
       System.out.println("Addition of two numbers: "+add(10,20)); 
    }
}
