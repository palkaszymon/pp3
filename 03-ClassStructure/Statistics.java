public class Statistics {
    public static int ItemsInRange(int a, int b){
        int count = 0;
        for(int i = a; i<=b; i++){
            count++;
        }return count;
    }
    public static int SumOfNumbers(int a, int b){
        int sum = 0;
        for(int i = a; i<=b; i++){
            sum+=i;
        }return sum;
    }
    public static int MeanOfNumbers(int a, int b){
        int sum = 0;
        int count = 0;
        for(int i = a; i<=b; i++){
            sum+=i;
            count++;
        }return sum/count;
    }
    public static void main(String[] args){
        System.out.println(ItemsInRange(5, 10));
        System.out.println(SumOfNumbers(5, 10));
        System.out.println(MeanOfNumbers(5, 10));
    }
}