import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int strNum = scanner.nextInt();
        scanner.nextLine();
        int[][] array = new int[strNum][2];
        int sum;
        for (int i = 0; i < strNum; i++) {
            for (int j = 0; j < 2; j++) {
                array[i][j] = scanner.nextInt();
            }
            sum = array[i][0] + array[i][1];
            System.out.println(sum + " ");
        }
    }
}