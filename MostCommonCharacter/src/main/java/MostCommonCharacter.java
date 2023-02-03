import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MostCommonCharacter {
    /**
     * Find the most common character in str.
     * You could use a HashMap that maps a Character key to an Int value to represent how many times a Character has
     * been spotted.
     * @param str A String.
     * @return the most common character within str.
     */
    public char recurringChar(String str) {
        int charCount[]= new int[200];
        char finalResult = ' ';

        char[] orderedChar = str.toCharArray();
        Arrays.sort(orderedChar);
        String sortedString = new String(orderedChar);

        List <Integer> charCountList = new ArrayList<Integer>();
        List <Character> charCountChar = new ArrayList<Character>();

        for (int i=0; i<str.length(); i++){
            charCount[sortedString.charAt(i)]++;
        }

        for (int i=0; i<str.length(); i++){
            char check1 = sortedString.charAt(i);
            char check2 = ' ';
            int count = i+1;

            if(count < str.length()){
                check2 = sortedString.charAt(i+1);
            }

            if (check1 != check2){
                charCountList.add(charCount[sortedString.charAt(i)]);
                charCountChar.add(sortedString.charAt(i));
            }
        }

        int max = Collections.max(charCountList);
        char min = ' ';

        for (int i=0; i<charCountList.size(); i++){
            if(charCountList.get(i)==max && charCountChar.get(i) <min){
                min = charCountChar.get(i);
                finalResult = min;
            }
            else{
                finalResult = charCountChar.get(charCountList.indexOf(max));
            }
        }

    
        return finalResult;
    }
}
