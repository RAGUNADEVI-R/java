import java.util.Scanner;

public class Sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        int j = n - 1,m=0;
        int ans[]=new int[n];
        for (int k = 0; k < n; k++) {
            a[k] = sc.nextInt();
        }
        for(int i=0;i<n&&j>=0;i++,j--) {
            if (i < j) {
                ans[m++] = a[j];
                ans[m++] = a[i];
            }
        }
        if(n%2!=0){
            ans[n-1]=a[n/2];
        }
        for(int l=0;l<n;l++){
            System.out.print(ans[l]+" ");
        }
    }
}
