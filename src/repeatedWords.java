public class repeatedWords {
    public static void Repeated(String[] arrStrings){
        boolean[] isRepeated = new boolean[arrStrings.length];
        boolean[] alrOccured = new boolean[arrStrings.length];
        for(int i = 0;i<arrStrings.length;i++){
            isRepeated[i]=false;
            alrOccured[i]=false;
        }
        for(int i = 0;i<arrStrings.length;i++){
            for(int j = i+1;j<arrStrings.length;j++){
                if(arrStrings[i]==arrStrings[j] && alrOccured[i]==false){
                    isRepeated[i] = true;
                    isRepeated[j] = true;
                    alrOccured[j] = true;
                }
            }
        }
        System.out.println("Repeated words:");
        for(int i = 0;i<arrStrings.length;i++){
            if(isRepeated[i]==true&&alrOccured[i]==false){
                System.out.println(arrStrings[i]);
            }
        }
        System.out.println("Non-repeated words:");
        for(int i = 0;i<arrStrings.length;i++){
            if(isRepeated[i]==false){
                System.out.println(arrStrings[i]);
            }
        }
        System.out.println("After removing repeated words:");
        for(int i = 0;i<arrStrings.length;i++){
            if(alrOccured[i]==false){
                System.out.println(arrStrings[i]);
            }
        }

    }
    public static void main(String[] args) throws Exception{
        Repeated(new String[] {"a", "b", "c", "a", "a", "d", "c", "f"});
    }
}
