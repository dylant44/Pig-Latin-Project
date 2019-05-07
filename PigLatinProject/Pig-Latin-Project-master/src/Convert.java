import javax.xml.crypto.Data;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Convert
{
    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args){
        System.out.print("Enter one or more words that you would like to translate to Pig Latin: ");
        final String userInput = scan.nextLine();
        scan.close();

        String[] word = userInput.split(" ");
        String output = "";
        for(int i = 0; i < word.length; i++){
            String pigLatinWord = translateWord(word[i]);
            output += pigLatinWord + " ";
        }
        System.out.println("Original Word(s): " + userInput);
        System.out.println("Translation: " + output + "\n");

        wordBank();
    }

    public static String translateWord(String word){
        String lowerCaseWord = word.toLowerCase();
        int pos = -1;
        char ch;

        for(int i = 0; i < lowerCaseWord.length(); i++){
            ch = lowerCaseWord.charAt(i);

            if (isVowel(ch)){
                pos = i;
                break;
            }
        }
        if(pos == 0){
            WriteFile.saveWords(lowerCaseWord + "yay");
            return lowerCaseWord + "yay";
        }else {
            String a = lowerCaseWord.substring(pos);
            String b = lowerCaseWord.substring(0, pos);
            WriteFile.saveWords(a + b + "ay");
            return a + b + "ay";
        }

    }
    public static Boolean isVowel(char ch){
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch== 'o' || ch == 'u' || ch == 'y'){
            return true;
        }
        return false;
    }

    public static void wordBank()
    {
        try
        {
            System.out.println("Translated Words: " + ReadFile.readFile());
        }
        catch (FileNotFoundException e)
        {
            System.out.println("No words in word bank.");
            //figure out how to print the word bank
        }
    }

}
