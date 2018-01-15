import java.util.ArrayList;
import java.util.Scanner;

public class FindingIndex {

    public static void main(String[] args) {

        String oneWord;
        String oneLetter;

        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter a word:\n ");
        oneWord = keyboard.nextLine();

        Scanner keyboard2 = new Scanner(System.in);
        System.out.print("Enter a letter:\n ");
        oneLetter = keyboard2.nextLine();

        System.out.println("List of indexes where the letter given is present in the word: " + indexHunter(oneWord, oneLetter) );
    }

    public static ArrayList indexHunter(String oneWord, String oneLetter) {

        ArrayList<Integer> result = new ArrayList<>();

        for (int i = 0; i < oneWord.length(); i++) {
            if (oneWord.charAt(i) == oneLetter.charAt(0)) {
                result.add(i);
            } else {
            }
        }return result;
    }
}

// Create a function that takes a string and a letter, than returns a list that contains all the indexes where the letter occured in the string.