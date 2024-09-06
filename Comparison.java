import java.util.Scanner;

public class Comparison {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        int b[] = new int[n];
        int res[] = new int[2];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            if (a[i] < b[i]) {
                res[1]++;
            } else {
                res[0]++;
            }
        }
        for (int i = 0; i < 2; i++) {
            System.out.print(res[i]);
        }

    }
}