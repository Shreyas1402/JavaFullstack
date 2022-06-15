package controlflowstatements;

public class ForLoopEx {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {

            for (int j = 0; j < 5; j++) {
                System.out.println(i + " " + j);
            }
        }

        for (int i = 3; i > 0; i--) {
            for (int j = 3; j > 0; j--) {
                System.out.println(i + " " + j);
            }
        }

        int a[] = {5, 10, 15, 25};
        for (int no : a) {
            System.out.println(no);
        }
    }
}
