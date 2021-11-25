public class switches {
    public static void main(String[] args) {
        String name = "Harry";

        switch(name) {
            case "Harry":
                System.out.println("chosen one");
            default:
                System.out.println("who?");
        }

        switch(name) {
            case "Harry":
                System.out.println("chosen one");
            break;
            default:
                System.out.println("who?");
        }
    }
}
