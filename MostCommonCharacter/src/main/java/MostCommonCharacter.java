
public class MostCommonCharacter {
    /**
     * Find the most common character in str.
     * You could use a HashMap that maps a Character key to an Int value to represent how many times a Character has
     * been spotted.
     * @param str A String.
     * @return the most common character within str.
     */
    public char recurringChar(String str) {
        int stringLength = str.length();
        int charCount[] = new int[200];
        int mostCount = 0;
        char finalResult =' ';

        for (int i=0; i<stringLength; i++){
            charCount[str.charAt(i)]++;

        }

        for (int i=0; i<stringLength;i++){
            if(mostCount <charCount[str.charAt(i)]){
                mostCount = charCount[str.charAt(i)];
                finalResult = str.charAt(i);
            }
        }
        return finalResult;
    }
}
