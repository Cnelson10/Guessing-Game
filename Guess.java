package guessinggames;

public class Guess {
    //Hold three numbers
    //it's own toString() method
    private int [] guesses;
    
    public Guess(int [] guesses){
        this.guesses = guesses;
    }
    
    public int [] getGuess(){
        return guesses;
    }
    
    public void setGuess(int [] guesses){
        this.guesses =guesses;
    }
    
    @Override
    public String toString(){
        String str = guesses[0] +  " " + guesses[1] + " " + guesses[2];
        
        return str;
    }
}
