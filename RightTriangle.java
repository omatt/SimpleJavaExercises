
/**
 * Prints a right triangle using for loop.
 * 
 * @author Reyes, Omar Matthew B.
 * @version 2014/07/10
 */
public class RightTriangle{
    public static void main(String[] args){
        for(int x = 5; x > 0; x--){
            for(int y = x ; y > 0; y--){
                System.out.print("1");
            }
            System.out.print("\n");
        }
        System.out.print("\n");
        for(int x = 0; x < 5; x++){
            for(int y = 0 ; y <= x; y++){
                System.out.print("2");
            }
            System.out.print("\n");
        }
    }
}
