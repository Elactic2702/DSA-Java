public class CallByValue {
    public static void change(int x){
        x=5;
    }
    
    public static void main(String[] args) {
        int a=10;
        change(a);                              // a will be printed 10 only it is unaffected by the function change() 
        System.out.println("Changed no is: "+a);  //Call by Value i.e. no affect in the value of a on main method by change() function
    }
}
