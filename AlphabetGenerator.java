
/**
 * Automatically generate the entire english alphabet without creating
 * a hard-coded array of characters.
 * 
 * @author Reyes, Omar Matthew B.
 * @version 2014/07/13
 */
public class AlphabetGenerator{ 
    public static void main (String [] args){
        char alphabet[] = new char[26];
        char alphabetCache[] = new char[26];
        int count = 0;
        for(char letter = 'A'; letter <= 'Z'; letter++){            
            alphabet[count] = letter;
            //System.out.println(alphabet[count]+" "+count);
            count++;
        }
        for(int counter = 0; counter <=25; counter++){
            System.out.println(alphabet[counter]+" on alphabet["+counter+"] array.");
            //Convert to lowercase characters. 
            //Character.toUpperCase(char) to covnert from lowercase to uppercase characters.
            System.out.println(Character.toLowerCase(alphabet[counter])+" upper on alphabet["+counter+"] array.");
        }
    }
}