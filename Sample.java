
/**
 * Write a description of class Sample here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Sample
{
    public static void main(String[] args){
        int data[] = { 1, 2, 0, 3, 4, 5};
        for(int index = 0; index < data.length; index++){
            if(data[index] > 0){
                System.out.print(data[index] + " " + data[index + 1]);
            }
            index++;
        }
    }
}
