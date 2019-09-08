package MathProblems;

public class MakePyramid {

    /*   Implement a large Pyramid of stars in the screen with java.
     *
     * *
     * * *
     * * * *
     * * * * *
     * * * * * *
     */
    public static void main(String[] args) {

        System.out.println("Piramid in java:");

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 10 - i; j++) {
                System.out.print(" ");
            }
            for (int n = 0; n <= i; n++) {
                System.out.print(" *");
            }
            System.out.println("");
        }
    }
}

