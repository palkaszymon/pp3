import java.util.*;

public class Numbers {
    private int one,two,three,four,five;

    public Numbers(int one, int two, int three, int four, int five){
        this.one = one;
        this.two = two;
        this.three = three;
        this.four = four;
        this.five = five;
    }

    public boolean different(){
        int[] arr = {this.one, this.two, this.three, this.four, this.five};
        Set<Integer> set = new HashSet<Integer>();
        for(int item : arr){
            if(set.add(item) == false){
                return false;
            }
        }return true;

    }
    public static void main(String[] args) {
        Numbers test = new Numbers(9, 7, 4, 3, 7);
        System.out.println(test.different());
    }
}
