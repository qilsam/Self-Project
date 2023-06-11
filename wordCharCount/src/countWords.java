public class countWords
{
    public static int countWords(String sentence)
    {
        String[] words = sentence.trim().split("\\s+");
        return words.length;
    }
}
