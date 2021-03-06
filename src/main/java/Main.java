import java.util.*;

import static java.lang.Integer.parseInt;

public class Main {

    public static void main(String[] args) {

        int[] numberArray = {1, 2, 3};

        // ~~~~~~~~~~~~~~~~~~~~~~~~~~~ DOUBLE NUMBERS ~~~~~~~~~~~~~~~~~~~~~~~~~~~

        ArrayList<Integer> doubleNumbersResult = doubleNumbers(numberArray);
        System.out.println("DOUBLE NUMBERS: " + doubleNumbersResult);
        // ~~~~~~~~~~~~~~~~~~~~~~~~~~~ DOUBLE NUMBERS ~~~~~~~~~~~~~~~~~~~~~~~~~~~

        // ~~~~~~~~~~~~~~~~~~~~~~~~~~~ MULTIPLY NUMBERS ~~~~~~~~~~~~~~~~~~~~~~~~~~~
        int multiplier = 3;
        ArrayList<Integer> multiplyNumbersResult = multiplyNumbers(numberArray, multiplier);
        System.out.println("MULTIPLIER NUMBERS: " + multiplyNumbersResult);
        // ~~~~~~~~~~~~~~~~~~~~~~~~~~~ MULTIPLY NUMBERS ~~~~~~~~~~~~~~~~~~~~~~~~~~~

        // ~~~~~~~~~~~~~~~~~~~~~~~~~~~ DOUBLE LETTERS ~~~~~~~~~~~~~~~~~~~~~~~~~~~
        String string = "abc";
        String doubleLettersResult = doubleLetters(string);
        System.out.println("DOUBLE LETTERS: " + doubleLettersResult);
        // ~~~~~~~~~~~~~~~~~~~~~~~~~~~ DOUBLE LETTERS ~~~~~~~~~~~~~~~~~~~~~~~~~~~

        // ~~~~~~~~~~~~~~~~~~~~~~~~~~~ INTERLEAVE ~~~~~~~~~~~~~~~~~~~~~~~~~~~
        char[] letters1 = {'a', 'c'};
        char[] letters2 = {'b', 'd'};
        ArrayList<Character> interleaveResult = interleave(letters1, letters2);
        System.out.println("INTERLEAVE: " + interleaveResult);
        // ~~~~~~~~~~~~~~~~~~~~~~~~~~~ INTERLEAVE ~~~~~~~~~~~~~~~~~~~~~~~~~~~

        // ~~~~~~~~~~~~~~~~~~~~~~~~~~~ CREATE RANGE ~~~~~~~~~~~~~~~~~~~~~~~~~~~
        int quantity = 5;
        String word = "hello";
        ArrayList<String> createRangeResult = createRange(quantity, word);
        System.out.println("CREATE RANGE: " + createRangeResult);
        // ~~~~~~~~~~~~~~~~~~~~~~~~~~~ CREATE RANGE ~~~~~~~~~~~~~~~~~~~~~~~~~~~

        // ~~~~~~~~~~~~~~~~~~~~~~~~~~~ FLIP ARRAY ~~~~~~~~~~~~~~~~~~~~~~~~~~~
        String[] wordList = {"Hello", "There", "Dude"};
        Map<String, Integer> flipArrayResult = flipArray(wordList);
        System.out.println("FLIP ARRAY: " + flipArrayResult);
        // ~~~~~~~~~~~~~~~~~~~~~~~~~~~ FLIP ARRAY ~~~~~~~~~~~~~~~~~~~~~~~~~~~

        // ~~~~~~~~~~~~~~~~~~~~~~~~~~~ ARRAYS TO OBJECT ~~~~~~~~~~~~~~~~~~~~~~~~~~~
        String[][] numberWordPairs = {{"2000", "Blue"}, {"2020", "Red"}, {"2010", "Green"}};
        Map<Integer, String> arraysToObjectResult = arraysToObject(numberWordPairs);
        System.out.println("ARRAYS TO OBJECT " + arraysToObjectResult);
        // ~~~~~~~~~~~~~~~~~~~~~~~~~~~ ARRAYS TO OBJECT ~~~~~~~~~~~~~~~~~~~~~~~~~~~

        // ~~~~~~~~~~~~~~~~~~~~~~~~~~~ REVERSE STRING ~~~~~~~~~~~~~~~~~~~~~~~~~~~
        String forwardString = "Hello";
        String reversedStringResult = reverseString(forwardString);
        System.out.println("REVERSE STRING: " + reversedStringResult);
        // ~~~~~~~~~~~~~~~~~~~~~~~~~~~ REVERSE STRING ~~~~~~~~~~~~~~~~~~~~~~~~~~~
    }


