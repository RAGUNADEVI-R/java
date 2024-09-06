import java.util.Scanner;

public class Cruise {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int entering[]=new int[n];
        int leaving[]=new int[n];
        int ans[]=new int[n];
        for(int i=0;i<n;i++){
             entering[i]=sc.nextInt();
            leaving[i]=sc.nextInt();
        }int max=Integer.MIN_VALUE;
        for(int i=0;i<n-1;i++){
            ans[i]=entering[i]-leaving[i];
            entering[i+1]+=ans[i];
            if (max < ans[i]) max = ans[i];
        }

//        for(int i=0;i<n;i++) {
//            if (max < ans[i]) max = ans[i];
//        }
System.out.print(max);
    }
}
