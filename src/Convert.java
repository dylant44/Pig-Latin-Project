public class Convert
{
    public static String conversion(String word)
    {
        String convertedWord  = null;
        String tempString = null;
        String firstLetter = word.substring(0,0);
        tempString = word.substring(0, 0) + word.substring(0, word.length() - 1);
        convertedWord = tempString + firstLetter + "ay";



        return convertedWord;
    }
}
