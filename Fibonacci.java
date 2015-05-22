
/**
 * Print fibonacci sequence n times
 * 
 * @author Omar Matthew B. Reyes
 * @version 2015/05/22
 */
public class Fibonacci
{
    public static void main(String[] args){
        int n = 20;
        int fib = 1, temp1 = 0, temp2 = 0;
        for(int cursor = 0; cursor < n; cursor++){
            fib+=temp1;
            System.out.println(fib);
            temp1=temp2;
            temp2=fib;
        }
    }
}