    /////////////////////// METHOD DECLARATIONS ////////////////////////


    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~ DOUBLE NUMBERS ~~~~~~~~~~~~~~~~~~~~~~~~~~~
    public static ArrayList<Integer> doubleNumbers(int[] arr){

        ArrayList<Integer> acc = new ArrayList<>();

        for (int i = 0; i < arr.length; i++){
            acc.add(arr[i] * 2);
        }
        return acc;
    }
    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~ DOUBLE NUMBERS ~~~~~~~~~~~~~~~~~~~~~~~~~~~

    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~ MULTIPLY NUMBERS ~~~~~~~~~~~~~~~~~~~~~~~~~~~
    public static ArrayList<Integer> multiplyNumbers(int[] arr, int multiplier){
        ArrayList<Integer> acc = new ArrayList<>();

        for (int i = 0; i < arr.length; i++){
            acc.add(arr[i] * multiplier);
        }
        return acc;
    }
    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~ MULTIPLY NUMBERS ~~~~~~~~~~~~~~~~~~~~~~~~~~~

    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~ DOUBLE LETTERS ~~~~~~~~~~~~~~~~~~~~~~~~~~~
    public static String doubleLetters(String string){
        String acc = "";

        for (int i = 0; i < string.length(); i++){
            acc += string.charAt(i);
            acc += string.charAt(i);
        }
        return acc;
    }
    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~ DOUBLE LETTERS ~~~~~~~~~~~~~~~~~~~~~~~~~~~

    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~ INTERLEAVE ~~~~~~~~~~~~~~~~~~~~~~~~~~~
    public static ArrayList<Character> interleave(char[] letters1, char[] letters2){
        ArrayList<Character> combinedChars = new ArrayList<>();

        for (int i = 0; i < letters1.length; i++){
            combinedChars.add(letters1[i]);
            combinedChars.add(letters2[i]);
        }

        return combinedChars;
    }
    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~ INTERLEAVE ~~~~~~~~~~~~~~~~~~~~~~~~~~~

    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~ CREATE RANGE ~~~~~~~~~~~~~~~~~~~~~~~~~~~
    public static ArrayList<String> createRange(int quantity, String word){
        ArrayList<String> repeatedWords = new ArrayList<>();

        for (int i = 0; i < quantity; i++){
            repeatedWords.add(word);
        }

        return repeatedWords;
    }
    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~ CREATE RANGE ~~~~~~~~~~~~~~~~~~~~~~~~~~~

    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~ FLIP ARRAY ~~~~~~~~~~~~~~~~~~~~~~~~~~~
    public static Map<String, Integer> flipArray(String[] wordList){
        Map<String, Integer> wordIndices = new HashMap<>();

        for(int i = 0; i < wordList.length; i++){
            wordIndices.put(wordList[i], i);
        }
        return wordIndices;
    }
    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~ FLIP ARRAY ~~~~~~~~~~~~~~~~~~~~~~~~~~~

    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~ ARRAYS TO OBJECT ~~~~~~~~~~~~~~~~~~~~~~~~~~~
    public static HashMap<Integer, String> arraysToObject(String[][] arrayOfPairs){

        HashMap<Integer, String> newObject = new HashMap<>();

        for(int i = 0; i < arrayOfPairs.length; i++){
            int numberVersion = parseInt(arrayOfPairs[i][0]);
            newObject.put(numberVersion, arrayOfPairs[i][1]);
        }

        return newObject;
    }
    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~ ARRAYS TO OBJECT ~~~~~~~~~~~~~~~~~~~~~~~~~~~

    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~ REVERSE STRING ~~~~~~~~~~~~~~~~~~~~~~~~~~~
    public static String reverseString(String string){
        String reversedString = "";

        for(int i = string.length()-1; i >= 0; i--){
            reversedString += string.charAt(i);
        }

        return reversedString;
    }
    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~ REVERSE STRING ~~~~~~~~~~~~~~~~~~~~~~~~~~~
}
