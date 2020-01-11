import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
        System.out.println("DOUBLE LETTERS : " + doubleLettersResult);
        // ~~~~~~~~~~~~~~~~~~~~~~~~~~~ DOUBLE LETTERS ~~~~~~~~~~~~~~~~~~~~~~~~~~~
    }

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


}
