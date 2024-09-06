import java.util.Scanner;
public class Basic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int l = 0;
        int n[] = new int[5];
        char a[] = new char[5];
        for (int i = 0; i < s.length(); i++) {
            int x=s.charAt(i);
            if (x <97 ) {
                int num = x - '0';
                n[l] = num;
                a[l] = s.charAt(i+1);
                l++;
            }
        }
        int p = 0;
        for (int k = 0; k < 3; k++,p++) {
            for (int j = 0; j < n[k]; j++) {
                System.out.print(a[p]);
            }
        }
    }
}

//ip: a7b4c8
//op: aaaaaaabbbbcccccccc