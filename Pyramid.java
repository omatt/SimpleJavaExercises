
/**
 * A simple machine problem
 * 
 * @author Reyes, Omar Matthew B.
 * @version 2014/07/10
 */
public class Pyramid
{
    public static void main(String[] args){ 
        for(int rowIndex = 0; rowIndex < 5; rowIndex++){
            for(int colIndex = rowIndex ; colIndex < 5; colIndex++){
                System.out.print(" ");
            }  
            for(int colIndex = 0; colIndex < rowIndex * 2 + 1; colIndex++){
                System.out.print("*");                
            }  
            System.out.print("\n");
        }
    }
}
