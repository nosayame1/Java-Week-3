import java.util.*;

public class WordCounter {
 
    
    public static void main (String[]args){

       
        int count = 0;

        String Input;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your string here: ");
        Input = in.next();
        in.close();

        if(Input.length() == 0){
            count = 0;
            System.out.println ("Please enter valid characters: ");
        }

        else {
            count++;
        
        
        for (int i = 0; i < Input.length(); i++)
            if (Input.charAt(i) != ' '){

                count++;
            }
        }
      System.out.println("Your word count is: " + count);
    }
}
