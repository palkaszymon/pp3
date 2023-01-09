import java.util.Set;
import java.util.HashSet;

public class Isogram {
    public static boolean isogram(String s){
        Set<Character> s1 = new HashSet<Character>();
        for(char c : s.toCharArray()){
            if(s1.add(c) == false){
                return false;
            }
        }return true;
    }
    public static void main(String[] args) {
        System.out.println(Isogram.isogram("BLUE water"));
    }
}
