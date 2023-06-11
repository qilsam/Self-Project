import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sentence or paragraph: ");
        String sentence = scanner.nextLine();

        countChars charsCounter = new countChars();
        countWords wordsCounter = new countWords();

        System.out.println("Number of characters: " + charsCounter.countChars(sentence));
        System.out.println("Number of words: " + wordsCounter.countWords(sentence));


    }
}