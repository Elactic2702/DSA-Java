public class TypePromotion {
    public static void main(String[] args) {
        char a = 'a';
        char b = 'b';
        int c = b - a;                   //Type promotion converting characters a and b into intgers(a=98 and b =97) and then performing
                       // arithematic opeartion on it
        System.out.println(c);

        short d = 5;
        byte e = 25;
        int f = d * e; // Type promotion converting short and byte into intgers and then performing
                       // arithematic opeartion on it
        System.out.println(f);
    }
}
