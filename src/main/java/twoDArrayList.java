import java.lang.reflect.Array;
import java.util.ArrayList;

public class twoDArrayList {
    public static void main(String[] args) {

        ArrayList<String> letters = new ArrayList<>();
        letters.add("a");
        letters.add("b");

        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(1); // autoboxing
        nums.add(2);

        ArrayList<ArrayList> mixed = new ArrayList<>();
        mixed.add(letters);
        mixed.add(nums);

        System.out.println(mixed);
    }
}
