public class countOccurence {
    public static void ReturnCount(String[] arrStrings){
        int[] count = new int[arrStrings.length];
        boolean[] hasOccured = new boolean[arrStrings.length];
        for(int i = 0;i<arrStrings.length;i++){
            hasOccured[i]=false;
        }
        for(int i = 0;i<arrStrings.length;i++){
            count[i] = 1;
            for(int j = i+1;j<arrStrings.length;j++){
                if(arrStrings[i]==arrStrings[j] && hasOccured[i]==false){
                    count[i] = count[i]+1;
                    hasOccured[j] = true;
                }
            }
        }
        for(int i = 0;i<arrStrings.length;i++){
            if(hasOccured[i]==false){
                System.out.println("Occurence of" + arrStrings[i]+":"+count[i]);
            }
        }
    }
    public static void main(String[] args) throws Exception{
        ReturnCount(new String[] {"apple", "banana", "apple", "orange", "banana", "apple"});
    }
}
