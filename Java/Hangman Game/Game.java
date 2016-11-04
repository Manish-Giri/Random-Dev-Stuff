package javaObjs.HangmanGame;

/**
 * Created by Manish on 10/20/2015.
 */
public class Game {

    public static final int MAX_MISSES = 7;
    private String mAnswer;
    private String mHits;
    private String mMisses;

    public Game(String answer) {
        mAnswer = answer;
        mHits = "";
        mMisses = "";
    }

    //apply a guess to the game
    public boolean applyGuess(char c) {
        char letter = validateGuess(c);
        boolean isHit = (mAnswer.indexOf(letter) >= 0);
        if(isHit) {
            //if it's a hit, add letter to hits string
            mHits += letter;
        }

        else {
            //if not a hit, add letter to misses
            mMisses += letter;
        }

        return isHit;
    }

    public String getCurrentProgress() {
        String progress = "";
        char[] letters = mAnswer.toCharArray();
        for(char l: letters) {
            //set default display to blank at first
            char display = '-';
            //if this letter was guessed correctly
            if(mHits.indexOf(l) >= 0) {
                display = l;
            }
            progress += display;

        }

        return progress;
    }

    //returns number of attempts left
    public int getRemainingAttempts() {
        return MAX_MISSES - mMisses.length();
    }

    //validate user's guess
    private char validateGuess(char ch) {
        if(!Character.isLetter(ch)){
            throw new IllegalArgumentException("A letter is required");
        }

        char letter = Character.toLowerCase(ch);
        if((mMisses.indexOf(letter) >= 0) || (mHits.indexOf(letter) >= 0)) {
            throw new IllegalArgumentException("Letter " + letter + " has already been guessed.");

        }

        return letter;
    }

    //validation to ensure guess is not blank
    public boolean applyGuess(String letters) {
        if(letters.length() == 0) {
            throw new IllegalArgumentException("No letter found.");
        }

        char firstLetter = letters.charAt(0);
        return applyGuess(firstLetter);
    }

    //check for game state
    public boolean isSolved() {
        return getCurrentProgress().indexOf('-') == -1;
    }

    //get answer
    public String getAnswer() {
        return mAnswer;
    }
}
