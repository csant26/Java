public class shortestWord {
    public static String ReturnShortestWord(String[] arrStrings){
        String minString = arrStrings[0];
        for (String string : arrStrings) {
            if(string.length()<minString.length()){
                minString=string;
            }
        }
        return minString;
    }
    public static void main(String[] args) throws Exception{
        System.out.println(ReturnShortestWord(new String[] {"apple","banana","cat","orange"}));
    }
}
