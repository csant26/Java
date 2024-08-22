public class longestWord {
    public static String ReturnLongestWord(String[] arrStrings){
        String maxString = arrStrings[0];
        for (String string : arrStrings) {
            if(string.length()>maxString.length()){
                maxString=string;
            }
        }
        return maxString;
    }
    public static void main(String[] args) throws Exception{
        System.out.println(ReturnLongestWord(new String[] {"sun","moon","stars","galaxy"}));
    }
}
