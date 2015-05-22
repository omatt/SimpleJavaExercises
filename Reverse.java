
/**
 * Reverse array
 * 
 * @author Omar Matthew B. Reyes 
 * @version 2015/05/23
 */
public class Reverse
{
    public static void main(String[] args){
        int x[] = {1,2,3,4,5,6,7,8,9};
        int temp = 0;
        for(int cursor = 0; cursor < x.length/2; cursor++){
            temp = x[cursor];
            x[cursor] = x[x.length - cursor - 1];
            x[x.length - cursor - 1] = temp;
        }
        
        for(int cursor = 0; cursor < x.length; cursor++){
            System.out.print(x[cursor] + " ");
        }
    }
}
