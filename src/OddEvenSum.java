// Write a function that takes an array of integers as an argument and returns a value based on the sums of the even and odd numbers in the array. Let x= sum of odd numbers and y= sum of even numbers. function should return x-y.

public class OddEvenSum {
    public static int OddEven(int[] arr){
        int sumOdd = 0, sumEven=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                sumEven = sumEven + arr[i];
            }else{
                sumOdd = sumOdd + arr[i];
            }
        }
        return (sumOdd-sumEven);
    }
    public static void main(String[] args) throws Exception{
        System.out.println(OddEven(new int[] {1,2}));
        System.out.println(OddEven(new int[] {1,2,3}));
        System.out.println(OddEven(new int[] {1,2,3,4}));
        System.out.println(OddEven(new int[] {1,2,3,4,5}));
    }
}

