 /**
 * Sort a 2d array
 * 
 * @author Omatt 
 * @version 2015/02/22
 */
public class Sort{
    private static final int maxRow = 3, maxCol = 3;
    private static String cube[][] = new String[maxRow][maxCol];
    public static void main(String[] args){
        initCube();         
        sortArray();
    }

    public static void initCube(){
        for(int row = 0; row < maxRow; row++){
            for(int col = 0; col < maxCol; col++){
                if(col == row){
                    cube[row][col] = "x";
                } else if(col > row){
                    cube[row][col] = "o";
                } else{
                    cube[row][col] = "e";
                }
            }
        }
        printArray();
    }

    public static void sortArray(){
        System.out.println("\nSorting array...\n");
        String temp;
        int y = 0;
        for(int row = 0; row < maxRow; row++){
            for(int col = y; col < maxCol; col++){
                temp = cube[row][col];
                cube[row][col] = cube[col][row];
                cube[col][row] = temp;
            }
            y++;
        }
        printArray();
    }
    
    public static void printArray(){
        System.out.println("Print 2d array");
        for(int row = 0; row < maxRow; row++){
            for(int col = 0; col < maxCol; col++){
                System.out.print(cube[row][col]);                
            }
            System.out.print("\n");
        }
    }
}
