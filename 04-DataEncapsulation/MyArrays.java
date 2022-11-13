public class MyArrays {
    static int even(int[] array){
        int counter = 0;
        for(int item : array){
            if(item%2 == 0){
                counter++;
            }
        }
        return counter;
    }
    static int positiveOdd(int[] array){
        int counter = 0;
        for(int item : array){
            if(item%2 != 0 && item>0){
                counter++;
            }
        }
        return counter;
    }

    public static void main(String[] args) {
        System.out.println(MyArrays.even(new int[]{2,-6,5,8}));
        System.out.println(MyArrays.positiveOdd(new int[]{3,2,-5,4,1,-7}));
    }
}
