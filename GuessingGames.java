//Christopher Nelson
//27 January 2018
//Lab01: Guessing Game
package guessinggames;

import java.util.Scanner;
import java.util.ArrayList;

public class GuessingGames {

    public static void main(String[] args) {
        
        ArrayList<Guess> guesses = new ArrayList<Guess>();
        Scanner keyboard = new Scanner(System.in);
        boolean done = false;
        intro();
        
        while(!done){
            
            String input = keyboard.nextLine();
            
            if(input.equals("answer")){
                
                System.out.println("Please guess the game's rule!");
                String answer = keyboard.nextLine();
                System.out.println("The rule of this game is that each number must be greater than the one before it!");
                done = true;
                
            } else if (input.equals("previous")){
                
                System.out.println("These are your guesses thus far:");
                System.out.println(guesses);
                guesses.forEach((guess)->System.out.println(guess.toString() + ": " + checkGuess(guess.getGuess())));
                 
            
            } else { // assumes user inputs three numbers
                
                try{ //try to take use input and convert it into three numbers
            
                    String[] guessedNums = input.split(" ");
                    int[] numbers = new int [guessedNums.length];
                    
                    if(numbers.length == 3){
                        
                        for (int i = 0; i < guessedNums.length; i++) {
                            numbers[i] = Integer.parseInt(guessedNums[i]);
                        }
                        
                        Guess guess = new Guess(numbers);
                        checkGuess(numbers);
                        guesses.add(guess);
                        
                        
                    }else{
                        
                        System.out.println("Input 3 numbers!");
                    }
                    
                    
            
                }catch(Exception e){ //will catch any errors and the program will keep going, handle it if your assumption is wrong
                    
                
                    System.out.println("Your entry in invalid!");
                
                }
            }
            
        }
        
    }
    
    public static void intro(){
        System.out.println("Let's play a guessing game!");
        System.out.println("Please enter a guess of three INTEGERS separated by spaces, \"previous\" to see all of your previous guesses, or \"answer\" to find out the rule of the game.");
    }
    
    public static boolean checkGuess(int [] numbers){
        
        if(numbers[0]< numbers[1] && numbers[1]< numbers[2]){
            
            System.out.println("This follows the rule!!");
            return true;
            
        }else{
            
            System.out.println("This DOES NOT follow the rule!!");
            return false;
            
        }
        
    }
    
}
