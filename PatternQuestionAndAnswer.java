public class PatternQuestionAndAnswer {

    public static void main(String[] args) {

        pattern1();
        System.out.println();

        pattern2();
        System.out.println();

        pattern3();
        System.out.println();

        pattern4();
        System.out.println();

        pattern5();
    }

    // Pattern 1
    public static void pattern1() {
        int rows = 9;

        for (int i = 1; i <= rows; i++) {

            if (i == 1 || i == rows) {
                System.out.println("*");
            } 
            else if (i == 2 || i == rows - 1) {
                System.out.println("**");
            } 
            else {
                System.out.println("* *");
            }
        }
    }

   
    public static void pattern2() {
        int n = 5;

        for (int i = 1; i <= n; i++) {

            // print spaces
            for (int s = 1; s <= (n - i) * 2; s++) {
                System.out.print(" ");
            }

            // ascending numbers
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }

            // descending numbers
            for (int j = i - 1; j >= 1; j--) {
                System.out.print(j + " ");
            }

            System.out.println();
        }
    }



    // Pattern 3
    public static void pattern3() {
        int rows = 6;

        for (int i = 1; i <= rows; i++) {
            String line = "";

            for (int j = 1; j <= i; j++) {
                if ((i + j) % 2 == 0) {
                    line += "1 ";
                } else {
                    line += "0 ";
                }
            }

            System.out.println(line.trim());
        }
    }

    // Pattern 4
    public static void pattern4() {
        int n = 4;
        int size = 2 * n - 1;

        for (int i = 0; i < size; i++) {
            String row = "";

            for (int j = 0; j < size; j++) {

                int top = i;
                int left = j;
                int right = size - 1 - j;
                int bottom = size - 1 - i;

                int min = Math.min(Math.min(top, bottom), Math.min(left, right));
                row += (n - min) + " ";
            }

            System.out.println(row.trim());
        }
    }

    // Pattern 5
    public static void pattern5() {
        int count = 1;
        int rows = 5;

        for (int i = 1; i <= rows; i++) {
            String rowOutput = "";

            for (int j = 1; j <= i; j++) {
                rowOutput += count + " ";
                count++;
            }

            System.out.println(rowOutput.trim());
        }
    }

}
