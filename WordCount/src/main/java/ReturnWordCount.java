
public class ReturnWordCount {
    /**
     * @param in A String representing a sentence, with words delineated by spaces.
     * @return return the amount of words in a string.
     */
    public int count(String in){
        int count =1;
        int finalCount =0;
        
        for (int i=0; i<in.length(); i++){
            if(!(in.isEmpty()) && in.length()==1){
                finalCount=1;
            }

            else if (in.charAt(i)==' '){
                finalCount = 1+count++;
            }

        }
        return finalCount;
    }
}
