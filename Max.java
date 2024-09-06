import java.util.Scanner;
public class Max {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans=0;
        int a[] = new int[n];
        for (int k = 0; k < n; k++) {
            a[k] = sc.nextInt();
        }
        for(int i=0;i<n;i++){
            int sum=0,mul=1;
            while(a[i]!=0){
                int rem=a[i]%10;
                 sum+=rem;
                 mul*=rem;
                a[i]/=10;
            }
            ans=sum>mul?sum:mul;
            System.out.print(ans+" ");
        }
    }
}
