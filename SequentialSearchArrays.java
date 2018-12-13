package sequentialsearcharrays;
import java.util.Scanner;

/**
 *Michael Haugh
 *SequentialSearch-Arrays
 *Programming III - AP CS
 *12-12-18
 */

public class SequentialSearchArrays {
    
    public static void main(String[] args){
        
    //Initial statement indicates that the name of an AP CS student is to be entered.    
    System.out.println("Please enter the name of a student in AP Computer"
                + " Science.");
    
    //Declares scanner and boolean variable.
    Scanner keyboard = new Scanner(System.in); 
    String nameInput = keyboard.next();
    boolean students = false; 
    
    //Places the students' names in an array.
    String [] apcs = {"Michael", "Denver", "Jacob", "Owen", "Richard", 
            "Lucas", "Kai'lani", "David", "Dylan"};
     
       
        while (true){
    //Causes the boolean to be true when the input is equal to a name in the array.
        for(int x = 0; x < apcs.length; x++){
                if (nameInput.equals(apcs[x])){
                    students = true;
                    break;
                }
        }
        //If the input matches a name in the array, it is indicated through a print statement.
        if (students == true)
        {
                System.out.println("This student is in the class.");
                break;
                
        }
        //If the input does not match a name in the array, it is indicated through a print statement.
        else if (students == false)
        {
            System.out.println("This student is not in the class. Please "
                    + "try again.");
        //User will guess again with another input.
            nameInput = keyboard.nextLine();
        
        }
    }
    }
}
    

