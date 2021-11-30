public class array {
    public static void main(String[] args) {
        String[] fruits = {"apple", "pear", "orange"};

//        array with fixed length
        int[] nums = new int[3];
//        have to add elements one by one
        nums[0] = 0;
        nums[1] = 1;
        nums[2] = 2;

        for (int i : nums) {
            System.out.println(i);
        }

        for (String x: fruits) {
            System.out.println(x);
        }

        for (int i: nums) {
            System.out.println(i + " " + fruits[i]);
        }
    }
}
