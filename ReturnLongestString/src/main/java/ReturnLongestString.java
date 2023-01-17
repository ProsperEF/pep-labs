
public class ReturnLongestString {
    /**
     * Return the longest String out of arr.
     * Remember that you can get the length of String with str.length().
     *
     * @param arr an array of Strings.
     * @return the longest String within arr. You can assume that there are no ties for the longest string.
     */
    public String longest(String[] arr){
        int position = 0;
        int len =0;

        for(int i = 0; i<arr.length; i++){
            if(arr[i].length()>len){
                position =i;
                len=arr[i].length();
            }
        }
        return arr[position];
    }
}
