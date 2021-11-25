public class ifStatement {
    public static void main(String[] args) {
        int hour = 2;

        if (hour > 22) {
            System.out.println("Sleep");
        }
        else if (hour > 23) {
            System.out.println("wrong!");
        }
        else  {
            System.out.println("party time");
        }
    }
}
