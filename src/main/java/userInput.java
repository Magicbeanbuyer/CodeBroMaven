import java.util.Scanner;

public class userInput {
//    psvm + tab
    public static void main(String[] args) {
//        create a Scanner object from Scanner class
        Scanner scanner = new Scanner(System.in);
//        sout + tab
        System.out.println("What's your problem?");
        String prob = scanner.nextLine();
        System.out.println(prob);

        System.out.println("Age?");
        int age = scanner.nextInt();
        System.out.println(age);
    }
}
