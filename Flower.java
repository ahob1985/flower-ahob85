import java.util.Scanner;
import java.util.ArrayList;

/**
 * Write a description of class Flower here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Flower
{
    /**
     * Constants
     */
    private static final Scanner SC = new Scanner(System.in);
    private static final String[] FLOWER_PICS = {
            "  # # #\n" +
            "  # O #\n" +
            "  # # #\n" +
            "    |  \n" +
            "    |  \n",
            "  # # #\n" +
            "  # O #\n" +
            "    # #\n" +
            "    |  \n" +
            "    |  \n",
            "  # # #\n" +
            "    O #\n" +
            "    # #\n" +
            "    |  \n" +
            "    |  \n",
            "    # #\n" +
            "    O #\n" +
            "    # #\n" +
            "    |  \n" +
            "    |  \n",
            "      #\n" +
            "    O #\n" +
            "    # #\n" +
            "    |  \n" +
            "    |  \n",
            "       \n" +
            "    O #\n" +
            "    # #\n" +
            "    |  \n" +
            "    |  \n",
            "       \n" +
            "    O  \n" +
            "    # #\n" +
            "    |  \n" +
            "    |  \n",
            "       \n" +
            "    O  \n" +
            "    #  \n" +
            "    |  \n" +
            "    |  \n",
            "       \n" +
            "    x  \n" +
            "    |  \n" +
            "    |  \n" +
            "    |  \n"
        };
    private static final String[] WORDS = ("ant baboon badger bat bear beaver camel cat clam cobra cougar coyote " +
            "crow deer dog donkey duck eagle ferret fox frog goat goose hawk lion lizard llama " +
            "mole monkey moose mouse mule newt otter owl panda parrot pigeon python rabbit ram " +
            "rat raven rhino salmon seal shark sheep skunk sloth snake spider stork swan tiger " +
            "toad trout turkey turtle weasel whale wolf wombat zebra").split(" ");

    /**
     * ArrayList<String> missedLetters
     * Each string is an individual letter the player has missed so far. 
     * Initialized as an empty ArrayList at the start of each game.
     * 
     * ArrayList<String> correctLetters
     * Each string is an individual letter the player has guessed correctly 
     * so far. Initialized as an empty ArrayList at the start of each game.
     * 
     * String secretWord
     * This is the word the player has to guess! Initialized by
     * getRandomWord().
     * 
     * boolean running
     * Represents if the program should continue running (true) or not 
     * (false). Initialized to true in setupGame(), can be changed in
     * processGameOver();
     */
    private static ArrayList<String> missedLetters;
    private static ArrayList<String> correctLetters; 
    private static String secretWord; 
    private static boolean running;

    /**
     * Prints a simple greeting. Be as creative as you want here. Be sure to 
     * include your name as the author!
     */
    public static void printGreeting() {

    }

    /**
     * Initialize global variables as follows:
     * -missedLetters and correctLetters should be initialized as empty 
     *  ArrayLists.
     * -secretWord should be initialized as a random string from the WORD 
     *  constant.
     * -running should be initialized to true.
     */
    public static void setupGame() {

    }

    /**
     * Prints the string "Missed letters: ", along with all elements in 
     * missedLetters as a single string, with a space between each letter. 
     * For example, if missedLetters is ["a", "b", "c", "d"], this function 
     * prints "Missed letters: a b c d" on one line.
     */
    public static void printMissedLetters() {

    }

    /**
     * Prints the string "Secret Word: ", along with whatever letters the 
     * player has guessed correctly, as a single string. The correct letters 
     * should appear where they normally do in the secret word. Letters the 
     * player has not yet guessed should appear as underscores ("blanks"). 
     * There should be a space between each letter or blank.
     * 
     * For example, if the secret word is "google" and the player has guessed 
     * "o", this function prints "Correct letters: _ o o _ _ _".
     */
    public static void printCorrectLetters() {

    }

    /**
     * Prints the "board", which is the current flower pic, missed letters, 
     * and correct letters. The current flower pic is determined by how many 
     * letters the player has missed so far.
     */
    public static void printBoard() {

    }

    /**
     * Returns a random word from WORDS.
     * 
     * The formula for generating a random integer is:
     * (int) Math.floor(Math.random() * (max - min + 1) + min)
     */
    public static String getRandomWord() {

    }

    /**
     * In an infinite loop, prompt the player to guess a letter. The program 
     * can exit the loop only if the player's guess is "valid", which means 
     * it passes all three of these conditions:
     * 1) The length of the guess must be exactly 1.
     * 2) The guess cannot be a letter they have already guessed 
     *    (alreadyGuessed is an ArrayList passed into the function).
     * 3) The guess must be a letter in the English alphabet.
     * 
     * Return the guess if it is valid. If a guess does not satisfy a 
     * condition, print a message communicating this to the player. For 
     * example, if the player enters "abc" or "", they have failed condition 
     * #1, so you should print something like, "Please guess one letter at a 
     * time.".
     * 
     * Valid guesses should include both uppercase and lowercase letters. To 
     * make things easier on yourself, try setting the player's guess to all 
     * lowercase before validating it against the three conditions.
     */
    public static String getGuess(ArrayList<String> alreadyGuessed) {

    }

    /**
     * Get a player's guess by calling getGuess(). If the guess appears in 
     * the secret word, append that letter to correctLetters. Otherwise 
     * append it to missedLetters.
     * 
     * Note that getGuess() has a parameter called alreadyGuessed, which 
     * prevents the player from guessing the same letter more than once. When 
     * calling getGuess(), you need to pass an ArrayList of guesses the user 
     * has already made, which is simply a combination of missedLetters and 
     * correctLetters ArrayLists.
     * 
     * You can combine ArrayLists using the addAll() method. For example:
     * 
     * ArrayList<String> list1 = new ArrayList<String>();
     * list1.add("a");
     * list1.add("b");
     * ArrayList<String> list2 = new ArrayList<String>();
     * list2.add("c");
     * list2.add("d");
     * ArrayList<String> list3 = new ArrayList<String>();
     * list3.addAll(list1);
     * list3.addAll(list2);
     * 
     * The value of list3 is ["a", "b", "c", "d"], while list1 and list2 
     * remain unmodified.
     */
    public static void processGuess() {
 
    }

    /**
     * Check if the player has won or lost, and call processGameOver() in 
     * either case. 
     * 
     * More details:
     * -If they have won, print a congratulatory message, then call 
     *  processGameOver().
     * -Otherwise, if they have lost, print the board one last time. Then 
     *  print a message telling them they have run out of guesses, along with 
     *  another message telling them what the secret word was. Finally, call 
     *  processGameOver().
     * -If they have neither won nor lost, do nothing.
     * 
     * To check for a win, you should see if each letter in the secretWord 
     * string is contained in the correctLetters ArrayList. You can do this 
     * with a for loop that passes through the length of secretWord, but exits
     * the moment it finds a letter that isn't contained in correctLetters. 
     * 
     * This is the trickiest part of this project and requires you to think 
     * out of the box a bit (at least, if you want to do it the "neat" way).
     */
    public static void checkWinLose() {

    }

    /**
     * Asks the player if they would like to play again. If they do, call 
     * setupGame() to reset the game's global variables. Otherwise set the 
     * global variable running to false and print a simple "Goodbye" message.
     */
    public static void processGameOver() {
 
    }

    /**
     * The "mother function" of the program. Runs the game by doing the 
     * following:
     * 1) Print a greeting.
     * 2) Setup the game.
     * 3) In a loop that continues while the global variable running is true, 
     *    do the following:
     *    A) Print the board.
     *    B) Process a guess.
     *    C) Check if the player has won or lost.
     */
    public static void main(String[] args) {

    }
}
