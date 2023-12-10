public class C1 {
    public static int even(int[] array){
        int result = 0;
        for (int value: array){
            if (value%2==0) {
                result++;
            }
        }
        return result;
    }

    public static int[] reverse(int[] array){
        int[] result = new int[array.length];
        for (int i=0;i<array.length;i++){
            result[i]=array[array.length-1-i];
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr1 = {22,33,44,55};
        System.out.println(even(arr1)); //2
        int[] ar = reverse(arr1);
        for (int value : ar){
            System.out.println(value);
        }
    }
}
