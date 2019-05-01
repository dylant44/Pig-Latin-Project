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
        System.out.println("Origginal Word(s): " + userInput);
        System.out.println("Translation: " + output + "\n");
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
            return lowerCaseWord + "yay";
        }else {
            String a = lowerCaseWord.substring(pos);
            String b = lowerCaseWord.substring(0, pos);
            return a + b + "ay";
        }

    }
    public static Boolean isVowel(char ch){
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch== 'o' || ch == 'u' || ch == 'y'){

            return true;
        }
        return false;
    }

}



