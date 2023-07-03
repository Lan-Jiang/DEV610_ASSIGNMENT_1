public class ch2ex18_ForLoopTable {

    public static void main(String[] args) {

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print("+");
                for (int k = 0; k < 10; k++) {
                    System.out.print("=");
                }
            }
            System.out.println("+");

            for (int k = 0; k < 3; k++) {
                System.out.print("|");
                for (int j = 0; j < 2; j++) {
                    for (int l = 0; l < 10; l++) {
                        System.out.print(" ");
                    }
                    System.out.print("|");
                }
                System.out.println();
            }
        }

        for (int j = 0; j < 2; j++) {
            System.out.print("+");
            for (int k = 0; k < 10; k++) {
                System.out.print("=");
            }
        }
        System.out.println("+");
    }

}
