public class C4 {
    public static int even(int[] array){
        int count=0;
        for(int value: array){
            if (value%2==0) {
                count++;
            }
        }
        return count;
    }

    public static int positiveOdd(int[] array){
        int count = 0;
        for (int value: array){
            if (value%2!=0 && value>0) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr1 = {2,-6,5,8,0};
        int[] arr2 = {3,2,-5,4,1,-7,0};
        System.out.println(C4.even(arr1));
        System.out.println(C4.positiveOdd(arr2));  

    }
}
