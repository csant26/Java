//Write a function that accepts an array of non-negative integers and returns the second largest in the array. Return -1 if there is no second largest.

public class arraynonneg {
    public static void main(String[] args) throws Exception{
        System.out.println(a1(new int[] {1}));
        System.out.println(a1(new int[] {1,1}));
        System.out.println(a1(new int[] {1,2}));
        System.out.println(a1(new int[] {1,2,3,4,5}));
    }
    public static int a1(int[] nums){
        if(nums == null || nums.length<2){
            return -1;
        }
        int largest = -1, secondLargest = -1;
        for(int num:nums){
            if(num>largest){
                secondLargest = largest;
                largest = num;
            }else if(num>secondLargest && num != largest){
                secondLargest=num;
            }
        }
        return secondLargest==-1 ? -1 : secondLargest;
    }
}
