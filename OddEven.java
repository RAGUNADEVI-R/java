import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=0,l=1;
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print(l+" ");
                l+=2;
            }
            l=l-1;
            System.out.println();
        }
    }
}
