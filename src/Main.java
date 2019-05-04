import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int strNum = scanner.nextInt();
        int [] arrayA = new int[strNum];
        int [] arrayB = new int[strNum];
        for (int i = 0; i < strNum; i++){
            arrayA[i] = scanner.nextInt();}
        for (int j = 0; j < strNum; j++){
            arrayB[j] = scanner.nextInt();}
        /*int[] r = new int[arrayA.length + arrayB.length];
        System.arraycopy(arrayA, 0, r, 0, arrayA.length);
        System.arraycopy(arrayB, 0, r, arrayB.length, arrayB.length);
        String intArrayString = Arrays.toString(r);
        System.out.println(intArrayString);*/
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 2; j++) {
                int [] sum = arrayA[i]+ arrayB[j];}
    }
    }
}
