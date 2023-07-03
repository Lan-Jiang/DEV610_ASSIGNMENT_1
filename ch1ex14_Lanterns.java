

public class ch1ex14_Lanterns {
    public static void main(String[] args) {
        printTop();
        System.out.println();
        printTop();
        printBody();
        printBottom();
        printTop();
        System.out.println();
        printTop();
        printBottom2();
        printBody();
        printBody();
        printBottom2();
        printBottom2();

    }

    public static void printTop() {
        System.out.println("    *****");
        System.out.println("  *********");
        System.out.println("*************");
    }

    public static void printBody() {
        System.out.println("* | | | | | *");
    }
    public static void printBottom() {
        System.out.println("*************");
    }

    public static void printBottom2() {
        System.out.println("    *****");
    }

}
