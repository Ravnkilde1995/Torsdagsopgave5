import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    static Scanner scan;
    private static String[] text;

    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("cph-1st-w9-main/data.txt");
        scan = new Scanner(file);

        String inputFromFile = "";

        while (scan.hasNextLine()) {                               // checks if theres more lines in the file
            inputFromFile += scan.nextLine();                     // adds each line to the inputFromFile string.
        }

        text = inputFromFile.split(" ");                   // Creates and array of strings, where each element is a single word from the file.
        System.out.println(text.length);

        printWordsStartingWith("Ø");
        printWordsOfLength(3);

        //test dine metoder ved a
        findLongestWords();
        printWordsWithLessThanTwoVocals();
        printFirstHalfOfEachWord();
        printMostFrequentLetter();


    }

    private static void printWordsOfLength(int l) {
        boolean wordisvalid = true;

        for (String s : text) {
            if (s.length() == l) {
                if (s.contains(",") || s.contains(".")) {
                    wordisvalid = false;
                }

                if (wordisvalid) {
                    System.out.println(s);
                }
            }
        }
    }

    private static void printWordsStartingWith(String pattern) {
        for (String s : text) // for each word in text{
            if (s.startsWith(pattern) || s.startsWith(pattern.toLowerCase())) {
                System.out.println(s);
            }
    }


    //skriv dine metoder herunder:

    /*public static void printLongestWord(){
    int count = 0;
    String text = "";
    for(int i = 0; i<0;i++){

    } */


    public static String findLongestWords() throws FileNotFoundException {

        String longest_word = "";
        String current;

        Scanner scan = new Scanner(new File("cph-1st-w9-main/data.txt"));


        while (scan.hasNext()) {
            current = scan.next();
            if (current.length() > longest_word.length()) {
                longest_word = current;
            }

        }
        System.out.println("\n" + longest_word + "\n");
        return longest_word;
    }

    public static void printWordsWithLessThanTwoVocals() throws FileNotFoundException {
        Scanner scan = new Scanner(new File("cph-1st-w9-main/data.txt"));
        while (scan.hasNext()) {
            String current = scan.next();
            int count = 0;

            for (int i = 0; i < current.length(); i++) {
                if (current.charAt(i) == 'a' || current.charAt(i) == 'e' ||
                        current.charAt(i) == 'i' || current.charAt(i) == 'o' ||
                        current.charAt(i) == 'u' || current.charAt(i) == 'æ' ||
                        current.charAt(i) == 'ø' || current.charAt(i) == 'å' || current.charAt(i) == 'A' ||
                        current.charAt(i) == 'E' || current.charAt(i) == 'I' || current.charAt(i) == 'O' ||
                        current.charAt(i) == 'U' || current.charAt(i) == 'Æ' || current.charAt(i) == 'Ø' ||
                        current.charAt(i) == 'Å') {

                    count++;
                }

            }
            if (count <= 2) {
                System.out.println("Total no of vowels in string: " + current + " " + count);
            }


        }
    }

    public static void printFirstHalfOfEachWord() throws FileNotFoundException {
        Scanner scan = new Scanner(new File("cph-1st-w9-main/data.txt"));
        while (scan.hasNext()) {
            String current = scan.next();
            System.out.println(current.substring(0, current.length() / 2));
        }
    }

    public static void printMostFrequentLetter()throws FileNotFoundException {
        Scanner scan = new Scanner(new File("cph-1st-w9-main/data.txt"));

        while (scan.hasNext()) {
            String current = scan.next();

            int[] freq = new int[current.length()];
            char minChar = current.charAt(0), maxChar = current.charAt(0);
            int i, j, min, max;
            char string[] = current.toCharArray();
            for (i = 0; i < string.length; i++) {
                freq[i] = 1;
                for (j = i + 1; j < string.length; j++) {
                    if (string[i] == string[j] && string[i] != ' ' && string[i] != '0') {
                        freq[i]++;

                        string[j] = '0';
                    }
                }
            }
            min = max = freq[0];
            for (i = 0; i < freq.length; i++) {
                if (min > freq[i] && freq[i] != '0') {
                    min = freq[i];
                    minChar = string[i];
                }
                if (max < freq[i]) {
                    max = freq[i];
                    maxChar = string[i];
                }
            }
            System.out.println("Minimum occurring character in word: " +current +" minimum character: " + minChar);
            System.out.println("Maximum occurring character in word: " +current +" maximum character: " + maxChar);
        }
    }

}






