
/**
 * Swap two int val without using temp and
 * using bitwise operator(XOR)
 * 
 * @author Omar Matthew B. Reyes
 * @version 2015/05/23
 */
public class SwapWithoutTemp{
    public static void main(String[] args){
        int a = 20, b = 30;
        a = a + b;
        b = a - b;
        a = a - b;        
        System.out.println("a=" + a + "; b=" + b);
        
        int x = 10, y = 50;        
        x = x ^ y;  // x is 60; y is 50
        y = x ^ y;  // x is 60; y is 10(original value of x)
        x = x ^ y;  // x is 50; y is 10(numbers are swapped)
        System.out.println("x=" + x + "; y=" + y);
    }
}
